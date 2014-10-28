<%-- 
    Document   : mainTipoEmp
    Created on : Oct 15, 2014, 5:18:01 PM
    Author     : pacifi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="subinversa.modelo.Tipoempresa"%>
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

        <input type="button" class="buttonn btn btn-info" data-type="zoomin" value="Agregar Tipo Empresa"/>
        <br>
        <br>

        <div class="overlay-container">    
            <div class="window-container zoomin">
                <span class="close">Cerrar</span>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Tipo Empresa</h3>
                    </div>
                    <div class="panel-body">
                        <form action="../../../TipoEmpControl">
                            <label>Nombre</label>
                            <input class="form-control" name="nombre" />
                            <label>Descripcion</label>
                            <input class="form-control" name="descripcion"/>
                            <label>Estado</label>
                            <input class="form-control" name="estado"/> <br>
                            <input type="hidden" name="opc" value="<%=2%>"/>
                            <input type="submit" class="btn btn-success"  />
                        </form>
                    </div>
                </div>

            </div>
        </div>


        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title"><i class="fa fa-money fa-fw"></i>List Empresa</h3>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover table-striped">
                        <thead>
                            <tr>
                                <th>Order #</th>
                                <th>Nombre</th>
                                <th>Descripcion</th>
                                <th>Estado</th>
                            </tr>
                        </thead>
                        <%
                            List<Tipoempresa> lista = null;
                            lista = (List<Tipoempresa>) request.getSession().getAttribute("_listaTimpoEmpresa");
                            if (lista != null) {
                                for (Tipoempresa to : lista) {
                        %>
                        <tbody>
                            <tr>
                                <td><%=to.getIdtipemp()%></td>
                                <td><%=to.getNombre()%></td>
                                <td><%=to.getDescripcion()%></td>
                                <td><%=to.getEstado()%></td>
                            </tr>

                        </tbody>
                        <%                     }
                            }
                        %>
                    </table>
                </div>
                <div class="text-right">
                    <a href="#">View All Transactions <i class="fa fa-arrow-circle-right"></i></a>
                </div>
            </div>
        </div>
        <script>!window.jQuery && document.write(unescape('%3Cscript src="../../resources/popup/jquery-1.7.1.min.js"%3E%3C/script%3E'))</script>
        <script type="text/javascript" src="../../resources/popup/demo.js"></script>
    </body>
</html>
