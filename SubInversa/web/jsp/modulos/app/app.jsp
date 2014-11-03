<%-- 
    Document   : app
    Created on : Oct 20, 2014, 10:17:32 AM
    Author     : pacifi
--%>

<%@page import="subinversa.servicio.PreeleccionServImpl"%>
<%@page import="subinversa.servicio.PreeleccionServInterface"%>
<%@page import="subinversa.modelo.Clientes"%>
<%@page import="subinversa.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="subinversa.modelo.Destinos" %>
<%@page import="subinversa.modelo.Publiserv" %>
<%@page import="subinversa.modelo.Preeleccion" %>
<%@page import="subinversa.modelo.Subinversa" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../../resources/Progressus/sb-admin/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="../../resources/Progressus/sb-admin/css/sb-admin.css" rel="stylesheet">
        <!-- Morris Charts CSS -->
        <link href="../../resources/Progressus/sb-admin/css/plugins/morris.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="../../resources/Progressus/sb-admin/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" href="../../resources/popup/demo.css">
        <script src="../../resources/mystyle/js/jquery-1.9.1.js"></script>
        <script src="../../resources/mystyle/js/app.js"></script>
    </head>
    <body>
        <%
            Publiserv toPublish = (Publiserv) request.getSession().getAttribute("_toPublish");
            Usuario toUser = (Usuario) request.getSession().getAttribute("_sessionUser");

            Clientes toCli = (Clientes) request.getSession().getAttribute("_sessionCliente");
            PreeleccionServInterface serv = new PreeleccionServImpl();

            int prueba = serv.listaPreeleccionCliePub(toCli.getIdCli(), toPublish.getIdps()).size();
        %>
        <table border="1">
            <tr>
                <th>Serie</th>
                <td><%=toPublish.getSerie()%></td>
            </tr>
            <tr>
                <th>Oferta</th>
                <td><%=toPublish.getNameOferta()%></td>
            </tr>
            <tr>
                <th>Detalle</th>
                <td><%=toPublish.getDescripcion()%></td>
            </tr>
            <tr>
                <th>Precio Preferencial</th><th>Fecha Inicio</th><th>Fecha Fin</th>
            </tr>
            <tr>
                <td><%=toPublish.getValoReferencial()%></td>
                <td><%=toPublish.getFechaInicial()%></td>
                <td><%=toPublish.getFechaFinal()%></td>
            </tr>
            <tr>
                <td>
                    <%
                        if (prueba == 0) {
                    %> 
                    <button onclick="participar()" id="participar"> Participar</button>
                    <%
                    } else {
                    %>
                    <p>Parrafo else</p>

                    <% }%>
                    <input type="button" value="Pujar" onclick="agregarSub()" /></td>
            </tr>
        </table>


        <div id="reporteSubInver" style="display: none" >

        </div>

    </body>
</html>
