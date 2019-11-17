<html>
     <%
        try
        {
            String userType=session.getAttribute("UserType").toString();
            if(userType.equals("USER"))
            {
                //user
                response.sendRedirect("../User/index.jsp");
            }
            else
            {
                if(userType.equals("SELLER"))
                {
                    //Seller
                    response.sendRedirect("../Seller/index.jsp");
                }  
                else
                {
                    if(userType.equals("ADMIN"))
                    {
                        //Admin
                        response.sendRedirect("../Admin/index.jsp");
                    }
                    else
                    {
                        //none of the above
                    }
                }
            }
        }
        catch(Exception ex){}
    %>
<!-- jcgjhcgjdgwjg -->

<head>
    <title> Sabzi Bazzer </title>

    <!-- Bootstrap css links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Enternal file liks -->
    <link href="../Css/style.css" rel="stylesheet">
    <script src="style.js"></script>`
</head>

<body>

    <!-- Navbar start -->

    <%@include file="../PageFiles/navMain.jsp" %>
    <!-- Navbar end -->
    <!-- Start image slider -->
    <div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../image/Slider1.jpg" class="d-block w-100">
            </div>
            <div class="carousel-item">
                <img src="../image/Slider2.jpg" class="d-block w-100">
            </div>
            <div class="carousel-item">
                <img src="../image/Slider3.jpg" class="d-block w-100">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <!-- End image slider -->



    <!-- Product items start -->
    <div class="container"> <br>
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="product-grid6">
                    <div class="product-image6">
                        <a href="#">
                            <img class="pic-1" src="../image/Vegetables/Aubergine.jpg">
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
            <div class="col-md-3 col-sm-6">
                <div class="product-grid6">
                    <div class="product-image6">
                        <a href="#">
                            <img class="pic-1" src="../image/Vegetables/Beetroot.jpg">
                        </a>
                    </div>
                    <div class="product-content">
                        <h3 class="title"><a href="#">Beetroot</a></h3>
                        <div class="price">Rs8.00
                            <span>MRP:Rs 12</span>
                        </div>
                    </div>
                    <ul class="social">
                        <li><a href="" data-tip="Quick View"><i class="fa fa-search"></i></a></li>
                        <li><a href="" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
                        <li><a href="" data-tip="Add to Cart"><i class="fa fa-shopping-cart"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="product-grid6">
                    <div class="product-image6">
                        <a href="#">
                            <img class="pic-1" src="../image/Vegetables/Black Pepper.jpg">
                        </a>
                    </div>
                    <div class="product-content">
                        <h3 class="title"><a href="#">Black Pepper</a></h3>
                        <div class="price">Rs11.00
                            <span>MRP: Rs 30 </span>
                        </div>
                    </div>
                    <ul class="social">
                        <li><a href="" data-tip="Quick View"><i class="fa fa-search"></i></a></li>
                        <li><a href="" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
                        <li><a href="" data-tip="Add to Cart"><i class="fa fa-shopping-cart"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="product-grid6">
                    <div class="product-image6">
                        <a href="#">
                            <img class="pic-1" src="../image/Vegetables/Cabbage.jpg" width="30px">
                        </a>
                    </div>
                    <div class="product-content">
                        <h3 class="title"><a href="#">Cabbage</a></h3>
                        <div class="price">Rs11.00
                            <span>MRP: Rs 30 </span>
                        </div>
                    </div>
                    <ul class="social">
                        <li><a href="" data-tip="Quick View"><i class="fa fa-search"></i></a></li>
                        <li><a href="" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
                        <li><a href="" data-tip="Add to Cart"><i class="fa fa-shopping-cart"></i></a></li>
                    </ul>
                </div>
            </div>
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