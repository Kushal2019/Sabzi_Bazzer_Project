package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class View_005fCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>View Cart</title>\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("  <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/View_Cart_Style.css\">\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../Javascript/View_Cart_Style.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!--%@include file=\"../PageFiles/navMain.jsp\"%-->\r\n");
      out.write("\r\n");
      out.write("  <h1>Shopping Cart</h1>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div class=\"shopping-cart\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column-labels\">\r\n");
      out.write("      <label class=\"product-image\">Image</label>\r\n");
      out.write("      <label class=\"product-details\">Product</label>\r\n");
      out.write("      <label class=\"product-price\">Price</label>\r\n");
      out.write("      <label class=\"product-quantity\">Quantity</label>\r\n");
      out.write("      <label class=\"product-removal\">Remove</label>\r\n");
      out.write("      <label class=\"product-line-price\">Total</label>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"product\">\r\n");
      out.write("      <div class=\"product-image\">\r\n");
      out.write("          <img src=\"../image/Vegetables/vendi.jpeg\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-details\">\r\n");
      out.write("        <div class=\"product-title\">Nike Flex Form TR Women's Sneaker</div>\r\n");
      out.write("        <p class=\"product-description\"> It has a lightweight, breathable mesh upper with forefoot cables for a\r\n");
      out.write("          locked-down fit.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-price\">12.99</div>\r\n");
      out.write("      <div class=\"product-quantity\">\r\n");
      out.write("        <input type=\"number\" value=\"2\" min=\"1\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-removal\">\r\n");
      out.write("        <button class=\"remove-product\">\r\n");
      out.write("          Remove\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-line-price\">25.98</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"product\">\r\n");
      out.write("      <div class=\"product-image\">\r\n");
      out.write("          <img src=\"../image/Sabzi_Logo.png\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-details\">\r\n");
      out.write("        <div class=\"product-title\">ULTRABOOST UNCAGED SHOES</div>\r\n");
      out.write("        <p class=\"product-description\">Born from running culture, these men's shoes deliver the freedom of a cage-free\r\n");
      out.write("          design</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-price\">45.99</div>\r\n");
      out.write("      <div class=\"product-quantity\">\r\n");
      out.write("        <input type=\"number\" value=\"1\" min=\"1\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-removal\">\r\n");
      out.write("        <button class=\"remove-product\">\r\n");
      out.write("          Remove\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-line-price\">45.99</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"totals\">\r\n");
      out.write("      <div class=\"totals-item\">\r\n");
      out.write("        <label>Subtotal</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-subtotal\">71.97</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"totals-item\">\r\n");
      out.write("        <label>Tax (5%)</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-tax\">3.60</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"totals-item\">\r\n");
      out.write("        <label>Shipping</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-shipping\">15.00</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"totals-item totals-item-total\">\r\n");
      out.write("        <label>Grand Total</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-total\">90.57</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <button class=\"checkout\">Checkout</button>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  <!--%@include file=\"../PageFiles/footerMain.jsp\"%-->\r\n");
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
