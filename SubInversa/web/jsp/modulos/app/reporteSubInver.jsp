<%-- 
    Document   : reporteSubInver
    Created on : Nov 5, 2014, 10:52:32 PM
    Author     : pacifi
--%>


<%@page import="java.util.List"%>
<%@page import="subinversa.modelo.Subinversa"%>

<%
    List<Subinversa> lista = (List<Subinversa>) request.getSession().getAttribute("");
    
%>

<div>
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
            <td><%=to.getPuja()%></td>

        </tr>
        <%}
        }%>
    </table>
</div>

