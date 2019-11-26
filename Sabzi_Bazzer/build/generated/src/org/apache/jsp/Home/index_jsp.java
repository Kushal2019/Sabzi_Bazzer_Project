package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Home/../PageFiles/navMain.jsp");
    _jspx_dependants.add("/Home/../Home/image_slider.jsp");
    _jspx_dependants.add("/Home/../PageFiles/footerMain.jsp");
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

      out.write("<html>\r\n");
      out.write("     ");

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
    
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title> Sabzi Bazzer </title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap css links -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">    \r\n");
      out.write("\r\n");
      out.write("    <!-- Enternal file liks -->\r\n");
      out.write("    <link href=\"../Css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script  src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\"   crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        $(function() \r\n");
      out.write("        {  \r\n");
      out.write("            $(\"#popModel\").modal('show');\r\n");
      out.write("        });\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-Secondary\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\"\r\n");
      out.write("    aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Cart</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"Mainlogin.jsp\">Login</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("    ");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<!-- Start image slider -->\n");
      out.write("    <div id=\"carouselExampleFade\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img src=\"../image/Slider 1.jpg\" class=\"d-block w-100\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"../image/Slider 2.jpg\" class=\"d-block w-100\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"../image/Slider 3.jpg\" class=\"d-block w-100\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"../image/Slider 4.jpg\" class=\"d-block w-100\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("<!-- End image slider -->\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Product items start -->\r\n");
      out.write("    <div class=\"container\"> <br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"product-grid6\">\r\n");
      out.write("                    <div class=\"product-image6\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img class=\"pic-1\" src=\"../image/Vegetables/Aubergine.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-content\">\r\n");
      out.write("                        <h3 class=\"title\"><a href=\"#\">Aubergine</a></h3>\r\n");
      out.write("                        <div class=\"price\">Rs 18.90\r\n");
      out.write("                            <span>MRP:Rs 20</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"social\">\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"product-grid6\">\r\n");
      out.write("                    <div class=\"product-image6\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img class=\"pic-1\" src=\"../image/Vegetables/Beetroot.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-content\">\r\n");
      out.write("                        <h3 class=\"title\"><a href=\"#\">Beetroot</a></h3>\r\n");
      out.write("                        <div class=\"price\">Rs8.00\r\n");
      out.write("                            <span>MRP:Rs 12</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"social\">\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"product-grid6\">\r\n");
      out.write("                    <div class=\"product-image6\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img class=\"pic-1\" src=\"../image/Vegetables/Black Pepper.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-content\">\r\n");
      out.write("                        <h3 class=\"title\"><a href=\"#\">Black Pepper</a></h3>\r\n");
      out.write("                        <div class=\"price\">Rs11.00\r\n");
      out.write("                            <span>MRP: Rs 30 </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"social\">\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"product-grid6\">\r\n");
      out.write("                    <div class=\"product-image6\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img class=\"pic-1\" src=\"../image/Vegetables/Cabbage.jpg\" width=\"30px\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-content\">\r\n");
      out.write("                        <h3 class=\"title\"><a href=\"#\">Cabbage</a></h3>\r\n");
      out.write("                        <div class=\"price\">Rs11.00\r\n");
      out.write("                            <span>MRP: Rs 30 </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"social\">\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Product items end -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!-- Popup Modal Start -->\r\n");
      out.write("<div id=\"popModel\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <h4 class=\"modal-title\">Popup Title</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("          industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and\r\n");
      out.write("          scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into\r\n");
      out.write("          electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of\r\n");
      out.write("          Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus\r\n");
      out.write("          PageMaker including versions of Lorem Ipsum.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Popup Modal Start -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    ");
      out.write("<footer class=\"py-3 bg-dark\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen... </p>\r\n");
      out.write("    <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis Sir... </p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
