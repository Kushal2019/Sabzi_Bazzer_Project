package org.apache.jsp.Admin.pageFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fsidePaneel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Admin_Style.css\">\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js\"></script>\n");
      out.write("    <script src=\"../Javascript/Admin_Charts.js\"></script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"dash-nav dash-nav-dark\">\n");
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
