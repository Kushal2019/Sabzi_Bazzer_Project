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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title> About </title>\n");
      out.write("  \n");
      out.write("  <!-- Bootstrap css links -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("  <!-- Enternal file liks -->\n");
      out.write("  <link href=\"../Css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navbar start -->\n");
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
      out.write("            <a class=\"nav-link\" href=\"about.jsp\">About</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Cart</a>\n");
      out.write("        </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Mainlogin.jsp\">Login</a>\n");
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
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Copy Start-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light py-3\">\n");
      out.write("  <div class=\"container\"><a href=\"#\" class=\"navbar-brand d-flex align-items-center\"> <i class=\"fa fa-snowflake-o fa-lg text-primary mr-2\"></i><strong>Snowflake</strong></a>\n");
      out.write("    <button type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\" class=\"navbar-toggler\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("    <div id=\"navbarSupportedContent\" class=\"collapse navbar-collapse\">\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> Home </a></li>\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> About </a></li>\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> Services </a></li>\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"bg-light\">\n");
      out.write("  <div class=\"container py-5\">\n");
      out.write("    <div class=\"row h-100 align-items-center py-5\">\n");
      out.write("      <div class=\"col-lg-6\">\n");
      out.write("        <h1 class=\"display-4\">About us page</h1>\n");
      out.write("        <p class=\"lead text-muted mb-0\">Create a minimal about us page using Bootstrap 4.</p>\n");
      out.write("        <p class=\"lead text-muted\">Snippet by <a href=\"https://bootstrapious.com/snippets\" class=\"text-muted\"> \n");
      out.write("                    <u>Bootstrapious</u></a>\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-6 d-none d-lg-block\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834136/illus_kftyh4.png\" alt=\"\" class=\"img-fluid\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"bg-white py-5\">\n");
      out.write("  <div class=\"container py-5\">\n");
      out.write("    <div class=\"row align-items-center mb-5\">\n");
      out.write("      <div class=\"col-lg-6 order-2 order-lg-1\"><i class=\"fa fa-bar-chart fa-2x mb-3 text-primary\"></i>\n");
      out.write("        <h2 class=\"font-weight-light\">Lorem ipsum dolor sit amet</h2>\n");
      out.write("        <p class=\"font-italic text-muted mb-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><a href=\"#\" class=\"btn btn-light px-5 rounded-pill shadow-sm\">Learn More</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-5 px-5 mx-auto order-1 order-lg-2\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834139/img-1_e25nvh.jpg\" alt=\"\" class=\"img-fluid mb-4 mb-lg-0\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row align-items-center\">\n");
      out.write("      <div class=\"col-lg-5 px-5 mx-auto\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834136/img-2_vdgqgn.jpg\" alt=\"\" class=\"img-fluid mb-4 mb-lg-0\"></div>\n");
      out.write("      <div class=\"col-lg-6\"><i class=\"fa fa-leaf fa-2x mb-3 text-primary\"></i>\n");
      out.write("        <h2 class=\"font-weight-light\">Lorem ipsum dolor sit amet</h2>\n");
      out.write("        <p class=\"font-italic text-muted mb-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><a href=\"#\" class=\"btn btn-light px-5 rounded-pill shadow-sm\">Learn More</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"bg-light py-5\">\n");
      out.write("  <div class=\"container py-5\">\n");
      out.write("    <div class=\"row mb-4\">\n");
      out.write("      <div class=\"col-lg-5\">\n");
      out.write("        <h2 class=\"display-4 font-weight-light\">Our team</h2>\n");
      out.write("        <p class=\"font-italic text-muted\">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row text-center\">\n");
      out.write("      <!-- Team item-->\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834132/avatar-4_ozhrib.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("          <h5 class=\"mb-0\">Manuella Nevoresky</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End-->\n");
      out.write("\n");
      out.write("      <!-- Team item-->\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834130/avatar-3_hzlize.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("          <h5 class=\"mb-0\">Samuel Hardy</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End-->\n");
      out.write("\n");
      out.write("      <!-- Team item-->\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834133/avatar-2_f8dowd.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("          <h5 class=\"mb-0\">Tom Sunderland</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End-->\n");
      out.write("\n");
      out.write("      <!-- Team item-->\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834133/avatar-1_s02nlg.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("          <h5 class=\"mb-0\">John Tarly</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"bg-light pb-5\">\n");
      out.write("  <div class=\"container text-center\">\n");
      out.write("    <p class=\"font-italic text-muted mb-0\">&copy; Copyrights Company.com All rights reserved.</p>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("        <!-- Copy End-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Footer start -->\n");
      out.write("        ");
      out.write("\n");
      out.write(" <footer class=\"py-5 bg-dark \">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen </p>\n");
      out.write("      <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis sir... </p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("        <!-- Footer end -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
