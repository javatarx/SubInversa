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
import subinversa.modelo.Tipousuario;
import subinversa.servicio.TipoUserServImpl;
import subinversa.servicio.TipoUserServInterface;

/**
 *
 * @author pacifi
 */
@WebServlet(name = "TipoEmpControl", urlPatterns = {"/TipoEmpControl"})
public class TipoUserControl extends HttpServlet {

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
        TipoUserServInterface tipoEmpServ;

        switch (opc) {
            case 1: {
                System.out.println("LLego al case 1 del Tipo Empresa");
                tipoEmpServ = new TipoUserServImpl();
                request.getSession().setAttribute("_listaTimpoEmpresa", tipoEmpServ.listaTipoUserTodo());
                response.sendRedirect("jsp/modulos/tipEmp/mainTipoEmp.jsp");
                break;
            }
            case 2: {
                tipoEmpServ = new TipoUserServImpl();
                Tipousuario to = new Tipousuario();
                to.setDescripcion(request.getParameter("descripcion"));
                to.setEstado(request.getParameter("estado"));
                to.setNombre(request.getParameter("nombre"));
                tipoEmpServ.insertTipoUserresa(to);

                tipoEmpServ = new TipoUserServImpl();
                request.getSession().setAttribute("_listaTimpoEmpresa", tipoEmpServ.listaTipoUserTodo());
                response.sendRedirect("jsp/modulos/tipEmp/mainTipoEmp.jsp");
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
