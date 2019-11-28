<%
    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") && !uname.equals(""))
        {
            response.sendRedirect("../User/index.jsp");
        }
        else
        {
            if(utype.equals("ADMIN"))
            {
                //response.sendRedirect("../Admin/index.jsp");
            }
            else
            {
               if(utype.equals("SELLER"))
            {
                response.sendRedirect("../Seller/index.jsp");
            } 
            }
        }
    }
    catch(Exception ex)
    {
        response.sendRedirect("../index.jsp");
    }
%>
<%-- 
    Document   : BuyerAction
    Created on : 17-Oct-2019, 21:11:01
    Author     : Soumen-Pc
--%>

<%@page import="com.sabzi_bazzer.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                String act=request.getParameter("activate");
                new Database().activateBuyerByEmail(act);
                response.sendRedirect("Buyer.jsp");
            }
            catch(Exception e){}
            try{
                String dact=request.getParameter("deActivate");
                new Database().DeActivateBuyerByEmail(dact);
                response.sendRedirect("Buyer.jsp");
            }
            catch(Exception e){}
        %>
    </body>
</html>
