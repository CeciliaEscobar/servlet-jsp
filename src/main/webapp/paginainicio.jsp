<%-- 
    Document   : paginainicio
    Created on : 15 abr. 2023, 14:13:54
    Author     : escob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina Inicio</h1>
        <h2> Hola <%= request.getAttribute("name")%></h2>
    </body>
</html>
