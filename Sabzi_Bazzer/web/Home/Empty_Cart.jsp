<%-- 
    Document   : Empty_Cart
    Created on : 1 Mar, 2020, 9:12:45 PM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empty Cart</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <style type="text/css">
            .container{
                background: -webkit-linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), -webkit-linear-gradient(110deg, #dd0000 66%, #ffc608 66%);
                background: -o-linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), -o-linear-gradient(110deg, #dd0000 66%, #ffc608 66%);
                background: -moz-linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), -moz-linear-gradient(110deg, #dd0000 66%, #ffc608 66%);
                background: linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), linear-gradient(110deg, #dd0000 66%, #ffc608 66%);
            }
        </style>
        
    </head>
    <body>
        <%@include file="../PageFiles/navMain.jsp"%>
        <br><br><br><br><br><br>
        <div class="container">
            <div class="text-center"><br>
                <h1> &nbsp; Your Cart is empty</h1><br><br><br><br><br><br><br><br><br>
                <button type="button" class="btn btn-warning btn-lg" onClick="location.href='index.jsp'">Continue Shopping</button><br><br><br>
            </div>
        </div>        
        <%@include file="../PageFiles/footerMain.jsp" %>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
