<%-- 
    Document   : IndexFrameUser
    Created on : 27/06/2012, 09:44:32 PM
    Author     : Magwi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Subasta Inversa - Grupo Linares S.A.</title>

    <!-- Bootstrap Core CSS -->
    <link href="../resources/Progressus/sb-admin/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../resources/Progressus/sb-admin/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../resources/Progressus/sb-admin/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../resources/Progressus/sb-admin/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        
        <div>
            <%@include file="head.jsp" %>
        </div>
        <div class="nav navbar-nav side-nav">
            <%@include file="menu.jsp" %>
        </div>
        
        <div style="width: 1120px; padding-right: 10px;padding-left: 10px;margin-left: 220px;margin-right: 10px;" id="page-wrapper">
    
            <iframe name="content" height="1000" width="1020" style="border:none" src="body.jsp"/>    
        </div>
        
         <script src="../resources/Progressus/sb-admin/js/jquery-1.11.0.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../resources/Progressus/sb-admin/js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="../resources/Progressus/sb-admin/js/plugins/morris/raphael.min.js"></script>
    <script src="../resources/Progressus/sb-admin/js/plugins/morris/morris.min.js"></script>
    <script src="../resources/Progressus/sb-admin/js/plugins/morris/morris-data.js"></script>
    
    </body>
</html>