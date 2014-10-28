/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import subinversa.modelo.Publiserv;
import subinversa.servicio.PubliServImpl;
import subinversa.servicio.PubliServInterface;
import subinversa.servicio.SubInversaServImpl;
import subinversa.servicio.SubInversaServInterface;

/**
 *
 * @author pacifi
 */
@WebServlet(name = "PublicidadControl", urlPatterns = {"/PublicidadControl"})
public class PublicidadControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int opc = Integer.parseInt(request.getParameter("opc"));
        PubliServInterface publiServ;
        SubInversaServInterface subInvServ;
        System.out.println("llega");

        switch (opc) {
            case 0: {
                System.err.println("ñlakjsdjasldkjaskljsakl");
                publiServ = new PubliServImpl();
                int idPublish = Integer.parseInt(request.getParameter("id_publish"));
                request.getSession().setAttribute("_toPublish", publiServ.buscaIdPublicidad(idPublish));
                subInvServ = new SubInversaServImpl();
                request.getSession().setAttribute("_listaSubInv", subInvServ.buscaSubInvIdPublish(idPublish));
                response.sendRedirect("jsp/modulos/app/app.jsp");
                break;
            }
            case 1: {
                publiServ = new PubliServImpl();
                request.getSession().setAttribute("_listaServi", publiServ.ListaPubliTodo());
                response.sendRedirect("jsp/modulos/servicios/listaServicio.jsp");
                break;
            }
            case 2: {
                publiServ = new PubliServImpl();
                Publiserv to = new Publiserv();
                to.setSerie(Integer.parseInt(request.getParameter("serie")));
                to.setNameOferta(request.getParameter("numOferta"));
                to.setDescripcion(request.getParameter("descripcion"));
                to.setValoReferencial(Long.parseLong(request.getParameter("valoReferencial")));
                //to.setFechaInicial(request.getParameter("fecInicial"));

            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
