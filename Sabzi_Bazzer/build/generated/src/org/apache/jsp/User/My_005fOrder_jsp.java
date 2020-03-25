package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class My_005fOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/User/PageFiles/User_SidePanel.jsp");
    _jspx_dependants.add("/User/PageFiles/User_TopToolbar.jsp");
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>My Order</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/User_Style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/My_Order_Style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"dash\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"../../Javascript/Admin_Charts.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"dash-nav dash-nav-dark\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <a href=\"#!\" class=\"menu-toggle\">\r\n");
      out.write("                <i class=\"fas fa-bars\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"../Home/index.jsp\" class=\"spur-logo\"><i class=\"fas fa-bolt\"></i> <span>Sabzi Bazzer</span></a>\r\n");
      out.write("        </header>\r\n");
      out.write("        <nav class=\"dash-nav-list\">\r\n");
      out.write("            <a href=\"My_Profile.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-user-edit\"></i> My Profile </a>\r\n");
      out.write("            <a href=\"Add_Address.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-basket\"></i> Add Address </a>\r\n");
      out.write("                <a href=\"My_Order.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> My Order </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        <div class=\"dash-app\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"dash-toolbar\">\r\n");
      out.write("    <a href=\"#menu\" class=\"menu-toggle\">\r\n");
      out.write("        <i class=\"fas fa-bars\" style=\"font-size:30px; color: greenyellow;\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"tools\">\r\n");
      out.write("        <a href=\"../logout.jsp\" class=\"tools-item\">\r\n");
      out.write("            <i class=\"fas fa-sign-out-alt\" style=\"font-size:35px; color: #FF5A00;\" title=\"Logout\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("            <main class=\"dash-content\">\r\n");
      out.write("                <div class=\"container-fluid my-5 d-sm-flex justify-content-center\">\r\n");
      out.write("                    <div class=\"card px-2\">\r\n");
      out.write("                        <div class=\"card-header bg-white\">\r\n");
      out.write("                            <div class=\"row justify-content-between\">\r\n");
      out.write("                                <div class=\"col\">\r\n");
      out.write("                                    <p class=\"text-muted\"> Order ID <span\r\n");
      out.write("                                            class=\"font-weight-bold text-dark\">1222528743</span></p>\r\n");
      out.write("                                    <p class=\"text-muted\"> Place On <span class=\"font-weight-bold text-dark\">12,March\r\n");
      out.write("                                            2019</span> </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"flex-col my-auto\">\r\n");
      out.write("                                    <h6 class=\"ml-auto mr-3\"> <a href=\"#\">Cancel Order</a> </h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"media flex-column flex-sm-row\">\r\n");
      out.write("                                <div class=\"media-body \">\r\n");
      out.write("                                    <h5 class=\"bold\">Blade High Heels Sandals</h5>\r\n");
      out.write("                                    <p class=\"text-muted\"> Qt: 1 Pair</p>\r\n");
      out.write("                                    <h4 class=\"mt-3 mb-4 bold\"> <span class=\"mt-5\">&#x20B9;</span> 1,500 <span\r\n");
      out.write("                                            class=\"small text-muted\"> via (COD) </span></h4>\r\n");
      out.write("                                    <p class=\"text-muted\">Tracking Status on: <span class=\"Today\">11:30pm, Today</span> </p>\r\n");
      out.write("                                </div><img class=\"align-self-center img-fluid\" src=\"https://i.imgur.com/bOcHdBa.jpg\" width=\"180 \" height=\"180\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row px-2\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <ul id=\"progressbar\">\r\n");
      out.write("                                    <li class=\"step0  \" id=\"step1\">PLACED</li>\r\n");
      out.write("                                    <li class=\"step0  text-center\" id=\"step2\">SHIPPED</li>\r\n");
      out.write("                                    <li class=\"step0 text-muted text-right\" id=\"step3\">DELIVERED</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../Javascript/Admin_Style.js\"></script>\r\n");
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
