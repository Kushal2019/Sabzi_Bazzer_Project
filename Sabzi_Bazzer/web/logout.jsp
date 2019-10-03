<%-- 
    Document   : logout
    Created on : 2 Oct, 2019, 7:10:25 PM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("Home/index.jsp");
        %>
    </body>
</html>
