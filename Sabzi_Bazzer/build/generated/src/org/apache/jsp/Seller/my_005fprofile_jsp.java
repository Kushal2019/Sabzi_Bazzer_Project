package org.apache.jsp.Seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>My Profile</title>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!--    <link rel=\"stylesheet\" href=\"https://bootswatch.com/4/simplex/bootstrap.min.css\"/>-->\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/Seller_Style.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/my_profile.css\">\r\n");
      out.write("  <script src=\"../Javascript/my_profile.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
      out.write("            <a href=\"my_profile.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-user-edit\"></i> My Profile </a>\r\n");
      out.write("            <a href=\"all_item.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fas fa-shopping-bag\"></i> All Item </a>\r\n");
      out.write("            <a href=\"add_item.jsp\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-basket\"></i> Add Item </a>\r\n");
      out.write("            <a href=\"#\" class=\"dash-nav-item\">\r\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> My Order </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    <div class=\"dash-app\">\r\n");
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
        response.sendRedirect("../index.jsp");
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
      out.write("\r\n");
      out.write("      <!--Main contant is Start-->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-12\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <div class=\"card-title mb-8\">\r\n");
      out.write("                  <div class=\"d-flex justify-content-start\">\r\n");
      out.write("                    <div class=\"image-container\">\r\n");
      out.write("                      <img src=\"http://placehold.it/150x150\" id=\"imgProfile\" style=\"width: 150px; height: 150px\"\r\n");
      out.write("                        class=\"img-thumbnail\" />\r\n");
      out.write("                      <div class=\"middle\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-secondary\" id=\"btnChangePicture\" value=\"Change\"/>\r\n");
      out.write("                        <input type=\"file\" style=\"display: none;\" id=\"profilePicture\" name=\"file\"/>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bs-example\">\r\n");
      out.write("                      <ul class=\"nav nav-tabs\" id=\"myTab\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                          <a href=\"#Personal_Information\" class=\"nav-link\" data-toggle=\"tab\">Personal Information</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                          <a href=\"#Change_Password\" class=\"nav-link\" data-toggle=\"tab\">Change Password</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                          <a href=\"#Manage_Addresses\" class=\"nav-link\" data-toggle=\"tab\">Manage Addresses</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                      </ul><br>\r\n");
      out.write("                      <div class=\"tab-content\">\r\n");
      out.write("                          \r\n");
      out.write("                        <!--First tab Strat-->\r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"Personal_Information\">\r\n");
      out.write("                            <form action=\"#form_is_hiting_1\" method=\"POST\">\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">First Name : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\"\r\n");
      out.write("                                  value=\"Kushal\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Last Name : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\"\r\n");
      out.write("                                  value=\"Mukherjee\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Company Name : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\"\r\n");
      out.write("                                  value=\"Online Brahmin\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Email : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"email\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\"\r\n");
      out.write("                                  value=\"www.kushalmukherjee@gmail.com\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Phone Number : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"number\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\"\r\n");
      out.write("                                  value=\"7407032908\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                              \r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Licence Number : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                  <input type=\"text\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\"\r\n");
      out.write("                                  value=\"KL34C8222\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                              \r\n");
      out.write("                            <div class=\"form-group btn\">\r\n");
      out.write("                                <div class=\"col-8\">\r\n");
      out.write("                                    <input class=\"btn btn-success\" type=\"submit\" value=\"Submit\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                    <input class=\"btn btn-danger\" type=\"reset\" value=\"Reset\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <!--First tab End-->\r\n");
      out.write("                        \r\n");
      out.write("                        <!--Secound tab Strat-->\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"Change_Password\">\r\n");
      out.write("                            <form action=\"#form_is_hiting_2\" method=\"POST\">\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Old Password : </label>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">New Password : </label>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Confirm Password : </label>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group btn\">\r\n");
      out.write("                                <div class=\"col-8\">\r\n");
      out.write("                                    <input class=\"btn btn-success\" type=\"submit\" value=\"Submit\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                    <input class=\"btn btn-danger\" type=\"reset\" value=\"Reset\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <!--Secound tab End-->\r\n");
      out.write("               \r\n");
      out.write("                        <!--Third tab Strat-->\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"Manage_Addresses\">\r\n");
      out.write("                            <form action=\"#form_is_hiting_3\" method=\"POST\">\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Your State : </label>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <select class=\"form-control\">\r\n");
      out.write("                                                <option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("                                                <option value=\"Bihar\">Bihar</option>\r\n");
      out.write("                                                <option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("                                                <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("                                                <option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("                                                <option value=\"Odisha\">Odisha</option>\r\n");
      out.write("                                                <option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("                                                <option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("                                                <option value=\"Delhi\">Delhi</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <!--Third tab End-->\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!--Main contant is End-->\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
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
