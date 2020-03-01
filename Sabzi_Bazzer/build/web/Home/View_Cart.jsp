<%-- 
    Document   : View_Cart
    Created on : 21 Feb, 2020, 6:51:19 PM
    Author     : Kushal
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <title>View Cart</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" href="../Css/Cart_Style.css">
  <script type="text/javascript" src="../Javascript/View_Cart_Style.js"></script>  
  <script>
      function Addcart(str,id) {
  var p= document.getElementById(id).innerHTML;
  
  var  price = parseFloat(p);
  var total = price*str;
  window.location="../UpdateAddtocart?total="+total+"&id="+id+"&qan="+str;
}
function cartremove(id)
{
    window.location="../Remove_Cart?id="+id;
}
  </script>
</head>

<body >
    <%@include file="../PageFiles/navCart.jsp"%>
    <div class="container"> <br><br><br>
  <h1>Shopping Cart</h1>
  <div class="shopping-cart">

    <div class="column-labels">
      <label class="product-image">Image</label>
      <label class="product-details">Product</label>
      <label class="product-price">Price</label>
      <label class="product-quantity">Quantity</label>
      <label class="product-removal">Remove</label>
      <label class="product-line-price">Total</label>
    </div>
    <%
        try{
              String uname=session.getAttribute("UserID").toString();
                   ResultSet rs = new Database().Cartdetails(uname);  
                   while(rs.next())
                   {
    %>
    <div class="product">
      <div class="product-image">
          <img src="../image/Vegetables/<%=rs.getString("product_img")%>">
      </div>
      <div class="product-details">
        <div class="product-title"><%=rs.getString("product_name")%></div>
        <div class="product-title"><%=rs.getString("seller_name")%></div>
        <p class="product-description"> <%=rs.getString("description")%></p>
      </div>
      <div class="product-price" id="<%=rs.getString("cart_id")%>"><%=rs.getString("product_price")%></div>
      <div class="product-quantity">
          <input type="number" value="<%=rs.getString("qantity")%>" min="1" id="quantity" onchange="Addcart(this.value,<%=rs.getString("cart_id")%>)">
      </div>
      <div class="product-removal">
          <button class="remove-product" onclick="cartremove(<%=rs.getString("cart_id")%>)">
          Remove
        </button>
      </div>
      <div class="product-line-price"><%=rs.getString("total")%></div>
    </div>
 <%
        }
        }
        catch(Exception a){}
       %>
        <%
        try{
              String uname=session.getAttribute("UserID").toString();
                   ResultSet rs = new Database().Cartdetails1(uname);  
                   if(rs.next())
                   {
                       double txt= Float.parseFloat(rs.getString("total"));
                       double ftxt=txt*0.05;
                       double gandt=ftxt+txt+40;
    %>
    <div class="totals">
      <div class="totals-item">
        <label>Subtotal</label>
        <div class="totals-value" id="cart-subtotal"><%=rs.getString("total")%></div>
      </div>
      <div class="totals-item">
        <label>Tax (5%)</label>
        <div class="totals-value" id="cart-tax"><%=ftxt%></div>
      </div>
      <div class="totals-item">
        <label>Shipping</label>
        <div class="totals-value" id="cart-shipping">40</div>
      </div>
      <div class="totals-item totals-item-total">
        <label>Grand Total</label>
        <div class="totals-value" id="cart-total"><%=gandt%></div>
      </div>
    </div>

    <button class="checkout">Checkout</button>
   
  </div> 
     <%
        }
        }
        catch(Exception a){}
       %>
  </div> <br><br><br>
  <%@include file="../PageFiles/footerMain.jsp"%>
</body>

</html>