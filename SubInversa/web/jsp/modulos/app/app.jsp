<%-- 
    Document   : app
    Created on : Oct 20, 2014, 10:17:32 AM
    Author     : pacifi
--%>

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

    </head>
    <body>
        <%
            Publiserv toPublish = (Publiserv) request.getSession().getAttribute("_toPublish");
            List<Subinversa> lista = (List<Subinversa>) request.getSession().getAttribute("_listaSubInv");

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
                <td> Nueva Puja <input type="text" /> <input type="button"/></td>
            </tr>
        </table>

        <table> 
            <tr><th>
                    #
                </th>
                <th>
                    transportista
                </th>
                <th>
                    Prouesta
                </th>
                <th>Ronda 1</th>
                <th>Ronda 2</th>
                <th>Ronda 3</th>
                <th>Ronda 4</th>
            </tr>
            <%    if (lista != null) {
                    int i = 0;
                    for (Subinversa to : lista) {
            %>
            <tr>
                <td><%=i++%></td>
                <td><%=to.getIdpre().getIdCli().getRazonsocial()%></td>
                <td><%=to.getPropuesta()%></td>
                <td><%=to.getRonda1()%></td>
                <td><%=to.getRonda2()%></td>
                <td><%=to.getRonda3()%></td>
                <td><%=to.getRonda4()%></td>
            </tr>
            <%}
                }%>
        </table>

    </body>
</html>
