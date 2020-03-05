package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Empty_005fCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Home/../PageFiles/navMain.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Empty Cart</title>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .container{\r\n");
      out.write("                background: -webkit-linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), -webkit-linear-gradient(110deg, #dd0000 66%, #ffc608 66%);\r\n");
      out.write("                background: -o-linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), -o-linear-gradient(110deg, #dd0000 66%, #ffc608 66%);\r\n");
      out.write("                background: -moz-linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), -moz-linear-gradient(110deg, #dd0000 66%, #ffc608 66%);\r\n");
      out.write("                background: linear-gradient(110deg, #000 33%, rgba(0, 0, 0, 0) 33%), linear-gradient(110deg, #dd0000 66%, #ffc608 66%);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
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
      out.write("    <form class=\"form-inline my-2 my-lg-0\" >\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <br><br><br><br><br><br>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"text-center\"><br>\r\n");
      out.write("                <h1> &nbsp; Your Cart is empty</h1><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-warning btn-lg\" onClick=\"location.href='index.jsp'\">Continue Shopping</button><br><br><br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
