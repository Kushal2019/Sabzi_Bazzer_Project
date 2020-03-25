package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Home/../PageFiles/navCheckout.jsp");
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>Buy Now</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link href=\"../Css/Buy_Now_Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"model()\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Confirm Modal Start -->\r\n");
      out.write("  <div id=\"myModal\" class=\"modal fade\">\r\n");
      out.write("    <div class=\"modal-dialog modal-confirm\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <div class=\"icon-box\">\r\n");
      out.write("            <i class=\"material-icons\">&#xE876;</i>\r\n");
      out.write("          </div>\r\n");
      out.write("          <h4 class=\"modal-title\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Awesome!</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <p class=\"text-center\">Your order has been confirmed. Check your email for detials.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button class=\"btn btn-success btn-block\" data-dismiss=\"modal\">OK</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Confirm Model End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write(" <br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <form>\r\n");
      out.write("      <div class=\"col-xs-13\">\r\n");
      out.write("        <div class=\"collapse\" id=\"promo\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"form-inline\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputpromo\" placeholder=\"Enter promo code\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-outline-warning\">Apply</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <h3>Select Address..</h3>\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("          <div class=\"list-group-item\">\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("              <div class=\"row radio\">\r\n");
      out.write("                <div class=\"col-xs-3\">\r\n");
      out.write("                  <label><input type=\"radio\" name=\"optionShipp\" id=\"optionShipp1\" value=\"option2\" checked> This is\r\n");
      out.write("                    Address 1...</label>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("              <div class=\"row radio\">\r\n");
      out.write("                <div class=\"col-xs-3\">\r\n");
      out.write("                  <label><input type=\"radio\" name=\"optionShipp\" id=\"optionShipp1\" value=\"option2\"> This is Address\r\n");
      out.write("                    2...</label>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("              <div class=\"row radio\">\r\n");
      out.write("                <div class=\"col-xs-3\">\r\n");
      out.write("                  <label><input type=\"radio\" name=\"optionShipp\" id=\"optionShipp1\" value=\"option2\"> This is Address\r\n");
      out.write("                    3...</label>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <h3>I'll pay with&hellip;</h3>\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("          <div class=\"list-group-item\">\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"list-group-item\">\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("              <div class=\"row radio\">\r\n");
      out.write("                <div class=\"col-xs-3\">\r\n");
      out.write("                  <label data-toggl-e=\"collapse\" data-target=\"#newcard\">\r\n");
      out.write("                    <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\" checked>\r\n");
      out.write("                    New Credit Card\r\n");
      out.write("                  </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-5\">\r\n");
      out.write("                  <div class=\"media\">&nbsp;&nbsp;\r\n");
      out.write("                    <a class=\"media-right\" href=\"#\">\r\n");
      out.write("                      <img src=\"https://lovewithfood.com/assets/credit_cards/cards-b3a7c7b8345355bf110ebedfd6401312.png\"\r\n");
      out.write("                        height=\"25\" alt=\"\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"media-body\" id=\"newcard\">\r\n");
      out.write("                      We accept these credit cards.\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"list-group-item\">\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("              <div class=\"row radio\">\r\n");
      out.write("                <div class=\"col-xs-3\">\r\n");
      out.write("                  <label data-toggl-e=\"collapse\" data-target=\"#newcard\">\r\n");
      out.write("                    <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios3\" value=\"option3\"> Pay with PayPal\r\n");
      out.write("                  </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-5\">\r\n");
      out.write("                  <div class=\"media\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <a class=\"media-right\" href=\"#\">\r\n");
      out.write("                      <img\r\n");
      out.write("                        src=\"https://www.paypalobjects.com/webstatic/mktg/logo-center/PP_Acceptance_Marks_for_LogoCenter_76x48.png\"\r\n");
      out.write("                        height=\"25\" alt=\"\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"media-body\" id=\"newcard\">\r\n");
      out.write("                      You can pay with PayPal\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"list-group-item\">\r\n");
      out.write("            <div class=\"list-group-item-heading\">\r\n");
      out.write("              <div class=\"row radio\">\r\n");
      out.write("                <div class=\"col-xs-3\">\r\n");
      out.write("                  <label data-toggl-e=\"collapse\" data-target=\"#newcard\">\r\n");
      out.write("                    <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\" checked>\r\n");
      out.write("                    Cash on Delivery\r\n");
      out.write("                  </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-5\">\r\n");
      out.write("                  <div class=\"media\"> &nbsp;&nbsp;\r\n");
      out.write("                    <a class=\"media-right\" href=\"#\">\r\n");
      out.write("                      <img src=\"https://static.thenounproject.com/png/580678-200.png\" height=\"25\" alt=\"\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"media-body\" id=\"newcard\">\r\n");
      out.write("                      Payment is to be made on a cash on delivery basis\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label data-toggle=\"collapse\" data-target=\"#promo\">\r\n");
      out.write("            <input type=\"checkbox\"> I have a promo code\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-success btn-lg btn-block\" data-toggle=\"modal\"\r\n");
      out.write("                onclick=\"model()\">Confirm Your Order</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <script>\r\n");
      out.write("      function model()\r\n");
      out.write("      {\r\n");
      out.write("          $(\"#myModal\").modal();\r\n");
      out.write("      }\r\n");
      out.write("      function actionsavlet()\r\n");
      out.write("      {\r\n");
      out.write("          let \r\n");
      out.write("      }\r\n");
      out.write("  </script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
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
