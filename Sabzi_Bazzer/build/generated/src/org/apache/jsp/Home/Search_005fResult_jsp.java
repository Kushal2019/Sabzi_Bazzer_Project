package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Search_005fResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Home/../PageFiles/navMain.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title> Search Result </title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("\t<link href=\"../Css/Search_Result_Style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-dark\">\r\n");
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
      out.write("          <a class=\"nav-link\" href=\"../Home/Empty_Cart.jsp\">Cart</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"Mainlogin.jsp\">Login</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("      <form class=\"form-inline my-2 my-lg-0\" action=\"../Home/Search_Result.jsp\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("<br><br><br>\r\n");
      out.write("    <div style=\"width:90%;margin-left:5%;margin-right:5%;\">\r\n");
      out.write("        <div id=\"container\">\r\n");
      out.write("            <ul class=\"list\">\r\n");
      out.write("                <li style=\"font-family: cursive; font-size: 17px; height: 28px; background-color: yellowgreen;\">&nbsp;&nbsp;&nbsp; You Search for Potato...</li>\r\n");
      out.write("                \r\n");
      out.write("                <!-- This is first search result start -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"https://i1.wp.com/theazb.com/wp-content/uploads/2018/08/xhealth-benefits-of-organic-potatoes-1024x576-pagespeed-ic-6zphs-lh7z.jpg?fit=1024%2C576&ssl=1\" width=\"250\" height=\"250\">\r\n");
      out.write("                    <section class=\"list-left\">\r\n");
      out.write("                        <span class=\"title\">Potato</span>\r\n");
      out.write("                        <p> Fresh New potatoes are freshly picked from the best of farms and as the name suggests they are a new crop. Because of this, they have a thinner skin or peel on top. </p>\r\n");
      out.write("                            <div class=\"icon-group-btn\">\r\n");
      out.write("                                <a title=\"Add to Cart\" href=\"#\" class=\"btn-cart\" onclick=\"\">\r\n");
      out.write("                                    <span class=\"icon-cart\"></span> <span class=\"icon-cart-text\"> Add To Cart </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <div class=\"list-right\">\r\n");
      out.write("                        <span class=\"price\">Rs.45</span><br><br><br>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning btn-lg\" id=\"buy_btn\">Buy Now</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("                <!-- This is first search result end -->\r\n");
      out.write("                \r\n");
      out.write("                <!-- This is second search result start -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"https://images-na.ssl-images-amazon.com/images/I/21SjSwG98CL.jpg\" class=\"img-responsive\" width=\"250\" height=\"250\">\r\n");
      out.write("                    <section class=\"list-left\">\r\n");
      out.write("                        <span class=\"title\">Potato</span>\r\n");
      out.write("                        <p> With a ruby red smooth skin and firm white flesh, red potatoes have a waxy texture and a mild buttery flavour. It has an heavy impact on health. </p>\r\n");
      out.write("                            <div class=\"icon-group-btn\">\r\n");
      out.write("                                <a title=\"Add to Cart\" href=\"#\" class=\"btn-cart\" onclick=\"\">\r\n");
      out.write("                                    <span class=\"icon-cart\"></span> <span class=\"icon-cart-text\"> Add To Cart </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <div class=\"list-right\">\r\n");
      out.write("                        <span class=\"price\">Rs.41</span><br><br><br>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning btn-lg\" id=\"buy_btn\">Buy Now</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("                <!-- This is second search result end -->\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("<div class=\"footer\" style=\"background-color: black;\">\r\n");
      out.write("    <div class=\"text-center\" style=\"color: white\">\r\n");
      out.write("        <p>Created by Kushal & Soumen</p>\r\n");
      out.write("        <p>Special thanks to our respected Teachers</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> ");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
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
