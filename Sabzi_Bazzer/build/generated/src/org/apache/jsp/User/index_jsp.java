package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.Pattern;
import java.sql.ResultSet;
import com.sabzi_bazzer.Database;
import com.sabzi_bazzer.Database;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/User/navUser.jsp");
    _jspx_dependants.add("/User/../Home/image_slider.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title> Sabzi Bazzer </title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap css links -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Enternal file liks -->\r\n");
      out.write("    <link href=\"../Css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"style.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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

      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<!-- Start image slider -->\r\n");
      out.write("<div id=\"carouselExampleFade\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img src=\"../image/Slider 1.jpg\" class=\"d-block w-100\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"../image/Slider 2.jpg\" class=\"d-block w-100\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"../image/Slider 3.jpg\" class=\"d-block w-100\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"../image/Slider 4.jpg\" class=\"d-block w-100\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Next</span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End image slider -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Product items start -->\r\n");
      out.write("    <div class=\"container\"> <br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            ");

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
            
      out.write("\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"product-grid6\">\r\n");
      out.write("                    <div class=\"product-image6\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img class=\"pic-1\" src=\"");
      out.print(Path);
      out.write("\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-content\">\r\n");
      out.write("                        <h3 class=\"title\"><a href=\"#\">");
      out.print(rs.getString("product_name"));
      out.write("</a></h3>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"price\">Rs.");
      out.print(rs.getString("product_price"));
      out.write("\r\n");
      out.write("                            <span>Per: ");
      out.print(rs.getString("product_type"));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"social\">\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"../Addtocart?id=");
      out.print(rs.getString("product_id"));
      out.write("\" data-tip=\"Add to Cart\"   ><i class=\"fa fa-shopping-cart\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                }
                }
                catch(Exception a){}
            
      out.write("\r\n");
      out.write("            <!-- Product items end -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <br><br><br><br>\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    ");
      out.write("<div class=\"footer\" style=\"background-color: black;\">\r\n");
      out.write("    <div class=\"text-center\" style=\"color: white\">\r\n");
      out.write("        <p>Created by Kushal & Soumen</p>\r\n");
      out.write("        <p>Special thanks to our respected Teachers</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
