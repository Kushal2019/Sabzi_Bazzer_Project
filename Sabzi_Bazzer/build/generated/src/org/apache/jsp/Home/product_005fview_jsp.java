package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Home/../PageFiles/navMain.jsp");
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Product View</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("    <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>\n");
      out.write("    <link href='https://use.fontawesome.com/releases/v5.7.2/css/all.css'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/product_view_style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("    <form class=\"form-inline my-2 my-lg-0\" >\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"search\" placeholder=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("<br><br><br>\n");
      out.write("    <div class=\"super_container\">\n");
      out.write("    <div class=\"single_product\">\n");
      out.write("        <div class=\"container-fluid\" style=\" background-color: #fff; padding: 11px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-2 order-lg-1 order-2\">\n");
      out.write("                    <ul class=\"image_list\">\n");
      out.write("                        <li data-image=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713229/single_4.jpg\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713229/single_4.jpg\" alt=\"\"></li>\n");
      out.write("                        <li data-image=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713228/single_2.jpg\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713228/single_2.jpg\" alt=\"\"></li>\n");
      out.write("                        <li data-image=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713228/single_3.jpg\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713228/single_3.jpg\" alt=\"\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 order-lg-2 order-1\">\n");
      out.write("                    <div class=\"image_selected\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1565713229/single_4.jpg\" alt=\"\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 order-3\">\n");
      out.write("                    <div class=\"product_description\">\n");
      out.write("                        <div class=\"product_name\">Acer Aspire 3 Celeron Dual Core - (2 GB/500 GB HDD/Windows 10 Home) A315-33 Laptop (15.6 inch, Black, 2.1 kg)</div>\n");
      out.write("                        <div class=\"product-rating\"><span class=\"badge badge-success\"><i class=\"fa fa-star\"></i> 4.5 Star</span> <span class=\"rating-review\">35 Ratings & 45 Reviews</span></div>\n");
      out.write("                        <div> <span class=\"product_price\">₹ 29,000</span> </div>\n");
      out.write("                        <hr class=\"singleline\">\n");
      out.write("                        <div> <span class=\"product_info\">EMI starts at ₹ 2,000. No Cost EMI Available<span><br> <span class=\"product_info\">Warranty: 6 months warranty<span><br> <span class=\"product_info\">7 Days easy return policy<span><br> <span class=\"product_info\">7 Days easy return policy<span><br> <span class=\"product_info\">In Stock: 25 units sold this week<span> </div>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <div class=\"br-dashed\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-3 col-xs-3\"> <img src=\"https://img.icons8.com/color/48/000000/price-tag.png\"> </div>\n");
      out.write("                                            <div class=\"col-md-9 col-xs-9\">\n");
      out.write("                                                <div class=\"pr-info\"> <span class=\"break-all\">Get 5% instant discount + 10X rewards @ RENTOPC</span> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-7\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"margin-top: 15px;\">\n");
      out.write("                                <div class=\"col-xs-6\" style=\"margin-left: 15px;\"> <span class=\"product_options\">RAM Options</span><br> <button class=\"btn btn-primary btn-sm\">4 GB</button> <button class=\"btn btn-primary btn-sm\">8 GB</button> <button class=\"btn btn-primary btn-sm\">16 GB</button> </div>\n");
      out.write("                                <div class=\"col-xs-6\" style=\"margin-left: 55px;\"> <span class=\"product_options\">Storage Options</span><br> <button class=\"btn btn-primary btn-sm\">500 GB</button> <button class=\"btn btn-primary btn-sm\">1 TB</button> </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"singleline\">\n");
      out.write("                        <div class=\"order_info d-flex flex-row\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-6\" style=\"margin-left: 13px;\">\n");
      out.write("                                <div class=\"product_quantity\"> <span>QTY: </span> <input id=\"quantity_input\" type=\"text\" pattern=\"[0-9]*\" value=\"1\">\n");
      out.write("                                    <div class=\"quantity_buttons\">\n");
      out.write("                                        <div id=\"quantity_inc_button\" class=\"quantity_inc quantity_control\"><i class=\"fas fa-chevron-up\"></i></div>\n");
      out.write("                                        <div id=\"quantity_dec_button\" class=\"quantity_dec quantity_control\"><i class=\"fas fa-chevron-down\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6\"> <button type=\"button\" class=\"btn btn-primary shop-button\">Add to Cart</button> <button type=\"button\" class=\"btn btn-success shop-button\">Buy Now</button>\n");
      out.write("                                <div class=\"product_fav\"><i class=\"fas fa-heart\"></i></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row row-underline\">\n");
      out.write("                <div class=\"col-md-6\"> <span class=\" deal-text\">Specifications</span> </div>\n");
      out.write("                <div class=\"col-md-6\"> <a href=\"#\" data-abc=\"true\"> <span class=\"ml-auto view-all\"></span> </a> </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <table class=\"col-md-12\">\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr class=\"row mt-10\">\n");
      out.write("                                <td class=\"col-md-4\"><span class=\"p_specification\">Sales Package :</span> </td>\n");
      out.write("                                <td class=\"col-md-8\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>2 in 1 Laptop, Power Adaptor, Active Stylus Pen, User Guide, Warranty Documents</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"row mt-10\">\n");
      out.write("                                <td class=\"col-md-4\"><span class=\"p_specification\">Model Number :</span> </td>\n");
      out.write("                                <td class=\"col-md-8\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li> 14-dh0107TU </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"row mt-10\">\n");
      out.write("                                <td class=\"col-md-4\"><span class=\"p_specification\">Part Number :</span> </td>\n");
      out.write("                                <td class=\"col-md-8\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>7AL87PA</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"row mt-10\">\n");
      out.write("                                <td class=\"col-md-4\"><span class=\"p_specification\">Color :</span> </td>\n");
      out.write("                                <td class=\"col-md-8\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>Black</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"row mt-10\">\n");
      out.write("                                <td class=\"col-md-4\"><span class=\"p_specification\">Suitable for :</span> </td>\n");
      out.write("                                <td class=\"col-md-8\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>Processing & Multitasking</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"row mt-10\">\n");
      out.write("                                <td class=\"col-md-4\"><span class=\"p_specification\">Processor Brand :</span> </td>\n");
      out.write("                                <td class=\"col-md-8\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>Intel</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("<div class=\"footer\" style=\"background-color: black;\">\r\n");
      out.write("    <div class=\"text-center\" style=\"color: white\">\r\n");
      out.write("        <p>Created by Kushal & Soumen</p>\r\n");
      out.write("        <p>Special thanks to our respected Teachers</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> ");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\n");
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
