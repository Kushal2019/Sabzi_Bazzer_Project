
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<%
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
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>My Profile</title>

  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

  <!--    <link rel="stylesheet" href="https://bootswatch.com/4/simplex/bootstrap.min.css"/>-->

  <link rel="stylesheet" href="../Css/Seller_Style.css">
  <link rel="stylesheet" href="../Css/my_profile.css">
  <script src="../Javascript/my_profile.js"></script>
  <script type="text/javascript" src="../Javascript/Registration_Validation.js"></script>

</head>

<body>

  <div class="dash">
    <%@include file="pageFiles/Seller_SidePanel.jsp" %>
    <div class="dash-app">
      <%@include file="pageFiles/Seller_TopToolbar.jsp" %>
      <!--Main contant is Start-->

      <div class="container">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-body">
                <div class="card-title mb-8">
                  <div class="d-flex justify-content-start">
                    <div class="image-container">
                        <form action="../Myprofilepichange" method="post" enctype="multipart/form-data" >
                        <%
                                try
                                {
                                     String emaiiId=session.getAttribute("UserID").toString();
                                     ResultSet rs = new Database().Sellerprofilepic(emaiiId);
                                     if(rs.next())
                                     {
                                         String Path="../image/Seller_pic/" +rs.getString("profilepic");
                        %>    
                        <img src="<%=Path%>" id="imgProfile" style="width: 150px; height: 150px"
                        class="img-thumbnail"  />
                      <%
                                    }
                                }
                                catch(Exception es){}
                      %>
                      <div class="middle">
                          <input type="button" class="btn btn-secondary" id="btnChangePicture" value="Change" onclick="Show1();"/>
                          <input type="file" style="display: none;" id="profilePicture" name="product_file" />
                        <input class="btn btn-success" id="btnSubmitPicture" type="submit" value=" Submit"  style="display: none;" >
                      </div>
                        </form>
                    </div>
                    <div class="bs-example">
                      <ul class="nav nav-tabs" id="myTab">
                        <li class="nav-item">
                          <a href="#Personal_Information" class="nav-link" data-toggle="tab" onclick="Show();">Personal Information</a>
                        </li>
                        <li class="nav-item">
                          <a href="#Change_Password" class="nav-link" data-toggle="tab" onclick="hide();">Change Password</a>
                        </li>
                        <li class="nav-item">
                          <a href="#Manage_Addresses" class="nav-link" data-toggle="tab" onclick="hide();">Manage Addresses</a>
                        </li>
                      </ul><br>
                      <div class="tab-content">
                          
                        <!--First tab Strat-->
                          
                        <div class="tab-pane fade" id="Personal_Information">
                            <form action="../MyprofileSeller_PD" method="POST">
                                <%
                                    try
                                    {
                                        String emailId=session.getAttribute("UserID").toString();
                                        ResultSet rs1=new Database().SellerPI(emailId);
                                        if(rs1.next())
                                %>
                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">First Name : </label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="<%=rs1.getString("first_name")%>" name="first_name">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Last Name : </label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="<%=rs1.getString("last_name")%>" name="last_name">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Company Name : </label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="<%=rs1.getString("company_name")%>" name="company_name">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Email : </label>
                              <div class="col-sm-6">
                                <input type="email" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="<%=rs1.getString("email")%>" name="email">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Phone Number : </label>
                              <div class="col-sm-6">
                                <input type="number" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="<%=rs1.getString("ph_number")%>" name="ph_number">
                              </div>
                            </div>
                              
                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Licence Number : </label>
                              <div class="col-sm-6">
                                  <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="<%=rs1.getString("licence_number")%>" name="licence_number">
                              </div>
                            </div>
                            <%
                                    }
                                    catch(Exception a){}
                             %> 
                            <div class="form-group btn">
                                <div class="col-8">
                                    <input class="btn btn-success" type="submit" value="Submit"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input class="btn btn-danger" type="reset" value="Reset">
                                </div>
                            </div>
                          </form>
                        </div>
                        
                        <!--First tab End-->
                        
                        <!--Secound tab Strat-->
                        
                        <div class="tab-pane fade" id="Change_Password">
                            <form action="../Seller_Change_Password" method="POST">
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Old Password : </label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-sm" id="oldpass" name="oldpassword">
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">New Password : </label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-sm" id="newpass" name="password">
                                        </div>
                                </div>
                                <div class="form-group row">
                                   
                                        <div class="col-sm-6">
                                           
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Confirm Password : </label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-sm" id="newcpass">
                                        </div>
                                </div>
                                 <div class="form-group row">
                                    <label class="col-sm-3 col-form-label"></label>
                                        <div class="col-sm-6">
                                           <font color='red' id='msg'> </font>
                                        </div>
                                </div>
                                <div class="form-group btn">
                                    <div class="col-8">
                                        <input class="btn btn-success" type="submit" value="Submit" onclick="return passwordcheck()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <input class="btn btn-danger" type="reset" value="Reset">
                                    </div>
                                </div>
                                
                            </form>
                        </div>
                        
                        <!--Secound tab End-->
               
                        <!--Third tab Strat-->
                        
                        <div class="tab-pane fade" id="Manage_Addresses">
                            <form action="../MyprofileSeller_AM" method="POST">
                                 <%
                                    try
                                    {
                                        String emailId=session.getAttribute("UserID").toString();
                                        ResultSet rs2=new Database().SellerMA(emailId);
                                        if(rs2.next())
                                        {
                                %>
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Your State : </label>
                                        <div class="col-sm-6">
                                            <select class="form-control" style="width: 318px;" id="s_state" onclick="state()" name="state1" selected="<%=rs2.getString("state")%>">
                                                <option value="West Bengal">West Bengal</option>
                                                <option value="Bihar">Bihar</option>
                                                <option value="Gujarat">Gujarat</option>
                                                <option value="Himachal Pradesh">Himachal Pradesh</option>
                                                <option value="Maharashtra">Maharashtra</option>
                                                <option value="Odisha">Odisha</option>
                                                <option value="Tamil Nadu">Tamil Nadu</option>
                                                <option value="Uttarakhand">Uttarakhand</option>
                                                
                                            </select>
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Your Town : </label>
                                        <div class="col-sm-6">
                                            <select class="form-control" style="width: 318px;" id="s_town" name="town" selected="<%=rs2.getString("town")%>">
                                                <option value="<%=rs2.getString("town")%>" ><%=rs2.getString("town")%></option>
                                            </select>
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Zip Code : </label>
                                    <div class="col-sm-6">
                                        <input type="number" class="form-control form-control-sm" id="colFormLabelSm"
                                               value="<%=rs2.getString("zip_code")%>" name="zip_code">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Your Street : </label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-sm" id="colFormLabelSm" value="<%=rs2.getString("street")%>" name="street">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">House Number : </label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-sm" id="colFormLabelSm" value="<%=rs2.getString("house_number")%>" name="house_number">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">landmark : </label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-sm" id="colFormLabelSm" value="<%=rs2.getString("landmark")%>" name="landmark">
                                    </div>
                                </div>
                                 <%
                                    }
                                    }
                                    catch(Exception a){}
                             %> 
                                <div class="form-group btn">
                                    <div class="col-8">
                                        <input class="btn btn-success" type="submit" value="Submit" onclick="return selecttown()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <input class="btn btn-danger" type="reset" value="Reset">
                                    </div>
                                </div>
                                
                            </form>
                        </div>
                        
                        <!--Third tab End-->
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!--Main contant is End-->
    </div>
  </div>



  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>