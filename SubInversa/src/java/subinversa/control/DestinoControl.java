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
import subinversa.modelo.Destinos;
import subinversa.servicio.DestinoServImpl;
import subinversa.servicio.DestinoServInterface;

/**
 *
 * @author pacifi
 */
@WebServlet(name = "DestinoControl", urlPatterns = {"/DestinoControl"})
public class DestinoControl extends HttpServlet {

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
        DestinoServInterface destinoServ;
        switch(opc){
                case 1:{
                    destinoServ = new DestinoServImpl();
                    request.getSession().setAttribute("_listaDestino", destinoServ.listaDestinosTodo());
                    response.sendRedirect("jsp/modulos/destinos/listaDestinos.jsp");
                    break;
                }
                case 2:{
                    destinoServ = new DestinoServImpl();
                    Destinos to = new Destinos();
                    to.setNombre(request.getParameter("nombre"));
                    to.setEstado(request.getParameter("estado"));
                    destinoServ.insertDestino(to);
                    
                    destinoServ = new DestinoServImpl();
                    request.getSession().setAttribute("_listaDestino", destinoServ.listaDestinosTodo());
                    response.sendRedirect("jsp/modulos/destinos/listaDestinos.jsp");
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
