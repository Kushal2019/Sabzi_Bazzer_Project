package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Home/../PageFiles/navView_Product.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>View Product</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Product_View_Style.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\"> Sabzi Bazzer </a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\"\n");
      out.write("    aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"about.jsp\">About</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"../Home/View_Cart.jsp\">Cart</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"Mainlogin.jsp\">Login</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\" >\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <div class=\"col-md-9\">\n");
      out.write("        <section class=\"panel\">\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"pro-img-details\">\n");
      out.write("                        <img src=\"http://thevectorlab.net/flatlab/img/product-list/pro-thumb-big.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pro-img-list\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img src=\"http://thevectorlab.net/flatlab/img/product-list/pro-thumb-1.jpg\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img src=\"http://thevectorlab.net/flatlab/img/product-list/pro-thumb-2.jpg\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img src=\"http://thevectorlab.net/flatlab/img/product-list/pro-thumb-3.jpg\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img src=\"http://thevectorlab.net/flatlab/img/product-list/pro-thumb-1.jpg\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h4 class=\"pro-d-title\">\n");
      out.write("                        <a href=\"#\" class=\"\">\n");
      out.write("                            Leopard Shirt Dress\n");
      out.write("                        </a>\n");
      out.write("                    </h4>\n");
      out.write("                    <p>\n");
      out.write("                        Praesent ac condimentum felis. Nulla at nisl orci, at dignissim dolor, The best product\n");
      out.write("                        descriptions address your ideal buyer directly and personally. The best product descriptions\n");
      out.write("                        address your ideal buyer directly and personally.\n");
      out.write("                    </p>\n");
      out.write("                    <div class=\"product_meta\">\n");
      out.write("                        <span class=\"posted_in\"> <strong>Categories:</strong> <a rel=\"tag\" href=\"#\">Jackets</a>, <a\n");
      out.write("                                rel=\"tag\" href=\"#\">Men</a>, <a rel=\"tag\" href=\"#\">Shirts</a>, <a rel=\"tag\"\n");
      out.write("                                href=\"#\">T-shirt</a>.</span>\n");
      out.write("                        <span class=\"tagged_as\"><strong>Tags:</strong> <a rel=\"tag\" href=\"#\">mens</a>, <a rel=\"tag\"\n");
      out.write("                                href=\"#\">womens</a>.</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"m-bot15\"> <strong>Price : </strong> <span class=\"amount-old\">$544</span> <span\n");
      out.write("                            class=\"pro-price\"> $300.00</span></div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Quantity</label>\n");
      out.write("                        <input type=\"quantiy\" class=\"form-control quantity\">\n");
      out.write("                    </div>\n");
      out.write("                    <p>\n");
      out.write("                        <button class=\"btn btn-round btn-danger\" type=\"button\"><i class=\"fa fa-shopping-cart\"></i> Add\n");
      out.write("                            to Cart</button>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
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
