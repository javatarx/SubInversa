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
import subinversa.modelo.Usuario;
import subinversa.servicio.UsuarioServImpl;
import subinversa.servicio.UsuarioServInterface;

/**
 *
 * @author pacifi
 */
@WebServlet(name = "UsuarioControl", urlPatterns = {"/UsuarioControl"})
public class UsuarioControl extends HttpServlet {

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
        UsuarioServInterface usuarioServ;
        String username = request.getParameter("username") == null ? "" : request.getParameter("username");
        String password = request.getParameter("password") == null ? "" : request.getParameter("password");
        String result;
        switch (opc) {
            case 1: {
                System.out.println("listando user");
                usuarioServ = new UsuarioServImpl();
                request.getSession().setAttribute("_listaUsuario", usuarioServ.listaUsuarioTodo());
                response.sendRedirect("jsp/modulos/user/listaUser.jsp");
                break;
            }
            case 2: {
                usuarioServ = new UsuarioServImpl();
                Usuario to = new Usuario();
                to.setUser(request.getParameter("usuario"));
                to.setPass(request.getParameter("pass"));
                to.setEstado(request.getParameter("estado"));
                usuarioServ.insertUsuario(to);

                usuarioServ = new UsuarioServImpl();
                request.getSession().setAttribute("_listaUsuario", usuarioServ.listaUsuarioTodo());
                response.sendRedirect("jsp/modulos/user/listaUser.jsp");

                break;
            }
            case 6: {
                usuarioServ = new UsuarioServImpl();
                Usuario usu = null;

                if (usuarioServ.validarUsuarioExisteList(username).size() > 0) {
                    usu = usuarioServ.validarUsuarioExiste(username);
                    if (usu != null && usu.getUser().equals(username)) {

                        usu = usuarioServ.validarUsuarioExiste(username, password);
                        if (usu != null && usu.getUser().equals(username) && usu.getEstado().equals("1")) {
                            request.getSession().setAttribute("_sessionUser", usu);

                            System.err.println("Entro a logear son exito");
                            result = "5|Exito|" + "../frame/IndexFrameAdmin.jsp";
                        } else {
                            result = "2|Usted no tiene acceso a nuestro Sistema,Comuniquese con el Administrador|" + "index.jsp";
                        }
                        out.println(result);

                    } else {
                        request.getSession().setAttribute("Session", null);
                        result = "2|Usted no tiene acceso a nuestro Sistema,Comuniquese con el Administrador|";
                        out.println(result);
                    }

                } else {
                    request.getSession().setAttribute("Session", null);
                    result = "1|Usted. No esta  Registrado en nuestra base de datos, comuniquese con el Administrador!.|";
                    out.println(result);
                }

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
