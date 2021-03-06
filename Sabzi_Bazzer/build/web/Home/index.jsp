<%@page import="java.util.regex.Pattern"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
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

<head>
    <title> Sabzi Bazzer </title>

    <!-- Bootstrap css links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Enternal file liks -->
    <link href="../Css/style.css" rel="stylesheet">
    <link href="../Css/Loder.css" rel="stylesheet">
    <script>
        function login(id)
        {
           window.open("Mainlogin_1.jsp", 'Ad', 'left=20,top=20,width=500,height=550,toolbar=1,resizable=0');
           let r=confirm("Press a button!");
           if(r)
           {
               
           }
           else{
               alert(id);
           }
          
          
        }
    </script>

</head>

<body>
    <div id="loader">
        <center><img src="../image/loading.gif"></center>
    </div>
    <%@include file="../PageFiles/navMain.jsp" %>
    <%@include file="../Home/image_slider.jsp" %>
        
    <!-- Product items start -->
    <div class="container"> <br>
        <div class="row">
            <%
                try{
                   ResultSet rs = new Database().Productdetails();  
                   while(rs.next())
                   {
                       String st=rs.getString("product_image");
                       Pattern pattern = Pattern.compile("-");
                       String[] words;
                       words = pattern.split(st);
                      String  filepath=words[0]; 
                       String Path="../image/Vegetables/" +filepath;
            %>
            <div class="col-md-3 col-sm-6">
                <div class="product-grid6">
                    <div class="product-image6">
                        <a href="product_view.jsp?id=<%=rs.getString("product_id")%>">
                            <img class="pic-1" src="<%=Path%>">
                        </a>
                    </div>
                    <div class="product-content">
                        <h3 class="title">
                            <a href="#"><%=rs.getString("product_name")%>
                            </a>
                        </h3>

                        <div class="price">Rs.<%=rs.getString("product_price")%>
                            <span>Per: <%=rs.getString("product_type")%></span>
                        </div>
                    </div>
                    <ul class="social">
                        <li><a href="product_view.jsp?id=<%=rs.getString("product_id")%>" data-tip="Quick View"><i class="fa fa-search"></i></a></li>
                        <li><a href="" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
                        <li><a href="Mainlogin_1.jsp?id=<%=rs.getString("product_id")%>" data-tip="Add to Cart"   ><i class="fa fa-shopping-cart"></i></a></li>
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
    </div> <br><br><br>

    <!-- Footer -->
    <%@include file="../PageFiles/footerMain.jsp" %>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/s/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="../Javascript/loder.js"></script>
    
    
    
</body>

</html>