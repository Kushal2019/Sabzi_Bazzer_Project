package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Home/../PageFiles/navAbout.jsp");
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title> About </title>\r\n");
      out.write("  \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <link href=\"../Css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar start -->\r\n");
      out.write("  ");
      out.write("<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-Secondary\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\"\r\n");
      out.write("    aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
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
      out.write("  <!-- Navbar end -->\r\n");
      out.write("\r\n");
      out.write("  <div class=\"bg-light\">\r\n");
      out.write("    <div class=\"container py-3\">\r\n");
      out.write("      <div class=\"row h-100 align-items-center py-5\">\r\n");
      out.write("        <div class=\"col-lg-6\">\r\n");
      out.write("          <h1 class=\"display-4\">About Sabzi-Bazzer</h1>\r\n");
      out.write("          <p class=\"lead text-muted mb-0\">Sabzi-Bazzer is India's largest online food and sabzi store. Discover new\r\n");
      out.write("            products and shop for all your food and sabzi needs from the comfort of your home or office.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("          <div class=\"col-lg-6 d-none d-lg-block\"><img src=\"../image/About_Us/About_1.jpg.jpg\" class=\"img-fluid\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"bg-light py-5\">\r\n");
      out.write("    <div class=\"container py-5\">\r\n");
      out.write("      <div class=\"row mb-4\">\r\n");
      out.write("        <div class=\"col-lg-5\">\r\n");
      out.write("          <h2 class=\"display-4 font-weight-light\">Our team</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row text-center\">\r\n");
      out.write("        <!-- Team item-->\r\n");
      out.write("        <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("          <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"../image/Team_Member_Pic/Kushal.jpg\" width=\"170\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("            <h5 class=\"mb-0\">Kushal Mukherjee</h5><span class=\"small text-uppercase text-muted\">Devoloper</span>\r\n");
      out.write("            <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End-->\r\n");
      out.write("\r\n");
      out.write("        <!-- Team item-->\r\n");
      out.write("        <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("          <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"../image/Team_Member_Pic/Soumen.JPG\" width=\"170\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("            <h5 class=\"mb-0\">Soumen Mandal</h5><span class=\"small text-uppercase text-muted\">Devoloper</span>\r\n");
      out.write("            <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End-->\r\n");
      out.write("\r\n");
      out.write("        <!-- Team item-->\r\n");
      out.write("        <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("          <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"../image/Team_Member_Pic/Suman.JPG\" width=\"170\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("            <h5 class=\"mb-0\">Suman Dhara</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\r\n");
      out.write("            <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End-->\r\n");
      out.write("\r\n");
      out.write("        <!-- Team item-->\r\n");
      out.write("        <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("          <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"../image/Team_Member_Pic/Sankho.jpeg\" width=\"170\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("            <h5 class=\"mb-0\">Sankho Subro Dorie </h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\r\n");
      out.write("            <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("              <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End-->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  ");
      out.write("<footer class=\"py-3 bg-dark\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen... </p>\r\n");
      out.write("    <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis Sir... </p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        \r\n");
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
