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
               // response.sendRedirect("../Admin/index.jsp");
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
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<html>

<head>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="../Css/Admin_Style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
  <script src="../Javascript/Admin_Charts.js"></script>
  <title>Admin Panel</title>
  <script>
      function activate(id)
      {
          let loc="SellerAction.jsp?Activeid="+id;
          window.location=loc;
      }
      function Deactivate(id)
      {
          let loc="SellerAction.jsp?Deactiveid="+id;
          window.location=loc;
      }
  </script>
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
                <th>Status</th>
                <th>Permission</th>
              </tr>
            </thead>
            <tbody>
                <%
                   try {
                         ResultSet rs = new Database().Sellerdetails();  
                         while(rs.next())
                         {
                %>
                <tr>
                 <td><%=rs.getString("first_name")%></td>
                <td><%=rs.getString("last_name")%></td>
                <td><%=rs.getString("email")%></td>       
                <td><%=rs.getString("ph_number")%></td>
                <td><%=rs.getString("gender")%></td>
                <td><%=(rs.getString("isactive").toString().equals("1"))?"Activated":"Disabled"%></td>
                <td>
                    <button type="button"  onclick="activate('<%=rs.getString("email")%>')" class="btn btn-labeled btn-success"> Enable </button>
                    <button type="button" onclick="Deactivate('<%=rs.getString("email")%>')" class="btn btn-labeled btn-danger"> Disable </button>
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
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
  <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>