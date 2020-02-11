<%@page import="com.sabzi_bazzer.Database"%>
<%@page import="java.sql.ResultSet"%>
<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-Secondary">
  <a class="navbar-brand" href="index.jsp" style="font-family: Snap ITC; font-size: 28px;"> Sabzi Bazzer </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
    aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <%
    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") )
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
                    //response.sendRedirect("../Seller/index.jsp");
                }
               else
               {
               response.sendRedirect("../index.jsp");
               }
    
            }
        }
        String rs = new Database().sellername(uname);
 %>
  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Seller_about.jsp">About</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="my_profile.jsp">Edit: <%=rs%></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="../logout.jsp">Logout</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" name="search" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<%
 }
    catch(Exception ex)
    {
        
    }
%>