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

      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Registation Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Css/Mainlogin.css\">\r\n");
      out.write("         <link  rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Registration_Style.css\">\r\n");
      out.write("         \r\n");
      out.write("         <script type=\"text/javascript\" src=\"../Javascript/Registration_Validation.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<!--Coded with love by Mutiullah Samim-->\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write(" <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-Secondary\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("        <li class=\"nav-item active\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Cart</a>\r\n");
      out.write("        </li>\r\n");
      out.write("       <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"Mainlogin.jsp\">Login</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    </nav>");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"container register\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3 register-left\">\r\n");
      out.write("                        <img src=\"../image/Sabzi_Logo.png\" alt=\"\" />\r\n");
      out.write("                        <h3>Welcome</h3>\r\n");
      out.write("                        <p>You are 30 seconds away from earning your own money!</p>\r\n");
      out.write("                        <input type=\"submit\" name=\"\" value=\"Login\"/><br/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-9 register-right\">\r\n");
      out.write("                        <ul class=\"nav nav-tabs nav-justified\" id=\"myTab\" role=\"tablist\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"false\">User</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"true\">Seller</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\r\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\r\n");
      out.write("                               <form> \r\n");
      out.write("                                <h3 class=\"register-heading\">Apply as a User</h3>\r\n");
      out.write("                                <div class=\"row register-form\">\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"First Name *\" name=\"u_f_name\" id=\"u_f_name\"  />\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e1\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Last Name *\" value=\"\" name=\"u_last_name\" id=\"u_last_name\"/>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e2\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Password *\" value=\"\" name=\"u_password\" id=\"u_password\"/>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e3\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\"  placeholder=\"Confirm Password *\" value=\"\" name=\"u_c_password\" id=\"u_c_password\"/>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e4\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"maxl\">\r\n");
      out.write("                                                <label class=\"radio inline\"> \r\n");
      out.write("                                                    <input type=\"radio\" name=\"u_gender\" value=\"male\" checked  id=\"male\">\r\n");
      out.write("                                                    <span> Male </span> \r\n");
      out.write("                                                </label>\r\n");
      out.write("                                                <label class=\"radio inline\"> \r\n");
      out.write("                                                    <input type=\"radio\" name=\"u_gender\" value=\"female\" id=\"female\">\r\n");
      out.write("                                                    <span>Female </span> \r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Your Email *\" value=\"\" name=\"u_email\" id=\"u_email\"/>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e5\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" minlength=\"10\" maxlength=\"10\" name=\"txtEmpPhone\" class=\"form-control\" placeholder=\"Your Phone *\" value=\"\" id=\"txtEmpPhone\"/>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e6\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <select class=\"form-control\" name=\"u_s_question\" id=\"u_s_question\" onchange=\"SQ()\">\r\n");
      out.write("                                                <option class=\"hidden\"  selected disabled value=\"\">Please select your Sequrity Question</option>\r\n");
      out.write("                                                <option value=\"What is your Birthdate?\">What is your Birthdate?</option>\r\n");
      out.write("                                                <option value=\"What is Your old Phone Number\">What is Your old Phone Number</option>\r\n");
      out.write("                                                <option value=\"What is your Pet Name?\">What is your Pet Name?</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e7\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Your Answer *\" disabled value=\"\" name=\"u_s_answer\" id=\"u_s_answer\"/>\r\n");
      out.write("                                            <span style=\"color:red;\" id=\"e8\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\"  value=\"Register\" onclick=\"return User_validation()\"/>      \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"tab-pane fade show\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\r\n");
      out.write("                                <form>\r\n");
      out.write("                                <h3  class=\"register-heading\">Apply as a Seller</h3>\r\n");
      out.write("                                <div class=\"row register-form\">\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"First Name *\" value=\"\" name=\"s_f_name\" id=\"s_f_name\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Last Name *\" value=\"\" name=\"s_last_name\" id=\"s_last_name\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Password *\" value=\"\" name=\"s_password\" id=\"s_password\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Confirm Password *\" value=\"\" name=\"s_c_password\" id=\"s_c_password\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Company name *\" value=\"\" name=\"s_Company\" id=\"s_Company\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Licence Number *\" value=\"\" name=\"s_licence\" id=\"s_licence\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Email *\" value=\"\" name=\"s_email\" id=\"s_email\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" maxlength=\"10\" minlength=\"10\" class=\"form-control\" placeholder=\"Phone *\" value=\"\" name=\"s_phone\" id=\"s_phone\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"maxl\">\r\n");
      out.write("                                                <label class=\"radio inline\"> \r\n");
      out.write("                                                    <input type=\"radio\" name=\"s_gender\" value=\"male\" checked  id=\"male\">\r\n");
      out.write("                                                    <span> Male </span> \r\n");
      out.write("                                                </label>\r\n");
      out.write("                                                <label class=\"radio inline\"> \r\n");
      out.write("                                                    <input type=\"radio\" name=\"s_gender\" value=\"female\" id=\"female\">\r\n");
      out.write("                                                    <span>Female </span> \r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                         \r\n");
      out.write("                                       <div class=\"form-group\">\r\n");
      out.write("                                           <select class=\"form-control\" name=\"s_state\" id=\"s_state\" onchange=\"state()\">\r\n");
      out.write("                                                <option class=\"hidden\"  selected disabled>Select your State *</option>\r\n");
      out.write("                                                <option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("                                                <option value=\"Bihar\">Bihar</option>\r\n");
      out.write("                                                <option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("                                                <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("                                                <option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("                                                <option value=\"Odisha\">Odisha</option>\r\n");
      out.write("                                                <option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("                                                <option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("                                                <option value=\"Delhi\">Delhi</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <select class=\"form-control\" name=\"s_city\" id=\"s_town\">\r\n");
      out.write("                                                <option class=\"hidden\"  selected disabled>Select your Town *</option>\r\n");
      out.write("                                                <option>Unknown Town</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Zip Code *\" value=\"\" name=\"s_zip\" id=\"s_zip\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Street *\" value=\"\" name=\"s_street\" id=\"s_street\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"House Number *\" value=\"\" name=\"s_house\" id=\"s_house\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Landmark *\" value=\"\" name=\"s_landmark\" id=\"s_landmark\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                         <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter the capctha *\" value=\"\" name=\"s_landmark\" id=\"s_landmark\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"hidden\" class=\"form-control\" value=\"hi\" name=\"captext\" id=\"captext\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\"  value=\"Register\" onclick=\"Seller_validation()\"/>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("    </form>\r\n");
      out.write("     ");
      out.write(" <footer class=\"py-3 bg-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen </p>\r\n");
      out.write("      <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis sir... </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("  \r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
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
