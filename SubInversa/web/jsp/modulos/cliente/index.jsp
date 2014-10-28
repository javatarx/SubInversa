<%-- 
    Document   : index.jsp
    Created on : Oct 15, 2014, 3:10:25 PM
    Author     : pacifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="subinversa.modelo.Clientes"%>
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
    </head>
        <body>


        <table class="table table-bordered table-hover table-striped">
            <h2>CLIENTES</h2>
            <tr>
                <th>ID</th>
                <th>RUC</th>
                <th>RAZON SOCIAL</th>
                <th>DIRECCION</th>
                <th>TELEFONO</th>
                <th>EMIAL</th>
                <th>TIPO EMPRESA</th>
               
            </tr>
            <%
                List<Clientes> lista = null;
                lista = (List<Clientes>) request.getSession().getAttribute("_listaClientesTodo");
                if(lista!=null) {for(Clientes clientes : lista){ 
                
            %>
            <tr>
                <td><%=clientes.getIdCli() %></td>
                <td><%=clientes.getRuc()%></td>
                <td><%=clientes.getRazonsocial() %></td>
                <td><%=clientes.getDireccion() %></td>
                <td><%=clientes.getTelefono() %></td>
                <td><%=clientes.getEmail() %></td>
                <td><%=clientes.getIdtipemp().getNombre() %></td>
            </tr>
            <%
                }}
            %>
        </table>
    </body>
</html>
