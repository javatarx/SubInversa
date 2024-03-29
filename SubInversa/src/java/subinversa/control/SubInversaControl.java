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
import subinversa.modelo.Preeleccion;
import subinversa.modelo.Publiserv;
import subinversa.modelo.Subinversa;
import subinversa.servicio.PreeleccionServImpl;
import subinversa.servicio.PreeleccionServInterface;
import subinversa.servicio.SubInversaServImpl;
import subinversa.servicio.SubInversaServInterface;

/**
 *
 * @author pacifi
 */
@WebServlet(name = "SubInversaControl", urlPatterns = {"/SubInversaControl"})
public class SubInversaControl extends HttpServlet {

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
        System.out.println("Subasta Inversa");
        SubInversaServInterface servSubInversa;
        PreeleccionServInterface servPreele;

        switch (opc) {
            case 0: {
                //Ver Subasta Inversa 

                Publiserv toPubl = (Publiserv) request.getSession().getAttribute("_toPublish");
                servPreele = new PreeleccionServImpl();
                request.getSession().setAttribute("_listaPreeleccion", servPreele.listaPreeleccionPub(toPubl.getIdps()));

                response.sendRedirect("jsp/modulos/app/reporteSubInver.jsp");
                break;
            }

            case 1: {
                servSubInversa = new SubInversaServImpl();
                request.getSession().setAttribute("_listaSubInversa", servSubInversa.listaSubInversaTodo());
                response.sendRedirect("jsp/modulos/subinversa/subInversa.jsp");
                break;
            }
            case 2: {
                Preeleccion toPre = (Preeleccion) request.getSession().getAttribute("_preeleccion");
                Subinversa toSub = new Subinversa();
                toSub.setIdpre(toPre);
                toSub.setPuja(Double.parseDouble(request.getParameter("pujaSub")));
                toSub.setPuntaje(50);
                try {
                    servSubInversa = new SubInversaServImpl();
                    servSubInversa.insertaSubInversa(toSub);
                    servPreele = new PreeleccionServImpl();
                    request.getSession().setAttribute("_listaPreeleccion", servPreele.listaPreeleccionPub(toPre.getIdps().getIdps()));

                } catch (Exception e) {
                }
                response.sendRedirect("jsp/modulos/app/reporteSubInver.jsp");
            }
            case 10: {

                break;
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
