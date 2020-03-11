<%-- 
    Document   : product_view
    Created on : 5 Mar, 2020, 9:27:01 PM
    Author     : Kushal-PC
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
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
	<script>
		function addtocart(id) {
			let q = document.getElementById('qty').value;
			window.location = "../Addtocart2?id=" + id + "&q=" + q;
		}
	</script>
</head>

<body>
	<%@include  file="../User/navUser.jsp" %><br><br><br>


	<%
            try{
                String id=request.getParameter("id");
                //String emaiiId=session.getAttribute("UserID").toString();
                 ResultSet rs = new Database().Productdetails1(id);  
                 if(rs.next())
                 {
                         
                     
        %>
	<div class="super_container">
		<div class="single_product">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-5">
						<div class="bzoom_wrap">
							<ul id="bzoom">
								<%
                                                                    String st=rs.getString("product_image");
                                                                    Pattern pattern = Pattern.compile("-");
                                                                     String[] words;
                                                                    words = pattern.split(st);
                                                                    for(int i=0;i<words.length ; i++)
                                                                    {
                                                            
                                                            %>
								<li>
									<img class="bzoom_thumb_image" src="../image/Vegetables/<%=words[i]%>" />
									<img class="bzoom_big_image" src="../image/Vegetables/<%=words[i]%>" />
								</li>

								<%}%>
							</ul>
						</div>
					</div>
                                   
					<div class="col-md-5 order-3">
						<div class="product_description">
							<div class="product_name"><%=rs.getString("product_name")%>
						</div>
						<div class="product-rating"><span class="badge badge-success"><i class="fa fa-star"></i> New
							</span> <span class="rating-review"><%=rs.getString("company_name")%></span></div>
						<div> <span class="product_price">Price: ₹<%=rs.getString("product_price")%></span> <strike
								class="product_discount">
								<span style='color:black'>MRP ₹ <%=Integer.parseInt(rs.getString("product_price"))+10%>
								</span> </strike> </div>
						<div> <span class="product_saved">You Saved:</span> <span style='color:black'>₹ 10</span>
						</div>
						<hr class="singleline">
						<div>

							<span class="product_info"> Standard Delivery: Tomorrow Evening</span><br>
							<span class="product_info">We provide you best seller of the week</span><br>
							<span class="product_info">No return policy</span><br>
							<span class="product_info">In Stock: <%=rs.getString("product_quantity")%> units sold this
								Date <%=rs.getString("product_exp_date")%> </span>
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
								<span class="product_info"><b>Pack Size:
									</b><%=rs.getString("product_type")%></span><br>
								<div class="qty mt-10">
									<span class="minus bg-dark">-</span>
									<input type="number" class="count" name="qty" value="1" id="qty">
									<span class="plus bg-dark">+</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button type="button" class="btn btn-primary shop-button"
										onclick="addtocart(<%=rs.getString("product_id")%>)">Add to Cart</button>
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
	<%
            }
            }
            catch(Exception x){}
        %>
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
								<%
                                                                try{
                                                                    String id=request.getParameter("id");
                                                                    ResultSet rs = new Database().Productdetails2(id);
                                                                    while(rs.next())
                                                                    {
                                                                         String st=rs.getString("product_image");
                                                                         Pattern pattern = Pattern.compile("-");
                                                                         String[] words;
                                                                         words = pattern.split(st);
                                                                         String  filepath=words[0]; 
                                                                         String Path="../image/Vegetables/" +filepath;
                                                            %>

								<div class="col-sm-3" style="border-color: red;">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="<%=Path%>" class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4><%=rs.getString("product_name")%></h4>
											<p class="item-price"><strike>$400.00</strike>
												<span>₹<%=rs.getString("product_price")%></span></p>
											<div class="star-rating">
												<ul class="list-inline">
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star"></i></li>
													<li class="list-inline-item"><i class="fa fa-star-o"></i></li>
												</ul>
											</div>
											<a href="../Addtocart?id=<%=rs.getString("product_id")%>"
												class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<%
                                                                    }
                                                                    }
                                                                    catch(Exception z){}
                                                                %>


							</div>
						</div>
						<div class="item carousel-item">
							<div class="row">
								<%
                                                                try{
                                                                    String id=request.getParameter("id");
                                                                    ResultSet rs = new Database().Productdetails3(id);
                                                                    while(rs.next())
                                                                    {
                                                                         String st=rs.getString("product_image");
                                                                         Pattern pattern = Pattern.compile("-");
                                                                         String[] words;
                                                                         words = pattern.split(st);
                                                                         String  filepath=words[0]; 
                                                                         String Path="../image/Vegetables/" +filepath;
                                                            %>

								<div class="col-sm-3" style="border-color: red;">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="<%=Path%>" class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4><%=rs.getString("product_name")%></h4>
											<p class="item-price"><strike>$400.00</strike>
												<span><%=rs.getString("product_price")%></span></p>

											<a href="../Addtocart?id=<%=rs.getString("product_id")%>"
												class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<%
                                                                    }
                                                                    }
                                                                    catch(Exception z){}
                                                                %>


							</div>
						</div>
						<div class="item carousel-item">
							<div class="row">
								<%
                                                                try{
                                                                    String id=request.getParameter("id");
                                                                    ResultSet rs = new Database().Productdetails4(id);
                                                                    while(rs.next())
                                                                    {
                                                                         String st=rs.getString("product_image");
                                                                         Pattern pattern = Pattern.compile("-");
                                                                         String[] words;
                                                                         words = pattern.split(st);
                                                                         String  filepath=words[0]; 
                                                                         String Path="../image/Vegetables/" +filepath;
                                                            %>

								<div class="col-sm-3" style="border-color: red;">
									<div class="thumb-wrapper">
										<div class="img-box">
											<img src="<%=Path%>" class="img-responsive img-fluid" alt="">
										</div>
										<div class="thumb-content">
											<h4><%=rs.getString("product_name")%></h4>
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
											<a href="../Addtocart?id=<%=rs.getString("product_id")%>"
												class="btn btn-primary">Add to Cart</a>
										</div>
									</div>
								</div>
								<%
                                                                    }
                                                                    }
                                                                    catch(Exception z){}
                                                                %>


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