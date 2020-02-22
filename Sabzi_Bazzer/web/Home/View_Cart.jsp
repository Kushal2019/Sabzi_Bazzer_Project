<%-- 
    Document   : View_Cart
    Created on : 21 Feb, 2020, 6:51:19 PM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <title>View Cart</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" href="../Css/View_Cart_Style.css">
  <script type="text/javascript" src="../Javascript/View_Cart_Style.js"> </script>

</head>

<body>
  <!--%@include file="../PageFiles/navMain.jsp"%-->

  <h1>Shopping Cart</h1>

  <div class="container">
  <div class="shopping-cart">

    <div class="column-labels">
      <label class="product-image">Image</label>
      <label class="product-details">Product</label>
      <label class="product-price">Price</label>
      <label class="product-quantity">Quantity</label>
      <label class="product-removal">Remove</label>
      <label class="product-line-price">Total</label>
    </div>

    <div class="product">
      <div class="product-image">
          <img src="../image/Vegetables/vendi.jpeg">
      </div>
      <div class="product-details">
        <div class="product-title">Nike Flex Form TR Women's Sneaker</div>
        <p class="product-description"> It has a lightweight, breathable mesh upper with forefoot cables for a
          locked-down fit.</p>
      </div>
      <div class="product-price">12.99</div>
      <div class="product-quantity">
        <input type="number" value="2" min="1">
      </div>
      <div class="product-removal">
        <button class="remove-product">
          Remove
        </button>
      </div>
      <div class="product-line-price">25.98</div>
    </div>

    <div class="product">
      <div class="product-image">
          <img src="../image/Sabzi_Logo.png">
      </div>
      <div class="product-details">
        <div class="product-title">ULTRABOOST UNCAGED SHOES</div>
        <p class="product-description">Born from running culture, these men's shoes deliver the freedom of a cage-free
          design</p>
      </div>
      <div class="product-price">45.99</div>
      <div class="product-quantity">
        <input type="number" value="1" min="1">
      </div>
      <div class="product-removal">
        <button class="remove-product">
          Remove
        </button>
      </div>
      <div class="product-line-price">45.99</div>
    </div>

    <div class="totals">
      <div class="totals-item">
        <label>Subtotal</label>
        <div class="totals-value" id="cart-subtotal">71.97</div>
      </div>
      <div class="totals-item">
        <label>Tax (5%)</label>
        <div class="totals-value" id="cart-tax">3.60</div>
      </div>
      <div class="totals-item">
        <label>Shipping</label>
        <div class="totals-value" id="cart-shipping">15.00</div>
      </div>
      <div class="totals-item totals-item-total">
        <label>Grand Total</label>
        <div class="totals-value" id="cart-total">90.57</div>
      </div>
    </div>

    <button class="checkout">Checkout</button>

  </div>
      </div>
  <!--%@include file="../PageFiles/footerMain.jsp"%-->
</body>

</html>