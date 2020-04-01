<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%><%-- 
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
      <%@include file="PageFiles/User_SidePanel.jsp" %>
    <div class="dash-app">
        <%@include file="PageFiles/User_TopToolbar.jsp" %>     
      <main class="dash-content">
        <div>
          <table class="table table-dark table-striped">
            <thead>
              <tr>
               
               
                <th>Product_name</th>
                <th>Quantity</th>
                <th>Amount</th>
                <th>Payment_Way</th>
                <th>Order_date</th>
                <th>Delivery_date</th>
                <th>Order_status</th>
                <th>Details</th>
              </tr>
            </thead>
            <tbody>
              <%
                   try {
                       String emaiiId=session.getAttribute("UserID").toString();
                         ResultSet rs = new Database().Order_List2(emaiiId);  
                         while(rs.next())
                         {
                             
                %>
              <tr>
                 
                  <td>
                      <%
                           ResultSet rs1=new Database().Productdetails5(rs.getString("product_id"));
                                    if(rs1.next()){
                                    out.println(rs1.getString("product_name"));
                                    }
                      %>
                  </td>
                <td><%=rs.getString("quantity")%></td>
                <td><%=rs.getString("amount")%></td>
                <td><%=rs.getString("payment_method")%></td>
                <td><%=rs.getString("order_date")%></td>
                <td><%=rs.getString("delivery_date")%></td>
                <td><%=rs.getString("order_status")%></td>
                <td>
                    <button type="button" onclick="javascript:window.location='My_Order.jsp?id=<%=rs.getString("order_id")%>'"
                            class="btn btn-labeled btn-success">View</button>
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