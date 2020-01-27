<%-- 
    Document   : my_profile
    Created on : 24 Jan, 2020, 1:48:44 PM
    Author     : Kushal
--%>
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
                      <img src="http://placehold.it/150x150" id="imgProfile" style="width: 150px; height: 150px"
                        class="img-thumbnail" />
                      <div class="middle">
                        <input type="button" class="btn btn-secondary" id="btnChangePicture" value="Change"/>
                        <input type="file" style="display: none;" id="profilePicture" name="file"/>
                      </div>
                    </div>
                    <div class="bs-example">
                      <ul class="nav nav-tabs" id="myTab">
                        <li class="nav-item">
                          <a href="#Personal_Information" class="nav-link" data-toggle="tab">Personal Information</a>
                        </li>
                        <li class="nav-item">
                          <a href="#Change_Password" class="nav-link" data-toggle="tab">Change Password</a>
                        </li>
                        <li class="nav-item">
                          <a href="#Manage_Addresses" class="nav-link" data-toggle="tab">Manage Addresses</a>
                        </li>
                      </ul><br>
                      <div class="tab-content">
                          
                        <!--First tab Strat-->
                          
                        <div class="tab-pane fade" id="Personal_Information">
                            <form action="#form_is_hiting_1" method="POST">
                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">First Name : </label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="Kushal">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Last Name : </label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="Mukherjee">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Company Name : </label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="Online Brahmin">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Email : </label>
                              <div class="col-sm-6">
                                <input type="email" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="www.kushalmukherjee@gmail.com">
                              </div>
                            </div>

                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Phone Number : </label>
                              <div class="col-sm-6">
                                <input type="number" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="7407032908">
                              </div>
                            </div>
                              
                            <div class="form-group row">
                              <label class="col-sm-3 col-form-label">Licence Number : </label>
                              <div class="col-sm-6">
                                  <input type="text" class="form-control form-control-sm" id="colFormLabelSm"
                                  value="KL34C8222">
                              </div>
                            </div>
                              
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
                            <form action="#form_is_hiting_2" method="POST">
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Old Password : </label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-sm" id="colFormLabelSm">
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">New Password : </label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-sm" id="colFormLabelSm">
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Confirm Password : </label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-sm" id="colFormLabelSm">
                                        </div>
                                </div>
                                
                                <div class="form-group btn">
                                    <div class="col-8">
                                        <input class="btn btn-success" type="submit" value="Submit"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <input class="btn btn-danger" type="reset" value="Reset">
                                    </div>
                                </div>
                                
                            </form>
                        </div>
                        
                        <!--Secound tab End-->
               
                        <!--Third tab Strat-->
                        
                        <div class="tab-pane fade" id="Manage_Addresses">
                            <form action="#form_is_hiting_3" method="POST">
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Your State : </label>
                                        <div class="col-sm-6">
                                            <select class="form-control" style="width: 318px;">
                                                <option value="West Bengal">West Bengal</option>
                                                <option value="Bihar">Bihar</option>
                                                <option value="Gujarat">Gujarat</option>
                                                <option value="Himachal Pradesh">Himachal Pradesh</option>
                                                <option value="Maharashtra">Maharashtra</option>
                                                <option value="Odisha">Odisha</option>
                                                <option value="Tamil Nadu">Tamil Nadu</option>
                                                <option value="Uttarakhand">Uttarakhand</option>
                                                <option value="Delhi">Delhi</option>
                                            </select>
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Your Town : </label>
                                        <div class="col-sm-6">
                                            <select class="form-control" style="width: 318px;">
                                                <option value="Unknown Town" disabled="">Unknown Town</option>
                                            </select>
                                        </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Zip Code : </label>
                                    <div class="col-sm-6">
                                        <input type="number" class="form-control form-control-sm" id="colFormLabelSm"
                                               value="722154">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">Your Street : </label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-sm" id="colFormLabelSm" value="Ahalaya Rd.">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">House Number : </label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-sm" id="colFormLabelSm" value="419/3">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label class="col-sm-3 col-form-label">landmark : </label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-sm" id="colFormLabelSm" value="Bus-Stand">
                                    </div>
                                </div>
                                
                                <div class="form-group btn">
                                    <div class="col-8">
                                        <input class="btn btn-success" type="submit" value="Submit"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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