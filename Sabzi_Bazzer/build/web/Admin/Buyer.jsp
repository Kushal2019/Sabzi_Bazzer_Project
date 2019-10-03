<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<html>

<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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
              <tr>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Gender</th>
                <th>Permission</th>
              </tr>
            </thead>
            <tbody>
                <%
                   try {
                         ResultSet rs = new Database().Buyerdetails();  
                         while(rs.next())
                         {
                %>
              <tr>
                  <td><%=rs.getString("first_name")%></td>
                <td><%=rs.getString("last_name")%></td>
                <td><%=rs.getString("email")%></td>
                <td><%=rs.getString("ph_number")%></td>
                <td><%=rs.getString("gender")%></td>
                <td>
                    <button type="button" class="btn btn-labeled btn-success">
                    Success <span class="btn-label"><i class="fa fa-check"></i></span></button>
                    <button type="button" class="btn btn-labeled btn-danger">
                    Cancel <span class="btn-label"><i class="fa fa-close"></i></span></button>
                </td>
              </tr>
              <%            
                  }
                }
                catch(Exception e){}
               %>
            </tbody>
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