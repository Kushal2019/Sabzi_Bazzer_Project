<%
    try
    {
        String utype=session.getAttribute("UserType").toString();
        
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
    }
    catch(Exception x){}
 %>
<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="index.jsp" style="font-family: Snap ITC; font-size: 28px;"> Sabzi Bazzer </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
    aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="about.jsp">About</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Cart</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Mainlogin.jsp">Login</a>
      </li>
    </ul>
  </div>
</nav>