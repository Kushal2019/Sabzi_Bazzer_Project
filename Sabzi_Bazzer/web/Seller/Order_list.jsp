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
    function Order_status(id) {
        let Order_status = document.getElementById('Order_status');
        if(Order_status.value=="SHIPPED")
        {
           
             window.location = "../ChangeOrderStatus?id="+id+"&status="+Order_status.value;
        }
        if(Order_status.value=="DELIVERED")
        {
            
             window.location = "../ChangeOrderStatus?id="+id+"&status="+Order_status.value;
        }
       //  alert(Order_status);
     /* let loc = "../Product_Permission?id=" + id;
      window.location = loc;*/
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
               
                <th>Buyer_name</th>
                <th>Product_name</th>
                <th>Quantity</th>
                <th>Amount</th>
                <th>Payment_Way</th>
                <th>Order_date</th>
                <th>Delivery_date</th>
                <th>Order_status</th>
                <th>Change</th>
              </tr>
            </thead>
            <tbody>
              <%
                   try {
                       String emaiiId=session.getAttribute("UserID").toString();
                         ResultSet rs = new Database().Order_List(emaiiId);  
                         while(rs.next())
                         {
                %>
              <tr>
                <td></td>
                <td></td>
                <td><%=rs.getString("quantity")%></td>
                <td><%=rs.getString("amount")%></td>
                <td><%=rs.getString("payment_method")%></td>
                <td><%=rs.getString("order_date")%></td>
                <td><%=rs.getString("delivery_date")%></td>
                <td><%=rs.getString("order_status")%></td>
                <td>
                    <select  class="form-control" name="Order_status" id="Order_status" onchange="Order_status(<%=rs.getString("order_id")%>)">
                        <%
                            if(rs.getString("order_status").equals("PLACED"))
                            {
                        %>
                        <option  value="" selected>PLACED</option>
                        <option value="SHIPPED">SHIPPED</option>
                        <%}%>
                         <%
                            if(rs.getString("order_status").equals("SHIPPED"))
                            {
                        %>
                        <option  value="" selected>SHIPPED</option>
                        <option value="DELIVERED">DELIVERED</option>
                        <%}%>
                         <%
                            if(rs.getString("order_status").equals("DELIVERED"))
                            {
                        %>
                        <option value="DELIVERED">DELIVERED</option>
                        <%}%>
                          <%
                            if(rs.getString("order_status").equals("Cancel"))
                            {
                        %>
                        <option value="">Cancel</option>
                        <%}%>
                    </select>
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