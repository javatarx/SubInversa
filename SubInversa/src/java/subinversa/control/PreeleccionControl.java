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
import subinversa.modelo.Clientes;
import subinversa.modelo.Preeleccion;
import subinversa.modelo.Publiserv;
import subinversa.servicio.PreeleccionServImpl;
import subinversa.servicio.PreeleccionServInterface;
import subinversa.servicio.SubInversaServImpl;
import subinversa.servicio.SubInversaServInterface;

/**
 *
 * @author pacifi
 */
@WebServlet(name = "PreeleccionControl", urlPatterns = {"/PreeleccionControl"})
public class PreeleccionControl extends HttpServlet {

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
        PreeleccionServInterface servPre;
        switch (opc) {
            case 0: {
                break;
            }
            case 1: {

                break;
            }
            case 2: {
                Clientes toCli = null;
                Publiserv toPubl = null;

                toCli = (Clientes) request.getSession().getAttribute("_sessionCliente");
                toPubl = (Publiserv) request.getSession().getAttribute("_toPublish");
                Preeleccion toPre = new Preeleccion();
                toPre.setIdCli(toCli);
                toPre.setIdps(toPubl);
                toPre.setTipoAceptacion("1");
                try {
                    servPre = new PreeleccionServImpl();
                    servPre.insertPreeleccion(toPre);
                    SubInversaServInterface subInvServ = new SubInversaServImpl();
                    request.getSession().setAttribute("_listaSubInv", subInvServ.buscaSubInvIdPublish(toPubl.getIdps()));
                } catch (Exception e) {
                    System.err.println("Error al guardar" + e.getMessage());
                }
                response.sendRedirect("jsp/modulos/app/reporteSubInver.jsp");
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
