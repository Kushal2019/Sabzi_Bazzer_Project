package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mainlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Home/../PageFiles/navLog.jsp");
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
      out.write("    <title>Login Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\">\r\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Mainlogin.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .tooltip11 {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  border-bottom: 1px dotted black;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 110%;\r\n");
      out.write("  left: 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tooltip11 .tooltip11text {\r\n");
      out.write("  visibility: hidden;\r\n");
      out.write("  width: 300px;\r\n");
      out.write("  background-color: rgba(0,0,0,0.6);\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  border-radius: 6px;\r\n");
      out.write("  padding: 5px 0;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  bottom: 125%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  margin-left: -60px;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("  transition: opacity 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tooltip11 .tooltip11text::after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 100%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  margin-left: -5px;\r\n");
      out.write("  border-width: 5px;\r\n");
      out.write("  border-style: solid;\r\n");
      out.write("  border-color: #555 transparent transparent transparent;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("#aaa{color: red;}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("      <link href=\"../Css/Loder.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"../Javascript/Mainlogin_Validation.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function errorMag() {\r\n");
      out.write("           document.getElementById(\"aaa\").style.visibility = \"visible\";\r\n");
      out.write("        document.getElementById(\"aaa\").style.opacity = 1;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        function Notfound()\r\n");
      out.write("        {\r\n");
      out.write("             alert(\"This email does not exist\");\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");

    int err=0;
    try
    {
        String error=request.getParameter("error");
        if(error.equals("1"))
        {
            err=1;
        }
        if(error.equals("3"))
        {
            err=2;
        }
    }
    catch(Exception e){}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"");
      out.print((err==1)?((err==2)? "Notfound()":"errorMag()"):"");
      out.write("\">\r\n");
      out.write("    <div id=\"loader\" class=\"center\">\r\n");
      out.write("        <center><img src=\"../image/Sabzi_Logo.png\"></center>\r\n");
      out.write("    </div> \r\n");
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
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Cart</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"../Home/Registration.jsp\">Sign Up</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("    ");

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
      out.write("    <br><br>\r\n");
      out.write("    <div class=\"container h-100\">\r\n");
      out.write("        <div class=\"d-flex justify-content-center h-100\">\r\n");
      out.write("            <div class=\"user_card\">\r\n");
      out.write("                <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                    <div class=\"brand_logo_container\">\r\n");
      out.write("                        <img src=\"../image/Sabzi_Logo.png\" class=\"brand_logo\" alt=\"Logo\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-center form_container\">\r\n");
      out.write("                    <form name=\"login\" action=\"../MainLogin\" method=\"POST\">\r\n");
      out.write("                        <div class=\"input-group mb-3\">\r\n");
      out.write("                            <div class=\"input-group-append\">\r\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"text\" name=\"Login_username\" id=\"Login_username\" class=\"form-control input_user\"\r\n");
      out.write("                                value=\"\" placeholder=\"username\">\r\n");
      out.write("                            <span id=\"Login_username_Error\" style=\"color:red;\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group mb-2\">\r\n");
      out.write("                            <div class=\"input-group-append\">\r\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"password\" name=\"Login_password\" id=\"Login_password\"\r\n");
      out.write("                                class=\"form-control input_pass\" value=\"\" placeholder=\"password\">\r\n");
      out.write("                            <span id=\"Login_password_Error\" style=\"color:red;\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customControlInline\">\r\n");
      out.write("                                <label class=\"custom-control-label\" for=\"customControlInline\"\r\n");
      out.write("                                    style=\"color:#ffff00;\">Accept Terms & Condition\r\n");
      out.write("                                </label>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex justify-content-center mt-8 login_container\">\r\n");
      out.write("                            <input type=\"submit\" name=\"log_sub\" class=\"btn login_btn\"\r\n");
      out.write("                                onclick=\"return Login_Validation()\" value=\"Login\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                      \r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mt-4\">\r\n");
      out.write("                     \r\n");
      out.write("                    <div class=\"d-flex justify-content-center links\" style=\"color:#ffff00;\">\r\n");
      out.write("                        Don't have an account? <a href=\"Registration.jsp\" class=\"ml-2\" style=\"color:#ffff00;\">Sign\r\n");
      out.write("                            Up</a>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <a href=\"#\" data-target=\"#pwdModal\" data-toggle=\"modal\"\r\n");
      out.write("                            style=\"color: tomato; position: relative; left: 78px;\">Forgot my password</a>\r\n");
      out.write("                             <div class=\"tooltip11\">\r\n");
      out.write("                     <span class=\"tooltip11text\" id=\"aaa\">ddddd</span>\r\n");
      out.write("                     </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Forgot Password Model Start-->\r\n");
      out.write("                <div id=\"pwdModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h1 class=\"text-center\">What's My Password ?</h1>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <div class=\"panel panel-default\">\r\n");
      out.write("                                        <div class=\"panel-body\">\r\n");
      out.write("                                            <div class=\"text-center\">\r\n");
      out.write("                                                <p>If you have forgotten your password you can reset it here.</p>\r\n");
      out.write("                                                <form class=\"form-group\" action=\"../SendMail\" method=\"POST\">\r\n");
      out.write("                                                    <div class=\"panel-body\">\r\n");
      out.write("                                                        <fieldset>\r\n");
      out.write("                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                <input class=\"form-control input-lg\"\r\n");
      out.write("                                                                    placeholder=\"E-mail Address\" name=\"email\"\r\n");
      out.write("                                                                    type=\"email\" id=\"email\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"form-group\"><font color=\"red\" id=\"em\"></font></div>\r\n");
      out.write("                                                            <input class=\"btn btn-lg btn-primary btn-block\"\r\n");
      out.write("                                                                value=\"Send My Password\" type=\"submit\" onclick=\"return emailcheck()\">\r\n");
      out.write("                                                        </fieldset>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <div class=\"col-md-7\">\r\n");
      out.write("                                    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\" onClick=\"close()\">Close</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Forgot Password Model End-->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("<footer class=\"py-3 bg-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <p class=\"m-0 text-center text-white\"> This site is made by Kushal & Soumen... </p>\r\n");
      out.write("    <p class=\"m-0 text-center text-danger\"> Special thanks to respected Debashis Sir... </p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("     <script src=\"../Javascript/loder.js\"></script>\r\n");
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
