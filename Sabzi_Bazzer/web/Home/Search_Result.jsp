<%-- 
    Document   : Search_Result
    Created on : 7 Mar, 2020, 6:36:24 PM
    Author     : Kushal
--%>


<html>

<head>
	<title> Search Result </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="../Css/Search_Result_Style.css" rel="stylesheet">
</head>

<body>
    <%@include file="../PageFiles/navMain.jsp" %><br><br><br>
    <div style="width:90%;margin-left:5%;margin-right:5%;">
        <div id="container">
            <ul class="list">
                <li style="font-family: cursive; font-size: 17px; height: 28px; background-color: yellowgreen;">&nbsp;&nbsp;&nbsp; You Search for Potato...</li>
                
                <!-- This is first search result start -->
                <li>
                    <img src="https://i1.wp.com/theazb.com/wp-content/uploads/2018/08/xhealth-benefits-of-organic-potatoes-1024x576-pagespeed-ic-6zphs-lh7z.jpg?fit=1024%2C576&ssl=1" width="250" height="250">
                    <section class="list-left">
                        <span class="title">Potato</span>
                        <p> Fresh New potatoes are freshly picked from the best of farms and as the name suggests they are a new crop. Because of this, they have a thinner skin or peel on top. </p>
                            <div class="icon-group-btn">
                                <a title="Add to Cart" href="#" class="btn-cart" onclick="">
                                    <span class="icon-cart"></span> <span class="icon-cart-text"> Add To Cart </span>
                                </a>
                            </div>
                    </section>
                    <div class="list-right">
                        <span class="price">Rs.45</span><br><br><br>
                        <button type="button" class="btn btn-warning btn-lg" id="buy_btn">Buy Now</button>
                    </div>
		</li>
                <!-- This is first search result end -->
                
                <!-- This is second search result start -->
                <li>
                    <img src="https://images-na.ssl-images-amazon.com/images/I/21SjSwG98CL.jpg" class="img-responsive" width="250" height="250">
                    <section class="list-left">
                        <span class="title">Potato</span>
                        <p> With a ruby red smooth skin and firm white flesh, red potatoes have a waxy texture and a mild buttery flavour. It has an heavy impact on health. </p>
                            <div class="icon-group-btn">
                                <a title="Add to Cart" href="#" class="btn-cart" onclick="">
                                    <span class="icon-cart"></span> <span class="icon-cart-text"> Add To Cart </span>
                                </a>
                            </div>
                    </section>
                    <div class="list-right">
                        <span class="price">Rs.41</span><br><br><br>
                        <button type="button" class="btn btn-warning btn-lg" id="buy_btn">Buy Now</button>
                    </div>
		</li>
                <!-- This is second search result end -->
            </ul>
        </div>
    </div>
    <%@include file="../PageFiles/footerMain.jsp"%>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>