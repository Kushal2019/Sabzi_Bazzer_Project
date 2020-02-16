package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/User/navUser.jsp");
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title> Sabzi Bazzer </title>\n");
      out.write("  \n");
      out.write("  <!-- Bootstrap css links -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("  <!-- Enternal file liks -->\n");
      out.write("  <link href=\"../Css/style.css\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"style.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navbar start -->\n");
      out.write("\n");
      out.write("    ");
      out.write(" <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-Secondary\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"about.jsp\">About</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"\">Cart</a>\n");
      out.write("        </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("           <a class=\"nav-link\" href=\"../Home/index.jsp\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("        <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\n");
      out.write("        <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("    <!-- Navbar end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Start image slider -->\n");
      out.write("  <div id=\"carouselExampleFade\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("        <img src=\"../image/Slider1.jpg\" class=\"d-block w-100\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"../image/Slider2.jpg\" class=\"d-block w-100\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"../image/Slider3.jpg\" class=\"d-block w-100\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("  <!-- End image slider -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Product items start -->\n");
      out.write("  <div class=\"container\"> <br>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("            <div class=\"product-grid6\">\n");
      out.write("                <div class=\"product-image6\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"pic-1\" src=\"../image/Vegetables/Aubergine.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-content\">\n");
      out.write("                    <h3 class=\"title\"><a href=\"#\">Aubergine</a></h3>\n");
      out.write("                    <div class=\"price\">Rs 18.90\n");
      out.write("                        <span>MRP:Rs 20</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"social\">\n");
      out.write("                    <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("            <div class=\"product-grid6\">\n");
      out.write("                <div class=\"product-image6\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"pic-1\" src=\"../image/Vegetables/Beetroot.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-content\">\n");
      out.write("                    <h3 class=\"title\"><a href=\"#\">Beetroot</a></h3>\n");
      out.write("                    <div class=\"price\">Rs8.00\n");
      out.write("                        <span>MRP:Rs 12</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"social\">\n");
      out.write("                    <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("            <div class=\"product-grid6\">\n");
      out.write("                <div class=\"product-image6\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"pic-1\" src=\"../image/Vegetables/Black Pepper.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-content\">\n");
      out.write("                    <h3 class=\"title\"><a href=\"#\">Black Pepper</a></h3>\n");
      out.write("                    <div class=\"price\">Rs11.00\n");
      out.write("                        <span>MRP: Rs 30 </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"social\">\n");
      out.write("                    <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("            <div class=\"product-grid6\">\n");
      out.write("                <div class=\"product-image6\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"pic-1\" src=\"../image/Vegetables/Cabbage.jpg\" width=\"30px\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-content\">\n");
      out.write("                    <h3 class=\"title\"><a href=\"#\">Cabbage</a></h3>\n");
      out.write("                    <div class=\"price\">Rs11.00\n");
      out.write("                        <span>MRP: Rs 30 </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"social\">\n");
      out.write("                    <li><a href=\"\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Wishlist\"><i class=\"fa fa-shopping-bag\"></i></a></li>\n");
      out.write("                    <li><a href=\"\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("          <!-- Product items end -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
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
      out.write("    <!-- Footer -->\n");
      out.write("    ");
      out.write("\n");
      out.write(" <footer class=\"py-5 bg-dark \">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen </p>\n");
      out.write("      <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis sir... </p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
