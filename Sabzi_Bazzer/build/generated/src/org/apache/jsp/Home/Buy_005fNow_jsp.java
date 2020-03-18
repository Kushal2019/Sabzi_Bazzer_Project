package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Buy_005fNow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Buy Now</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css\">\n");
      out.write("        <link href=\"../Css/Buy_Now_Style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- Confirm Modal Start -->\n");
      out.write("<div id=\"myModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog modal-confirm\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<div class=\"icon-box\">\n");
      out.write("\t\t\t\t\t<i class=\"material-icons\">&#xE876;</i>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">Awesome!</h4>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<p class=\"text-center\">Your booking has been confirmed. Check your email for detials.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-success btn-block\" data-dismiss=\"modal\">OK</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div> \n");
      out.write("<!-- Confirm Model End -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("<script>\r\n");
      out.write("        function valSearch()\r\n");
      out.write("        {\r\n");
      out.write("    let val=document.getElementById(\"search\").value;\r\n");
      out.write("    if(val==\"\")\r\n");
      out.write("    {\r\n");
      out.write("     \r\n");
      out.write("    }else\r\n");
      out.write("    {\r\n");
      out.write("       window.location=\"../Home/Search_Result.jsp?search=\"+val;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
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
      out.write("      <form class=\"form-inline my-2 my-lg-0\" >\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" id=\"search\" placeholder=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"button\" onclick=\"valSearch()\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write(" <br><br><br><br>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("  <div class=\"page-header\">\n");
      out.write("    <h1>Checkout your Order...</h1>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-xs-13\">\n");
      out.write("      <div class=\"checkbox\">\n");
      out.write("        <label data-toggle=\"collapse\" data-target=\"#promo\">\n");
      out.write("          <input type=\"checkbox\"> I have a promo code\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse\" id=\"promo\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"inputpromo\" class=\"control-label\">Promo Code</label>\n");
      out.write("          <div class=\"form-inline\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"inputpromo\" placeholder=\"Enter promo code\">\n");
      out.write("            <button class=\"btn btn-sm\">Apply</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <h3>Select Address..</h3>\n");
      out.write("      <div class=\"list-group\">\n");
      out.write("        <div class=\"list-group-item\">\n");
      out.write("          <div class=\"list-group-item-heading\">          \n");
      out.write("              <div class=\"row radio\">\n");
      out.write("                <div class=\"col-xs-3\">\n");
      out.write("                    <label><input type=\"radio\" name=\"optionShipp\" id=\"optionShipp1\" value=\"option2\"> This is Address 1...</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"list-group-item-heading\">          \n");
      out.write("              <div class=\"row radio\">\n");
      out.write("                <div class=\"col-xs-3\">\n");
      out.write("                    <label><input type=\"radio\" name=\"optionShipp\" id=\"optionShipp1\" value=\"option2\"> This is Address 2...</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"list-group-item-heading\">          \n");
      out.write("              <div class=\"row radio\">\n");
      out.write("                <div class=\"col-xs-3\">\n");
      out.write("                    <label><input type=\"radio\" name=\"optionShipp\" id=\"optionShipp1\" value=\"option2\"> This is Address 3...</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <h3>I'll pay with&hellip;</h3>\n");
      out.write("      <div class=\"list-group\">\n");
      out.write("        <div class=\"list-group-item\">\n");
      out.write("          <div class=\"list-group-item-heading\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"list-group-item\">\n");
      out.write("          <div class=\"list-group-item-heading\">          \n");
      out.write("              <div class=\"row radio\">\n");
      out.write("                <div class=\"col-xs-3\">\n");
      out.write("                  <label data-toggl-e=\"collapse\" data-target=\"#newcard\">\n");
      out.write("                      <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\" checked>\n");
      out.write("                    New Credit Card\n");
      out.write("                  </label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-5\">                      \n");
      out.write("                  <div class=\"media\">\n");
      out.write("                    <a class=\"media-right\" href=\"#\">\n");
      out.write("                      <img src=\"https://lovewithfood.com/assets/credit_cards/cards-b3a7c7b8345355bf110ebedfd6401312.png\" height=\"25\" alt=\"\" />\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"media-body\" id=\"newcard\">\n");
      out.write("                      We accept these credit cards.\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"list-group-item\">\n");
      out.write("          <div class=\"list-group-item-heading\">          \n");
      out.write("              <div class=\"row radio\">\n");
      out.write("                <div class=\"col-xs-3\">\n");
      out.write("                  <label data-toggl-e=\"collapse\" data-target=\"#newcard\">\n");
      out.write("                      <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios3\" value=\"option3\" >\n");
      out.write("                    New Credit Card\n");
      out.write("                  </label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-5\">                      \n");
      out.write("                  <div class=\"media\">\n");
      out.write("                    <a class=\"media-right\" href=\"#\">\n");
      out.write("                      <img src=\"https://www.paypalobjects.com/webstatic/mktg/logo-center/PP_Acceptance_Marks_for_LogoCenter_76x48.png\" height=\"25\" alt=\"\" />\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"media-body\" id=\"newcard\">\n");
      out.write("                      We accept these credit cards.\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Confirm Your Order</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../Javascript/Buy_Now_Style.js\"></script>\n");
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
