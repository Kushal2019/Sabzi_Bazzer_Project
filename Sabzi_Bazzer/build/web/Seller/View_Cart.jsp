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
function checkproduct()
{
      var addproduct = document.getElementsByName("addproduct[]");
      var str="";
      var temp=0;
      for(var i=0;i<addproduct.length;i++)
      {
          if(addproduct[i].checked==true)
          {
              temp=1;
              str=str+addproduct[i].value+",";
          }
      }
      if(temp==1)
      {
      window.location="../Checkout_AddtoCart.jsp?id="+str;
      }
      else
      {
           alert("Choose Buys Product");
              return false;
      }
       
     
}
function cartremove(id)
{
    window.location="../Remove_Cart?id="+id;
}
  </script>
</head>

<body >
    <%@include file="navSeller.jsp"%>
    <div class="main"> <br><br><br>
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
              String temp="";
                   ResultSet rs = new Database().Cartdetails(uname);  
                   while(rs.next())
                   {
    %>
    <div class="product">
       
      <div class="product-image">
           <input type="checkbox" name="addproduct[]" value="<%=rs.getString("cart_id")%>">
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
        temp="1";
        }
        if(temp.equals(""))
        {
          
                response.sendRedirect("Empty_Cart.jsp");
   
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
                       double ftxt=txt*0;
                       double gandt=ftxt+txt+0;
    %>
    <div class="totals">
      <div class="totals-item">
        <label>Subtotal</label>
        <div class="totals-value" id="cart-subtotal"><%=rs.getString("total")%></div>
      </div>
      
      <div class="totals-item">
        <label>Shipping</label>
        <div class="totals-value" id="cart-shipping">0(free)</div>
      </div>
      <div class="totals-item totals-item-total">
        <label>Grand Total</label>
        <div class="totals-value" id="cart-total"><%=gandt%></div>
      </div>
    </div>

    <button class="checkout" onclick="return checkproduct()">Checkout</button>
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