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
<html>

<head>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="../Css/Admin_Style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
  <script src="../Javascript/Admin_Charts.js"></script>
  <title>Admin Panel</title>
</head>

<body>
  <div class="dash">
    <%@include file="pageFiles/admin_sidePaneel.jsp" %>
    <div class="dash-app">
      <%@include file="pageFiles/admin_topToolbar.jsp" %>
      <main class="dash-content">
        <div class="container">
          <table class="table table-dark table-striped">
            <thead>
                <th>Product Name</th>
                <th>Owner Name</th>
                <th>Available Quantity</th>
                <th>Ph Number</th>
            </thead>
          </table>
        </div>

      </main>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>