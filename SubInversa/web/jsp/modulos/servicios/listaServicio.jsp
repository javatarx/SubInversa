<%-- 
    Document   : listaServicio
    Created on : 16/10/2014, 03:43:43 PM
    Author     : Magwi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="subinversa.modelo.Publiserv"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../../resources/Progressus/sb-admin/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="../../resources/Progressus/sb-admin/css/sb-admin.css" rel="stylesheet">
    </head>
    <body>
        <table class="table table-bordered table-hover table-striped">
                    <thead>
                        <tr><h2>LISTA DE OFERTAS</h2></tr>
                        <tr>
                            <th>Serie</th>
                            <th>Nro Oferta</th>
                            <th>Cliente</th>
                            <th>Valor Refencial</th>
                            <th>Fecha Inicial</th>
                            <th>Valor Final</th>
                            <th>Ciudad Recogida</th>
                            <th>Ciudad Entrega</th>
                            <th>ID Destino</th>
                            <th>Estado</th>
                            <th>OPT</th>
                        </tr>
                    </thead>
                    <%
                        List<Publiserv> lista = null;
                        lista = (List<Publiserv>) request.getSession().getAttribute("_listaServi");
                        if (lista != null) {
                            for (Publiserv to : lista) {
                    %>
                    <tbody>
                        <tr>
                            <td><%=to.getSerie() %></td>
                            <td><%=to.getNameOferta() %></td>
                            <td><%=to.getIdCli().getRazonsocial() %></td>
                            <td><%=to.getValoReferencial() %></td>
                            <td><%=to.getFechaInicial() %></td>
                            <td><%=to.getFechaFinal() %></td>
                            <td><%=to.getRecogida() %></td>
                            <td><%=to.getEntrega() %></td>
                            <td><%=to.getIddest().getNombre() %></td>
                            <td><%=to.getEstado()%></td>
                            <td><a href="../../../PublicidadControl?opc=0&id_publish=<%=to.getIdps()%>">Ver</a></td>
                        </tr>

                    </tbody>
                    <%    
                            }
                        }
                    %>
                </table>
    </body>
</html>
