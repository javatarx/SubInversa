<%-- 
    Document   : listaUser
    Created on : 16/10/2014, 03:09:48 AM
    Author     : Magwi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="subinversa.modelo.Usuario" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap Core CSS -->
        <link href="../../resources/Progressus/sb-admin/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="../../resources/Progressus/sb-admin/css/sb-admin.css" rel="stylesheet">
        <!-- Morris Charts CSS -->
        <link href="../../resources/Progressus/sb-admin/css/plugins/morris.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="../../resources/Progressus/sb-admin/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" href="../../resources/popup/demo.css">
    </head>
    <body>
        <input type="button" class="buttonn btn btn-info" data-type="zoomin" value="Agregar Usuarios"/>
        <br>
        <br>
        
        <div class="overlay-container">    
            <div class="window-container zoomin">
                <span class="close">Cerrar</span>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Registro Usuarios</h3>
                    </div>
                    <div class="panel-body">
                        <form action="../../../UsuarioControl">
                            <label>Usuario</label>
                            <input class="form-control" name="usuario" />
                            <label>Pass</label>
                            <input class="form-control" name="pass"/>
                            <label>Estado</label>
                            <input class="form-control" name="estado"/> <br>
                            <input type="hidden" name="opc" value="<%=2%>"/>
                            <input type="submit" class="btn btn-success"  />
                        </form>
                    </div>
                </div>
                
            </div>
        </div>



        <table class="table table-bordered table-hover table-striped">
            
            <tr>
                <th>Id</th>
                <th>User</th>
                <th>Pass</th>
                <th>Estado</th>
            </tr>
            <%
                List<Usuario> lista = null;
                lista = (List<Usuario>) request.getSession().getAttribute("_listaUsuario");
                if (lista != null) {
                    for (Usuario usuario : lista) {


            %>
            <tr>
                <td><%=usuario.getIdus()%></td>
                <td><%=usuario.getUser()%></td>
                <td><%=usuario.getPass()%></td>
                <td><%=usuario.getEstado()%></td>
            </tr>
            <%
                    }
                }
            %>
        </table>


        <script>!window.jQuery && document.write(unescape('%3Cscript src="../../resources/popup/jquery-1.7.1.min.js"%3E%3C/script%3E'))</script>
        <script type="text/javascript" src="../../resources/popup/demo.js"></script>
    </body>
</html>
