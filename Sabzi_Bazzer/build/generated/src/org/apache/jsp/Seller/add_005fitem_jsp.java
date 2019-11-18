package org.apache.jsp.Seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fitem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Seller/pageFiles/Seller_SidePanel.jsp");
    _jspx_dependants.add("/Seller/pageFiles/Seller_TopToolbar.jsp");
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
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/Seller_Style.css\">\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js\"></script>\n");
      out.write("  <script src=\"../Javascript/Seller_Style.js\"></script>\n");
      out.write("  <script src=\"../Javascript/Seller_Product_validation.js\"></script>\n");
      out.write("  <title>Add Item</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"dash\">\n");
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
      out.write("                <i class=\"fas fa-user-edit\"></i> My Frofile </a>\r\n");
      out.write("            <a href=\"all_item.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-shopping-bag\"></i> All Item </a>\r\n");
      out.write("                <a href=\"add_item.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-basket\"></i> Add Item </a>\r\n");
      out.write("            <a href=\"Seller.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> My Order </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"dash-app\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("      <main class=\"dash-content\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <h1> ---------Product Details--------- </h1>\n");
      out.write("          <form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"Name\">Product Name : </label>\n");
      out.write("                <input type=\"name\" class=\"form-control\" id=\"product_name\" name=\"product_name\" placeholder=\"Product\">\n");
      out.write("                <span style=\"color:red;\" id=\"e1\"></span>\n");
      out.write("            </div>\n");
      out.write("                       \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"exampleFormControlFile1\">Upload Picture : </label>\n");
      out.write("                <input type=\"file\" class=\"form-control-file\" id=\"product_file\" name=\"product_file\">\n");
      out.write("                <span style=\"color:red;\" id=\"e2\"></span>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"product_quantity\" name=\"product_quantity\" aria-label=\"Text input with dropdown button\" placeholder=\"Number of Quantity\">\n");
      out.write("              <div class=\"input-group-append\">\n");
      out.write("                     <select class=\"form-control\" id=\"product_quantity_type\" name=\"product_quantity_type\">\n");
      out.write("                        <option class=\"hidden\" selected disabled value=\"\">Quantity-type</option>\n");
      out.write("                        <option value=\"What is your Birthdate?\">Kilogram (k.g)</option>\n");
      out.write("                        <option value=\"What is Your old Phone Number\">Piece</option>\n");
      out.write("                        <option value=\"What is your Pet Name?\">Gram (g.m)</option>\n");
      out.write("                    </select>\n");
      out.write("              </div>\n");
      out.write("                <span style=\"color:red;\" id=\"e3\"></span>\n");
      out.write("            </div>   \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"Number\">Price : </label>\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"product_price\" name=\"product_price\" placeholder=\"Price\">\n");
      out.write("                <span style=\"color:red;\" id=\"e4\"></span>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"Exp_date\">\n");
      out.write("                <label for=\"start\" id=\"date_lable\">Expiry date:</label>\n");
      out.write("                <input type=\"date\" id=\"product_Expdate\" name=\"product_Expdate\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("              <span style=\"color:red;\" id=\"e5\"></span>\n");
      out.write("            <div class=\"form-group purple-border\">\n");
      out.write("                <label for=\"exampleFormControlTextarea4\">Description</label>\n");
      out.write("                <textarea class=\"form-control\" id=\"product_desc\" name=\"product_des\" rows=\"3\" placeholder=\"Describe Your Product...\"></textarea>\n");
      out.write("                <span style=\"color:red;\" id=\"e6\"></span>\n");
      out.write("            </div>  \n");
      out.write("            \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <input type=\"submit\" class=\"btn btn-info\" id=\"Sub_button\" value=\"Submit Details\" onclick=\"return product_val()\">\n");
      out.write("            </div> \n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("      </main>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../Javascript/Admin_Style.js\"></script>\n");
      out.write("</body>\n");
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
