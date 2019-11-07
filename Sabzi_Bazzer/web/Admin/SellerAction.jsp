<%-- 
    Document   : SellerAction
    Created on : 22-Oct-2019, 19:49:47
    Author     : Kushal-PC
--%>

<%@page import="com.sabzi_bazzer.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
        <%
            try
            {
                String getVal=request.getParameter("Activeid");
                new  Database().activateSellerByEmail(getVal);
                response.sendRedirect("Seller.jsp");
            }
            catch(Exception e){
            }
            try
            {
                String getVal=request.getParameter("Deactiveid");
                new  Database().DeActivatesellerByEmail(getVal);
                response.sendRedirect("Seller.jsp");
            }
            catch(Exception e){
            }
        %>
    </body>
</html>
