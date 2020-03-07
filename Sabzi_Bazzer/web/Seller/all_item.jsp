<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
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
    Document   : Product_List
    Created on : 8 Nov, 2019, 11:31:09 AM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="../Css/Seller_Style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
  <script src="../Javascript/Seller_Style.js"></script>
  <script src="../Javascript/Seller_Product_validation.js"></script>
  <title>All Item</title>
  <script>
    function activate(id) {
      let loc = "../Product_Permission?id=" + id;
      window.location = loc;
    }
    function Deactivate(id) {
      let loc = "../Product_Permission2?id=" + id;
      window.location = loc;
    }
  </script>
</head>

<body>
  <div class="dash">
    <%@include file="pageFiles/Seller_SidePanel.jsp" %>
    <div class="dash-app">
      <%@include file="pageFiles/Seller_TopToolbar.jsp" %>     
      <main class="dash-content">
        <div>
          <table class="table table-dark table-striped">
            <thead>
              <tr>
                <th>Product Name</th>
                <th>Product Quantity</th>
                <th>Product Type</th>
                <th>Product Price</th>
                <th>Product Exp.Date</th>
                <th>Activity</th>
                <th>Permission</th>
              </tr>
            </thead>
            <tbody>
              <%
                   try {
                       String emaiiId=session.getAttribute("UserID").toString();
                         ResultSet rs = new Database().Product_details(emaiiId);  
                         while(rs.next())
                         {
                %>
              <tr>
                <td><%=rs.getString("product_name")%></td>
                <td><%=rs.getString("product_quantity")%></td>
                <td><%=rs.getString("product_type")%></td>
                <td><%=rs.getString("product_price")%></td>
                <td><%=rs.getString("product_exp_date")%></td>
                <td><%=(rs.getString("isActive").toString().equals("1"))?"Activated":"Disabled"%></td>
                <td>
                  <button type="button" onclick="activate('<%=rs.getString("product_id")%>')"
                    class="btn btn-labeled btn-success"> Enable </button>
                  <button type="button" onclick="Deactivate('<%=rs.getString("product_id")%>')"
                    class="btn btn-labeled btn-danger"> Disable </button>
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