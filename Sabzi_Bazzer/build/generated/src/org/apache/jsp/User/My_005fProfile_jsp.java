package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.sabzi_bazzer.Database;

public final class My_005fProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") && !uname.equals(""))
        {
           //response.sendRedirect("../User/index.jsp"); 
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
               response.sendRedirect("../Seller/index.jsp");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>My_Profile</title>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/Seller_Style.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../Css/my_profile.css\">\r\n");
      out.write("  <script src=\"../Javascript/my_profile.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../Javascript/Registration_Validation.js\"></script>\r\n");
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
      out.write("                        <form action=\"../User_profilechange\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                           ");

                                try
                                {
                                     String emaiiId=session.getAttribute("UserID").toString();
                                     ResultSet rs = new Database().Userprofilepic(emaiiId);
                                     if(rs.next())
                                     {
                                         String Path="../image/User_pic/" +rs.getString("profilepic");
                        
      out.write("\r\n");
      out.write("                        <img src=\"");
      out.print(Path);
      out.write("\" id=\"imgProfile\"\r\n");
      out.write("                          style=\"width: 150px; height: 150px\" class=\"img-thumbnail\" />\r\n");
      out.write("                          ");

                                    }
                                }
                                catch(Exception es){}
                      
      out.write("\r\n");
      out.write("                        <div class=\"middle\">\r\n");
      out.write("                          <input type=\"button\" class=\"btn btn-secondary\" id=\"btnChangePicture\" value=\"Change\"\r\n");
      out.write("                            onclick=\"Show1();\" />\r\n");
      out.write("                          <input type=\"file\" style=\"display: none;\" id=\"profilePicture\" name=\"Userproduct_file\" />\r\n");
      out.write("                          <input class=\"btn btn-success\" id=\"btnSubmitPicture\" type=\"submit\" value=\" Submit\"\r\n");
      out.write("                            style=\"display: none;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bs-example\">\r\n");
      out.write("                      <ul class=\"nav nav-tabs\" id=\"myTab\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                          <a href=\"#Personal_Information\" class=\"nav-link\" data-toggle=\"tab\" onclick=\"Show();\">Personal Information</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                          <a href=\"#Change_Password\" class=\"nav-link\" data-toggle=\"tab\" onclick=\"hide();\">Change Password</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                      </ul><br>\r\n");
      out.write("                      <div class=\"tab-content\">\r\n");
      out.write("\r\n");
      out.write("                        <!--First tab Strat-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"Personal_Information\">\r\n");
      out.write("                          <form action=\"#\" method=\"POST\">\r\n");
      out.write("                              ");

                                    try
                                    {
                                        String emailId=session.getAttribute("UserID").toString();
                                        ResultSet rs1=new Database().UserPI(emailId);
                                        if(rs1.next())
                                
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">First Name : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\" value=\"");
      out.print(rs1.getString("first_name"));
      out.write("\"\r\n");
      out.write("                                  name=\"first_name\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Last Name : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\" value=\"");
      out.print(rs1.getString("last_name"));
      out.write("\"\r\n");
      out.write("                                  name=\"last_name\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Email : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"email\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\" value=\"");
      out.print(rs1.getString("email"));
      out.write("\"\r\n");
      out.write("                                  name=\"email\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Phone Number : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"number\" class=\"form-control form-control-sm\" id=\"colFormLabelSm\" value=\"");
      out.print(rs1.getString("ph_number"));
      out.write("\"\r\n");
      out.write("                                  name=\"ph_number\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                               ");

                                    }
                                    catch(Exception a){}
                             
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group btn\">\r\n");
      out.write("                              <div class=\"col-8\">\r\n");
      out.write("                                <input class=\"btn btn-success\" type=\"submit\" value=\"Submit\">\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                <input class=\"btn btn-danger\" type=\"reset\" value=\"Reset\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!--First tab End-->\r\n");
      out.write("\r\n");
      out.write("                        <!--Secound tab Strat-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"Change_Password\">\r\n");
      out.write("                          <form action=\"../Seller_Change_Password\" method=\"POST\">\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Old Password : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control form-control-sm\" id=\"oldpass\"\r\n");
      out.write("                                  name=\"oldpassword\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">New Password : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control form-control-sm\" id=\"newpass\"\r\n");
      out.write("                                  name=\"password\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\">Confirm Password : </label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control form-control-sm\" id=\"newcpass\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                              <label class=\"col-sm-3 col-form-label\"></label>\r\n");
      out.write("                              <div class=\"col-sm-6\">\r\n");
      out.write("                                <font color='red' id='msg'> </font>\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group btn\">\r\n");
      out.write("                              <div class=\"col-8\">\r\n");
      out.write("                                <input class=\"btn btn-success\" type=\"submit\" value=\"Submit\">\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                <input class=\"btn btn-danger\" type=\"reset\" value=\"Reset\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                          </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!--Secound tab End-->\r\n");
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
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
