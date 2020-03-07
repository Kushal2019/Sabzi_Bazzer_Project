<%-- 
    Document   : product_view
    Created on : 5 Mar, 2020, 9:27:01 PM
    Author     : Kushal-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<title>Product View</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>
	<link href='https://use.fontawesome.com/releases/v5.7.2/css/all.css'>
	<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="../Css/product_view_style.css">
	<link rel="stylesheet" type="text/css" href="../Css/product_image_style.css">
</head>

<body>
	<%@include  file="../PageFiles/navMain.jsp" %><br><br><br>

	<div class="super_container">
		<div class="single_product">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-5">
						<div class="bzoom_wrap">
							<ul id="bzoom">
								<li>
									<img class="bzoom_thumb_image" src="https://unsplash.it/375/500?image=201" />
									<img class="bzoom_big_image" src="https://unsplash.it/750/1000?image=201" />
								</li>
								<li>
									<img class="bzoom_thumb_image" src="https://unsplash.it/375/500?image=203" />
									<img class="bzoom_big_image" src="https://unsplash.it/750/1000?image=203" />
								</li>
								<li>
									<img class="bzoom_thumb_image" src="https://unsplash.it/375/500?image=212" />
									<img class="bzoom_big_image" src="https://unsplash.it/750/1000?image=212" />
								</li>
								<li>
									<img class="bzoom_thumb_image" src="https://unsplash.it/375/500?image=220" />
									<img class="bzoom_big_image" src="https://unsplash.it/750/1000?image=220" />
								</li>
								<li>
									<img class="bzoom_thumb_image" src="https://unsplash.it/375/500?image=223" />
									<img class="bzoom_big_image" src="https://unsplash.it/750/1000?image=223" />
								</li>
							</ul>
						</div>
					</div>
					<div class="col-md-5 order-3">
						<div class="product_description">
							<div class="product_name"> Acer Aspire 3 Celeron Dual Core </div>
							<div class="product-rating"><span class="badge badge-success"><i class="fa fa-star"></i> New
								</span> <span class="rating-review">A fresh approach to shopping</span></div>
							<div> <span class="product_price">MRP : ₹ 1500</span> <strike class="product_discount">
									<span style='color:black'>₹ 2,000<span> </strike> </div>
							<div> <span class="product_saved">You Saved:</span> <span style='color:black'>₹ 500</span>
							</div>
							<hr class="singleline">
							<div>
								<span class="product_info">EMI starts at ₹ 1,000. No Cost EMI Available</span><br>
								<span class="product_info">2 Days home delivery</span><br>
								<span class="product_info">We provide you best seller of the week</span><br>
								<span class="product_info">10 Days easy return policy</span><br>
								<span class="product_info">In Stock: 25 units sold this week</span>
							</div>
							<div>
								<div class="row">
									<div class="col-md-5">
										<div class="br-dashed">
											<div class="row">
												<div class="col-md-3 col-xs-3"> <img
														src="https://img.icons8.com/color/48/000000/price-tag.png">
												</div>
												<div class="col-md-9 col-xs-9">
													<div class="pr-info"> <span class="break-all">Extra 5% off* with
															NLDB Credit Card</span> </div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-7"> </div>
								</div>
							</div>
							<hr class="singleline">
							<div class="order_info d-flex flex-row">
								<form action="#">
							</div>
							<div class="row">
								<div class="col-xs-6" style="margin-left: 14px">
									<div class="qty mt-10">
										<span class="minus bg-dark">-</span>
										<input type="number" class="count" name="qty" value="1">
										<span class="plus bg-dark">+</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<button type="button" class="btn btn-primary shop-button">Add to Cart</button>
										<button type="button" class="btn btn-success shop-button">Buy Now</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h2>Trending <b>Products</b></h2>
				<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="0">
					<!-- Carousel indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>
					<!-- Wrapper for carousel items -->
					<div class="carousel-inner">
						<div class="item carousel-item active">
							<div class="row">
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/ipad.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Apple iPad</h4>
											<p class="item-price"><strike>$400.00</strike> <span>$369.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/headphone.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Sony Headphone</h4>
											<p class="item-price"><strike>$25.00</strike> <span>$23.99</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/macbook-air.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Macbook Air</h4>
											<p class="item-price"><strike>$899.00</strike> <span>$649.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-half-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/nikon.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Nikon DSLR</h4>
											<p class="item-price"><strike>$315.00</strike> <span>$250.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="item carousel-item">
							<div class="row">
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/play-station.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Sony Play Station</h4>
											<p class="item-price"><strike>$289.00</strike> <span>$269.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/macbook-pro.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Macbook Pro</h4>
											<p class="item-price"><strike>$1099.00</strike> <span>$869.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-half-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/speaker.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Bose Speaker</h4>
											<p class="item-price"><strike>$109.00</strike> <span>$99.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/galaxy.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Samsung Galaxy S8</h4>
											<p class="item-price"><strike>$599.00</strike> <span>$569.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="item carousel-item">
							<div class="row">
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/iphone.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Apple iPhone</h4>
											<p class="item-price"><strike>$369.00</strike> <span>$349.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/canon.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Canon DSLR</h4>
											<p class="item-price"><strike>$315.00</strike> <span>$250.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/pixel.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Google Pixel</h4>
											<p class="item-price"><strike>$450.00</strike> <span>$418.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="/examples/images/products/watch.jpg"
												class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4>Apple Watch</h4>
											<p class="item-price"><strike>$350.00</strike> <span>$330.00</span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="#" class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- Carousel controls -->
					<a class="carousel-control left carousel-control-prev" href="#myCarousel" data-slide="prev">
						<i class="fa fa-angle-left"></i>
					</a>
					<a class="carousel-control right carousel-control-next" href="#myCarousel" data-slide="next">
						<i class="fa fa-angle-right"></i>
					</a>
				</div>
			</div>
		</div>
	</div>
































	<%@include file="../PageFiles/footerMain.jsp" %>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="../Javascript/product_view_style.js"></script>
</body>

</html>