package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Home/../PageFiles/navReg.jsp");
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
      out.write("    \n");
      out.write("<head>\n");
      out.write("\t<title>Registation Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Css/Mainlogin.css\">\n");
      out.write("         <link  rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Registration_Style.css\">\n");
      out.write("         <script type=\"text/javascript\" src=\"js/index.js\"></script>\n");
      out.write("         <script type=\"text/javascript\" src=\"../Javascript/Registration_Validation.js\"></script>\n");
      out.write("</head>\n");
      out.write("<!--Coded with love by Mutiullah Samim-->\n");
      out.write("<body>\n");
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
      out.write("          <a class=\"nav-link\" href=\"#\">Cart</a>\n");
      out.write("        </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Mainlogin.jsp\">Login</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container register\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 register-left\">\n");
      out.write("                        <img src=\"../image/Sabzi_Logo.png\" alt=\"\" />\n");
      out.write("                        <h3>Welcome</h3>\n");
      out.write("                        <p>You are 30 seconds away from earning your own money!</p>\n");
      out.write("                        <input type=\"submit\" name=\"\" value=\"Login\"/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-9 register-right\">\n");
      out.write("                        <ul class=\"nav nav-tabs nav-justified\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"false\">User</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"true\">Seller</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                               <form> \n");
      out.write("                                <h3 class=\"register-heading\">Apply as a User</h3>\n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"First Name *\" value=\"\" name=\"u_f_name\" id=\"u_f_name\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Last Name *\" value=\"\" name=\"u_last_name\" id=\"u_last_name\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Password *\" value=\"\" name=\"u_password\" id=\"u_password\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\"  placeholder=\"Confirm Password *\" value=\"\" name=\"u_c_password\" id=\"u_c_password\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"maxl\">\n");
      out.write("                                                <label class=\"radio inline\"> \n");
      out.write("                                                    <input type=\"radio\" name=\"u_gender\" value=\"male\" checked  id=\"u_gender\">\n");
      out.write("                                                    <span> Male </span> \n");
      out.write("                                                </label>\n");
      out.write("                                                <label class=\"radio inline\"> \n");
      out.write("                                                    <input type=\"radio\" name=\"u_gender\" value=\"female\" id=\"u_gender\">\n");
      out.write("                                                    <span>Female </span> \n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Your Email *\" value=\"\" name=\"u_email\" id=\"u_email\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" minlength=\"10\" maxlength=\"10\" name=\"txtEmpPhone\" class=\"form-control\" placeholder=\"Your Phone *\" value=\"\" id=\"txtEmpPhone\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select class=\"form-control\" name=\"u_s_question\" id=\"u_s_question\">\n");
      out.write("                                                <option class=\"hidden\"  selected disabled>Please select your Sequrity Question</option>\n");
      out.write("                                                <option>What is your Birthdate?</option>\n");
      out.write("                                                <option>What is Your old Phone Number</option>\n");
      out.write("                                                <option>What is your Pet Name?</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Your Answer *\" value=\"\" name=\"u_s_answer\" id=\"u_s_answer\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\"  value=\"Register\" onclick=\"validation()\"/>      \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane fade show\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\n");
      out.write("                                <form>\n");
      out.write("                                <h3  class=\"register-heading\">Apply as a Seller</h3>\n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"First Name *\" value=\"\" name=\"s_f_name\" id=\"s_f_name\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Last Name *\" value=\"\" name=\"s_last_name\" id=\"s_last_name\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Email *\" value=\"\" name=\"s_email\" id=\"s_email\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" maxlength=\"10\" minlength=\"10\" class=\"form-control\" placeholder=\"Phone *\" value=\"\" name=\"s_phone\" id=\"s_phone\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Password *\" value=\"\" name=\"s_password\" id=\"s_password\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Confirm Password *\" value=\"\" name=\"s_c_password\" id=\"s_c_password\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select class=\"form-control\" name=\"s_s_question\" id=\"s_s_question\">\n");
      out.write("                                                <option class=\"hidden\"  selected disabled>Please select your Sequrity Question</option>\n");
      out.write("                                                <option>What is your Birthdate?</option>\n");
      out.write("                                                <option>What is Your old Phone Number</option>\n");
      out.write("                                                <option>What is your Pet Name?</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"`Answer *\" value=\"\" name=\"s_s_answer\" id=\"s_s_answer\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\"  value=\"Register\" />\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </form>\n");
      out.write("     ");
      out.write(" <footer class=\"py-3 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen </p>\n");
      out.write("      <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis sir... </p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  \n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
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
