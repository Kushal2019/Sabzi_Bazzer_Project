package org.apache.jsp.Seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.sabzi_bazzer.Database;

public final class Order_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") && !uname.equals(""))
        {
           response.sendRedirect("../User/index.jsp"); 
        }
        else
        {
            if(utype.equals("ADMIN"))
            {
                response.sendRedirect("../Admin/index.jsp");
            }
            else
            {
               if(utype.equals("SELLER"))
            {
               // response.sendRedirect("../Seller/index.jsp");
            } 
            }
        }
    }
    catch(Exception ex)
    {
        response.sendRedirect("../index.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/Seller_Style.css\">\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js\"></script>\n");
      out.write("  <script src=\"../Javascript/Seller_Style.js\"></script>\n");
      out.write("  <script src=\"../Javascript/Seller_Product_validation.js\"></script>\n");
      out.write("  <title>All Item</title>\n");
      out.write("  <script>\n");
      out.write("    function Order_status(id) {\n");
      out.write("        let Order_status = document.getElementById('Order_status');\n");
      out.write("        if(Order_status.value==\"SHIPPED\")\n");
      out.write("        {\n");
      out.write("           \n");
      out.write("             window.location = \"../ChangeOrderStatus?id=\"+id+\"&status=\"+Order_status.value;\n");
      out.write("        }\n");
      out.write("        if(Order_status.value==\"DELIVERED\")\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("             window.location = \"../ChangeOrderStatus?id=\"+id+\"&status=\"+Order_status.value;\n");
      out.write("        }\n");
      out.write("       //  alert(Order_status);\n");
      out.write("     /* let loc = \"../Product_Permission?id=\" + id;\n");
      out.write("      window.location = loc;*/\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  </script>\n");
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
      out.write("            <a href=\"my_profile.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-user-edit\"></i> My Profile </a>\r\n");
      out.write("            <a href=\"all_item.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-shopping-bag\"></i> All Item </a>\r\n");
      out.write("            <a href=\"add_item.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-basket\"></i> Add Item </a>\r\n");
      out.write("                <a href=\"Order_list.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> Order List </a>\r\n");
      out.write("            <a href=\"My_Order.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> My Order </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("    <div class=\"dash-app\">\n");
      out.write("      ");

    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") && !uname.equals(""))
        {
            response.sendRedirect("../User/index.jsp");
        }
        else
        {
            if(utype.equals("ADMIN"))
            {
                response.sendRedirect("../Admin/index.jsp");
            }
            else
            {
               if(utype.equals("SELLER"))
            {
               // response.sendRedirect("../Seller/index.jsp");
            } 
            }
        }
    }
    catch(Exception ex)
    {
      //  response.sendRedirect("../../index.jsp");
    }

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
      out.write("     \n");
      out.write("      <main class=\"dash-content\">\n");
      out.write("        <div>\n");
      out.write("          <table class=\"table table-dark table-striped\">\n");
      out.write("            <thead>\n");
      out.write("              <tr>\n");
      out.write("               \n");
      out.write("                <th>Buyer_name</th>\n");
      out.write("                <th>Product_name</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Amount</th>\n");
      out.write("                <th>Payment_Way</th>\n");
      out.write("                <th>Order_date</th>\n");
      out.write("                <th>Delivery_date</th>\n");
      out.write("                <th>Order_status</th>\n");
      out.write("                <th>Change</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("              ");

                   try {
                       String emaiiId=session.getAttribute("UserID").toString();
                         ResultSet rs = new Database().Order_List(emaiiId);  
                         while(rs.next())
                         {
                             
                
      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print(new Database().Username(emaiiId));
      out.write("</td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>");
      out.print(rs.getString("quantity"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("amount"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("payment_method"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("order_date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("delivery_date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("order_status"));
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <select  class=\"form-control\" name=\"Order_status\" id=\"Order_status\" onchange=\"Order_status(");
      out.print(rs.getString("order_id"));
      out.write(")\">\n");
      out.write("                        ");

                            if(rs.getString("order_status").equals("PLACED"))
                            {
                        
      out.write("\n");
      out.write("                        <option  value=\"\" selected>PLACED</option>\n");
      out.write("                        <option value=\"SHIPPED\">SHIPPED</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                         ");

                            if(rs.getString("order_status").equals("SHIPPED"))
                            {
                        
      out.write("\n");
      out.write("                        <option  value=\"\" selected>SHIPPED</option>\n");
      out.write("                        <option value=\"DELIVERED\">DELIVERED</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                         ");

                            if(rs.getString("order_status").equals("DELIVERED"))
                            {
                        
      out.write("\n");
      out.write("                        <option value=\"DELIVERED\">DELIVERED</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                          ");

                            if(rs.getString("order_status").equals("Cancel"))
                            {
                        
      out.write("\n");
      out.write("                        <option value=\"\">Cancel</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              ");
            
                  }
                }
                catch(Exception e){}
               
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </main>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("         \n");
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
