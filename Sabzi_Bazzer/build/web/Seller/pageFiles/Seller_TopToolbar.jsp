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
%><%-- 
    Document   : newjspadmin_topToolbar
    Created on : 2 Oct, 2019, 7:22:12 PM
    Author     : Kushal
--%>

<header class="dash-toolbar">
    <a href="#menu" class="menu-toggle">
        <i class="fas fa-bars" style="font-size:30px; color: greenyellow;"></i>
    </a>
    <div class="tools">
        <a href="../logout.jsp" class="tools-item">
            <i class="fas fa-sign-out-alt" style="font-size:35px; color: #FF5A00;" title="Logout"></i>
        </a>
    </div>
</header>