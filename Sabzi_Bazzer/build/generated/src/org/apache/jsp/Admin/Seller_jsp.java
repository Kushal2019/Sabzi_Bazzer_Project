package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Seller_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Admin_all.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Admin_Style.css\">\n");
      out.write("    <script src=\"../Javascript/Admin_all.js\"></script>\n");
      out.write("    <script src=\"../Javascript/Admin_Charts.js\"></script>\n");
      out.write("    <title>Admin Panel</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"dash\">\n");
      out.write("        <div class=\"dash-nav dash-nav-dark\">\n");
      out.write("            <header>\n");
      out.write("                <a href=\"#!\" class=\"menu-toggle\">\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"../Home/index.jsp\" class=\"spur-logo\"><i class=\"fas fa-bolt\"></i> <span>Sabzi Bazzer</span></a>\n");
      out.write("            </header>\n");
      out.write("            <nav class=\"dash-nav-list\">\n");
      out.write("                <a href=\"index.jsp\" class=\"dash-nav-item\">\n");
      out.write("                    <i class=\"fas fa-home\"></i> Dashboard </a>\n");
      out.write("                    <a href=\"Product_List.jsp\" class=\"dash-nav-item\">\n");
      out.write("                    <i class=\"fas fa-shopping-bag\"></i> Product </a>\n");
      out.write("                    <a href=\"Buyer.jsp\" class=\"dash-nav-item\">\n");
      out.write("                    <i class=\"fas fa-user-tie\"></i> Buyer </a>\n");
      out.write("                    <a href=\"Seller.jsp\" class=\"dash-nav-item\">\n");
      out.write("                    <i class=\"fas fa-user-edit\"></i> Seller </a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"dash-app\">\n");
      out.write("            <header class=\"dash-toolbar\">\n");
      out.write("                <a href=\"#!\" class=\"menu-toggle\">\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#!\" class=\"searchbox-toggle\">\n");
      out.write("                    <i class=\"fas fa-search\"></i>\n");
      out.write("                </a>\n");
      out.write("                <form class=\"searchbox\" action=\"#!\">\n");
      out.write("                    <a href=\"#!\" class=\"searchbox-toggle\"> <i class=\"fas fa-arrow-left\"></i> </a>\n");
      out.write("                    <button type=\"submit\" class=\"searchbox-submit\"> <i class=\"fas fa-search\"></i> </button>\n");
      out.write("                    <input type=\"text\" class=\"searchbox-input\" placeholder=\"type to search\">\n");
      out.write("                </form>\n");
      out.write("                <div class=\"tools\">\n");
      out.write("                    <a href=\"https://github.com/HackerThemes/spur-template\" target=\"_blank\" class=\"tools-item\">\n");
      out.write("                        <i class=\"fab fa-github\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#!\" class=\"tools-item\">\n");
      out.write("                        <i class=\"fas fa-bell\"></i>\n");
      out.write("                        <i class=\"tools-item-count\">4</i>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown tools-item\">\n");
      out.write("                        <a href=\"#\" class=\"\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#!\">Profile</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"login.html\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <main class=\"dash-content\">\n");
      out.write("                <div class=\"col-xl-4\">\n");
      out.write("                            <div class=\"stats stats-primary\">\n");
      out.write("                                <h3 class=\"stats-title\"> Sellers </h3>\n");
      out.write("                                <div class=\"stats-content\">\n");
      out.write("                                    <div class=\"stats-icon\">\n");
      out.write("                                        <i class=\"fas fa-user\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"stats-data\">\n");
      out.write("                                        <div class=\"stats-number\">114</div>\n");
      out.write("                                        <div class=\"stats-change\">\n");
      out.write("                                            <span class=\"stats-timeframe\">from last month</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"../Javascript/Admin_Style.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
