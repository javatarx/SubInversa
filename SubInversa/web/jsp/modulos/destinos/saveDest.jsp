<%-- 
    Document   : saveDest
    Created on : 19/10/2014, 01:02:09 AM
    Author     : Magwi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title"><i class="fa fa-money fa-fw"></i>Destinos</h3>
            </div>
            <div class="panel-body">
                <form action="../../../DestinoControl">
                    <label>Nombre</label>
                    <input class="form-control" name="nombre" />
                    <label>Estado</label>
                    <input class="form-control" name="estado"/> <br>
                    <input type="hidden" name="opc" value="<%=2%>"/>
                    <input type="submit" class="btn btn-success"  />
                 </form>
            </div>
    </div>
    </body>
</html>
