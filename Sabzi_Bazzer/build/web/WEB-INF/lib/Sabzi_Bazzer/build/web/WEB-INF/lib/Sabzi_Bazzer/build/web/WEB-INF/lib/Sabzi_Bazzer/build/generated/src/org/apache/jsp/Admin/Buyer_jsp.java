package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.sabzi_bazzer.Database;

public final class Buyer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/pageFiles/admin_sidePaneel.jsp");
    _jspx_dependants.add("/Admin/pageFiles/admin_topToolbar.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Admin_Style.css\">\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"../Javascript/Admin_Charts.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("      function activate(id)\r\n");
      out.write("      {\r\n");
      out.write("          var loc=\"BuyerAction.jsp?activate=\"+id;\r\n");
      out.write("          window.location=loc;\r\n");
      out.write("      }\r\n");
      out.write("      function deActivate(id)\r\n");
      out.write("      {\r\n");
      out.write("          var loc=\"BuyerAction.jsp?deActivate=\"+id;\r\n");
      out.write("          window.location=loc;\r\n");
      out.write("      }\r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("  <title>Admin Panel</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"dash\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../Css/Admin_Style.css\">\r\n");
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
      out.write("            <a href=\"index.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-home\"></i> Dashboard </a>\r\n");
      out.write("            <a href=\"Product_List.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-shopping-bag\"></i> Product </a>\r\n");
      out.write("            <a href=\"Buyer.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-user-tie\"></i> Buyer </a>\r\n");
      out.write("            <a href=\"Seller.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-user-edit\"></i> Seller </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"dash-app\">\r\n");
      out.write("\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"dash-toolbar\">\r\n");
      out.write("    <a href=\"#!\" class=\"menu-toggle\">\r\n");
      out.write("        <i class=\"fas fa-bars\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"#!\" class=\"searchbox-toggle\">\r\n");
      out.write("        <i class=\"fas fa-search\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <form class=\"searchbox\" action=\"#!\">\r\n");
      out.write("        <a href=\"#!\" class=\"searchbox-toggle\"> <i class=\"fas fa-arrow-left\"></i> </a>\r\n");
      out.write("        <button type=\"submit\" class=\"searchbox-submit\"> <i class=\"fas fa-search\"></i> </button>\r\n");
      out.write("        <input type=\"text\" class=\"searchbox-input\" placeholder=\"type to search\">\r\n");
      out.write("    </form>\r\n");
      out.write("    <div class=\"tools\">\r\n");
      out.write("        <a href=\"#!\" class=\"tools-item\">\r\n");
      out.write("            <i class=\"fas fa-bell\"></i>\r\n");
      out.write("            <i class=\"tools-item-count\">1000</i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown tools-item\">\r\n");
      out.write("            <a href=\"#\" class=\"\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <i class=\"fas fa-user\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#!\">Profile</a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"../logout.jsp\">Logout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("      <main class=\"dash-content\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <table class=\"table table-dark table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>Firstname</th>\r\n");
      out.write("                <th>Lastname</th>\r\n");
      out.write("                <th>Email</th>\r\n");
      out.write("                <th>Phone Number</th>\r\n");
      out.write("                <th>Gender</th>\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("                <th>Permission</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                ");

                   try {
                         ResultSet rs = new Database().Buyerdetails();  
                         while(rs.next())
                         {
                
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <td>");
      out.print(rs.getString("first_name"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs.getString("last_name"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs.getString("email"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs.getString("ph_number"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs.getString("gender"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print((rs.getString("isactive").toString().equals("1"))?"Activated":"Disabled");
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <button type=\"button\" onclick=\"activate('");
      out.print(rs.getString("email"));
      out.write("')\" class=\"btn btn-labeled btn-success\">\r\n");
      out.write("                    Enable <span class=\"btn-label\"><i class=\"fa fa-check\"></i></span></button>\r\n");
      out.write("                    <button type=\"button\" onclick=\"deActivate('");
      out.print(rs.getString("email"));
      out.write("')\" class=\"btn btn-labeled btn-danger\">\r\n");
      out.write("                    Disable <span class=\"btn-label\"><i class=\"fa fa-close\"></i></span></button>\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
            
                  }
                }
                catch(Exception e){}
               
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </main>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"../Javascript/Admin_Style.js\"></script>\r\n");
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
