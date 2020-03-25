<%-- 
    Document   : Search_Result
    Created on : 7 Mar, 2020, 6:36:24 PM
    Author     : Kushal
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="com.sabzi_bazzer.Database"%>
<html>

<head>
	<title> Search Result </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="../Css/Search_Result_Style.css" rel="stylesheet">
</head>

<body>
    <%@include file="navSeller.jsp" %><br><br><br>
    <div style="width:90%;margin-left:5%;margin-right:5%;">
        <div id="container">
            <ul class="list">
                <%
                    String search= request.getParameter("search");
                %>
                <li style="font-family: cursive; font-size: 17px; height: 28px; background-color: yellowgreen;">&nbsp;&nbsp;&nbsp; You Search for &nbsp;<%=search%></li>
                <%
                    try{
                         ResultSet rs = new Database().SearchProduct(search);  
                         String temp="";
                         while(rs.next())
                         {
                             String st=rs.getString("product_image");
                        Pattern pattern = Pattern.compile("-");
                        String[] words;
                         words = pattern.split(st);
                      String  filepath=words[0]; 
                       String Path="../image/Vegetables/" +filepath;
                         
                         
                 %>
                <!-- This is first search result start -->
                <li>
                    <a href="product_view.jsp?id=<%=rs.getString("product_id")%>">
                        <img src="<%=Path%>" width="250" height="250">
                    </a>
                    <section class="list-left">
                        <a href="product_view.jsp?id=<%=rs.getString("product_id")%>"> <span class="title"><%=rs.getString("product_name")%></span></a>
                        <p> <%=rs.getString("product_description")%> </p>
                            <div class="icon-group-btn">
                                <a title="Add to Cart" href="../Addtocart?id=<%=rs.getString("product_id")%>" class="btn-cart" >
                                    <span class="icon-cart"></span> <span class="icon-cart-text"> Add To Cart </span>
                                </a>
                            </div>
                    </section>
                    <div class="list-right">
                        <span class="price">Rs. <%=rs.getString("product_price")%></span><br><br><br>
                     
                    </div>
		</li>
                <%  temp="1";
        }
        if(temp.equals(""))
        {%>
          
        <img src="../image/pnf.png" width="750px" height="280px">    
   
        <%}
                   }
                   catch(Exception x){}
               %> 
            </ul>
        </div>
    </div>
             <br>
               <br>
                              <br> <br>
    <%@include file="../PageFiles/footerMain.jsp"%>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>