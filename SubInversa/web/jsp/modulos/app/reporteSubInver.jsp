<%-- 
    Document   : reporteSubInver
    Created on : Nov 5, 2014, 10:52:32 PM
    Author     : pacifi
--%>


<%@page import="subinversa.servicio.SubInversaServImpl"%>
<%@page import="subinversa.servicio.SubInversaServInterface"%>
<%@page import="subinversa.modelo.Preeleccion"%>
<%@page import="java.util.List"%>
<%@page import="subinversa.modelo.Subinversa"%>

<%
    List<Preeleccion> lista = (List<Preeleccion>) request.getSession().getAttribute("_listaPreeleccion");
    SubInversaServInterface servSubInver = new SubInversaServImpl();
    List<Subinversa> listaSub;
%>
d
<div>
    <input type="text" placeholder="Ingrese Puja" id="pujaSub"/>
    <button onclick="agregarSub()"></button>
</div>

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
                for (Preeleccion to : lista) {
                    

        %>
        <tr>
            <td><%=to.getIdCli().getRazonsocial()%></td>
            <%
                listaSub = servSubInver.buscaSubInvIdPreele(to.getIdpre());
                for (Subinversa toSub : listaSub) {%>
            <td><%=toSub.getPuja()%></td>
            <%} %>
        </tr>
        <%}
            }%>
    </table>
</div>

