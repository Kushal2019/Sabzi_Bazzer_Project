package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.Pattern;
import java.sql.ResultSet;
import com.sabzi_bazzer.Database;
import com.sabzi_bazzer.Database;

public final class product_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/User/../User/navUser.jsp");
    _jspx_dependants.add("/User/../PageFiles/footerMain.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Product View</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("\t<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>\n");
      out.write("\t<link href='https://use.fontawesome.com/releases/v5.7.2/css/all.css'>\n");
      out.write("\t<link href=\"http://www.jqueryscript.net/css/jquerysctipttop.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/product_view_style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/product_image_style.css\">\n");
      out.write("        <script>\n");
      out.write("            function addtocart(id)\n");
      out.write("            {\n");
      out.write("                let q=document.getElementById('qty').value;\n");
      out.write("                  window.location=\"../Addtocart2?id=\"+id+\"&q=\"+q;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\"\r\n");
      out.write("    aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  ");

    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") && !uname.equals(""))
        {
           // response.sendRedirect("../User/index.jsp");
        }
        else
        {
            if(utype.equals("ADMIN"))
            {
                response.sendRedirect("../Admin/index.jsp");
            }
            else
            {
               if(utype.equals("SELLER"))
            {
                response.sendRedirect("../Seller/index.jsp");
            } 
            }
        }
     String rs = new Database().Username(uname);

      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"../User/User_about.jsp\">About</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"My_Profile.jsp\">Edit ");
      out.print(rs);
      out.write("</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"../User/View_Cart.jsp\">Cart</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"../logout.jsp\">Logout</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");

    }
    catch(Exception ex)
    {
        response.sendRedirect("../index.jsp");
    }

      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            try{
                String id=request.getParameter("id");
                //String emaiiId=session.getAttribute("UserID").toString();
                 ResultSet rs = new Database().Productdetails1(id);  
                 if(rs.next())
                 {
                         
                     
        
      out.write("\n");
      out.write("\t<div class=\"super_container\">\n");
      out.write("\t\t<div class=\"single_product\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-5\">\n");
      out.write("\t\t\t\t\t\t<div class=\"bzoom_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"bzoom\">\n");
      out.write("                                                            ");

                                                                    String st=rs.getString("product_image");
                                                                    Pattern pattern = Pattern.compile("-");
                                                                     String[] words;
                                                                    words = pattern.split(st);
                                                                    for(int i=0;i<words.length ; i++)
                                                                    {
                                                            
                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                    <img class=\"bzoom_thumb_image\" src=\"../image/Vegetables/");
      out.print(words[i]);
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"bzoom_big_image\" src=\"../image/Vegetables/");
      out.print(words[i]);
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                                                 ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t<div class=\"col-md-5 order-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"product_description\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product_name\">");
      out.print(rs.getString("product_name"));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-rating\"><span class=\"badge badge-success\"><i class=\"fa fa-star\"></i> New\n");
      out.write("\t\t\t\t\t\t\t\t</span> <span class=\"rating-review\">");
      out.print(rs.getString("company_name"));
      out.write("</span></div>\n");
      out.write("\t\t\t\t\t\t\t<div> <span class=\"product_price\">Price: ₹");
      out.print(rs.getString("product_price"));
      out.write("</span> <strike class=\"product_discount\">\n");
      out.write("                                                                <span style='color:black'>MRP ₹ ");
      out.print(Integer.parseInt(rs.getString("product_price"))+10);
      out.write(" </span> </strike> </div>\n");
      out.write("\t\t\t\t\t\t\t<div> <span class=\"product_saved\">You Saved:</span> <span style='color:black'>₹ 10</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"singleline\">\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"product_info\"> Standard Delivery:  Tomorrow Evening</span><br>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"product_info\">We provide you best seller of the week</span><br>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"product_info\">No return policy</span><br>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"product_info\">In Stock: ");
      out.print(rs.getString("product_quantity"));
      out.write(" units sold this Date ");
      out.print(rs.getString("product_exp_date"));
      out.write(" </span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"br-dashed\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-xs-3\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://img.icons8.com/color/48/000000/price-tag.png\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9 col-xs-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pr-info\"> <span class=\"break-all\">Extra 5% off* with\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNLDB Credit Card</span> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-7\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"singleline\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"order_info d-flex flex-row\">\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\" style=\"margin-left: 14px\">\n");
      out.write("                                                                    <span class=\"product_info\"><b>Pack Size: </b>");
      out.print(rs.getString("product_type"));
      out.write("</span><br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"qty mt-10\">\n");
      out.write("                                                                            <span class=\"minus bg-dark\">-</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"count\" name=\"qty\" value=\"1\" id=\"qty\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"plus bg-dark\">+</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                                <button type=\"button\" class=\"btn btn-primary shop-button\" onclick=\"addtocart(");
      out.print(rs.getString("product_id"));
      out.write(")\">Add to Cart</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success shop-button\">Buy Now</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        ");

            }
            }
            catch(Exception x){}
        
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t<h2>Trending <b>Products</b></h2>\n");
      out.write("\t\t\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"0\">\n");
      out.write("\t\t\t\t\t<!-- Carousel indicators -->\n");
      out.write("\t\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t<!-- Wrapper for carousel items -->\n");
      out.write("\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item carousel-item active\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                            ");

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
                                                            
      out.write("\n");
      out.write("                                                            \n");
      out.write("                                                            <div class=\"col-sm-3\" style=\"border-color: red;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"thumb-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"img-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(Path);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-responsive img-fluid\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"thumb-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>");
      out.print(rs.getString("product_name"));
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"item-price\"><strike>$400.00</strike> <span>₹");
      out.print(rs.getString("product_price"));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"star-rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star-o\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Add to Cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t");

                                                                    }
                                                                    }
                                                                    catch(Exception z){}
                                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item carousel-item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                            ");

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
                                                            
      out.write("\n");
      out.write("                                                            \n");
      out.write("                                                            <div class=\"col-sm-3\" style=\"border-color: red;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"thumb-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"img-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(Path);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-responsive img-fluid\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"thumb-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>");
      out.print(rs.getString("product_name"));
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"item-price\"><strike>$400.00</strike> <span>");
      out.print(rs.getString("product_price"));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Add to Cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t");

                                                                    }
                                                                    }
                                                                    catch(Exception z){}
                                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item carousel-item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                            ");

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
                                                            
      out.write("\n");
      out.write("                                                            \n");
      out.write("                                                            <div class=\"col-sm-3\" style=\"border-color: red;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"thumb-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"img-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(Path);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-responsive img-fluid\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"thumb-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>");
      out.print(rs.getString("product_name"));
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"item-price\"><strike>$400.00</strike> <span>$369.00</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"star-rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-inline-item\"><i class=\"fa fa-star-o\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Add to Cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t");

                                                                    }
                                                                    }
                                                                    catch(Exception z){}
                                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- Carousel controls -->\n");
      out.write("\t\t\t\t\t<a class=\"carousel-control left carousel-control-prev\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"carousel-control right carousel-control-next\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      out.write("<div class=\"footer\" style=\"background-color: black;\">\r\n");
      out.write("    <div class=\"text-center\" style=\"color: white\">\r\n");
      out.write("        <p>Created by Kushal & Soumen</p>\r\n");
      out.write("        <p>Special thanks to our respected Teachers</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> ");
      out.write("\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"../Javascript/product_view_style.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
