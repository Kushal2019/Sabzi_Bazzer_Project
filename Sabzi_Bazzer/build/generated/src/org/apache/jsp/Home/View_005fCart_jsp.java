package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.sabzi_bazzer.Database;

public final class View_005fCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Home/../PageFiles/navCart.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("  <link rel=\"stylesheet\" href=\"../Css/Cart_Style.css\">\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../Javascript/View_Cart_Style.js\"></script>  \r\n");
      out.write("  <script>\r\n");
      out.write("      function Addcart(str,id) {\r\n");
      out.write("  var p= document.getElementById(id).innerHTML;\r\n");
      out.write("  \r\n");
      out.write("  var  price = parseFloat(p);\r\n");
      out.write("  var total = price*str;\r\n");
      out.write("  window.location=\"../UpdateAddtocart?total=\"+total+\"&id=\"+id+\"&qan=\"+str;\r\n");
      out.write("}\r\n");
      out.write("function cartremove(id)\r\n");
      out.write("{\r\n");
      out.write("    window.location=\"../Remove_Cart?id=\"+id;\r\n");
      out.write("}\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
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
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"../Home/View_Cart.jsp\">Cart</a>\r\n");
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
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("  <h1>Shopping Cart</h1>\r\n");
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
      out.write("    ");

        try{
              String uname=session.getAttribute("UserID").toString();
                   ResultSet rs = new Database().Cartdetails(uname);  
                   while(rs.next())
                   {
    
      out.write("\r\n");
      out.write("    <div class=\"product\">\r\n");
      out.write("      <div class=\"product-image\">\r\n");
      out.write("          <img src=\"../image/Vegetables/");
      out.print(rs.getString("product_img"));
      out.write("\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-details\">\r\n");
      out.write("        <div class=\"product-title\">");
      out.print(rs.getString("product_name"));
      out.write("</div>\r\n");
      out.write("        <div class=\"product-title\">");
      out.print(rs.getString("seller_name"));
      out.write("</div>\r\n");
      out.write("        <p class=\"product-description\"> ");
      out.print(rs.getString("description"));
      out.write("</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-price\" id=\"");
      out.print(rs.getString("cart_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("product_price"));
      out.write("</div>\r\n");
      out.write("      <div class=\"product-quantity\">\r\n");
      out.write("          <input type=\"number\" value=\"");
      out.print(rs.getString("qantity"));
      out.write("\" min=\"1\" id=\"quantity\" onchange=\"Addcart(this.value,");
      out.print(rs.getString("cart_id"));
      out.write(")\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-removal\">\r\n");
      out.write("          <button class=\"remove-product\" onclick=\"cartremove(");
      out.print(rs.getString("cart_id"));
      out.write(")\">\r\n");
      out.write("          Remove\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"product-line-price\">");
      out.print(rs.getString("total"));
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write(" ");

        }
        }
        catch(Exception a){}
       
      out.write("\r\n");
      out.write("        ");

        try{
              String uname=session.getAttribute("UserID").toString();
                   ResultSet rs = new Database().Cartdetails1(uname);  
                   if(rs.next())
                   {
                       double txt= Float.parseFloat(rs.getString("total"));
                       double ftxt=txt*0.05;
                       double gandt=ftxt+txt+40;
    
      out.write("\r\n");
      out.write("    <div class=\"totals\">\r\n");
      out.write("      <div class=\"totals-item\">\r\n");
      out.write("        <label>Subtotal</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-subtotal\">");
      out.print(rs.getString("total"));
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"totals-item\">\r\n");
      out.write("        <label>Tax (5%)</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-tax\">");
      out.print(ftxt);
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"totals-item\">\r\n");
      out.write("        <label>Shipping</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-shipping\">40</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"totals-item totals-item-total\">\r\n");
      out.write("        <label>Grand Total</label>\r\n");
      out.write("        <div class=\"totals-value\" id=\"cart-total\">");
      out.print(gandt);
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <button class=\"checkout\">Checkout</button>\r\n");
      out.write("   \r\n");
      out.write("  </div> \r\n");
      out.write("     ");

        }
        }
        catch(Exception a){}
       
      out.write("\r\n");
      out.write("  </div> <br><br><br>\r\n");
      out.write("  ");
      out.write(" <footer id=\"sticky-footer\" class=\"py-4 bg-dark text-white-50\">\r\n");
      out.write("     <div class=\"text-center\" style=\"color: white\">\r\n");
      out.write("        <p>Created by Kushal & Soumen</p>\r\n");
      out.write("        <p>Special thanks to our respected Teachers</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container text-center\">\r\n");
      out.write("        \r\n");
      out.write("      <small>Copyright &copy; Your Website</small>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>");
      out.write("\r\n");
      out.write("  \r\n");
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
