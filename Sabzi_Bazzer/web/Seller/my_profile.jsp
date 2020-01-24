<%-- 
    Document   : my_profile
    Created on : 24 Jan, 2020, 1:48:44 PM
    Author     : Kushal
--%>
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
                response.sendRedirect("../Admin/index.jsp");
            }
            else
            {
               if(utype.equals("SELLER"))
            {
               // response.sendRedirect("../Seller/index.jsp");
            } 
            }
        }
    }
    catch(Exception ex)
    {
        response.sendRedirect("../index.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Profile</title>
        <link rel="stylesheet" href="../Css/Seller_Style.css">
                
    </head>
    <body>
        
        <div class="dash">
        <%@include file="pageFiles/Seller_SidePanel.jsp" %>
            <div class="dash-app">
                <%@include file="pageFiles/Seller_TopToolbar.jsp" %> 
                <!--Main contant is Start-->
                
                <!--Main contant is End-->
            </div>
        </div>        
    
            
                      
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="../Javascript/Admin_Style.js"></script>
    </body>
</html>
