<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<html>

<head>
    <title> Sabzi Bazzer </title>

    <!-- Bootstrap css links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Enternal file liks -->
    <link href="../Css/style.css" rel="stylesheet">
    <script src="style.js"></script>
</head>

<body>

    <%@include file="navUser.jsp" %>
    <%@include file="../Home/image_slider.jsp" %>

    <!-- Product items start -->
    <div class="container"> <br>
        <div class="row">
           <%
                try{
                   ResultSet rs = new Database().Productdetails();  
                   while(rs.next())
                   {
                       String Path="../image/Vegetables/" +rs.getString("product_image");
            %>
            <div class="col-md-3 col-sm-6">
                <div class="product-grid6">
                    <div class="product-image6">
                        <a href="#">
                            <img class="pic-1" src="<%=Path%>">
                        </a>
                    </div>
                    <div class="product-content">
                        <h3 class="title"><a href="#">Aubergine</a></h3>
                        <div class="price">Rs 18.90
                            <span>MRP:Rs 20</span>
                        </div>
                    </div>
                    <ul class="social">
                        <li><a href="" data-tip="Quick View"><i class="fa fa-search"></i></a></li>
                        <li><a href="" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
                        <li><a href="" data-tip="Add to Cart"><i class="fa fa-shopping-cart"></i></a></li>
                    </ul>
                </div>
            </div>
            <%
                }
                }
                catch(Exception a){}
            %>
            <!-- Product items end -->
        </div>
    </div>
    </div>
    <hr>

















    <!-- Footer -->
    <%@include file="../PageFiles/footerMain.jsp" %>

    <!-- jQuery first, then Popper.js, then Bootstrap JS -->

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>

</html>