<%-- 
    Document   : Add_Address
    Created on : 9 Feb, 2020, 6:38:15 PM
    Author     : Kushal
--%>
<%
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
%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Add Address</title>


  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" href="../Css/User_Style.css">
  <script src="../Javascript/my_profile.js"></script>
  <script type="text/javascript" src="../Javascript/Registration_Validation.js"></script>
 <script>
     function Editid(id) {
         
      let loc = "Add_Address.jsp?id=" + id;
      window.location = loc;
      
       
    }
    function Delete(id) {
         
      let loc = "../User_Delete_address?id=" + id;
      window.location = loc;
      
       
    }
  </script>

</head>

<body>

  <!--Edit button Popup design Start-->
  <div class="modal fade cd-example-modal-xl" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel"
    aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <form action="../User_add_Address"  method="POST">
           
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="house_number">House Number :</label><span style="color:red;" id="m1"></span>
              <input type="number" class="form-control" id="house_number1"  name="house_number" >
            </div> 
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="form-group col-md-4">
              <label for="street_number">Street Number :</label><span style="color:red;" id="m2"></span>
              <input type="number" class="form-control" id="street_number1" name="street_number1" >
            </div>
          </div>
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="vill_town">Vill / Town :</label><span style="color:red;" id="m3"></span>
              <input type="text" class="form-control" id="vill_town1" name="vill_town1" >
            </div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="form-group col-md-4">
              <label for="post_office">Post Office :</label><span style="color:red;" id="m4"></span>
              <input type="text" class="form-control" id="post_office1" name="post_office1" >
            </div>
          </div>
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="police_station">Police Station :</label><span style="color:red;" id="m5"></span>
              <input type="text" class="form-control" id="police_station1" name="police_station1" >
            </div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="form-group col-md-4">
              <label for="district">District :</label><span style="color:red;" id="m6"></span>
              <select id="s_town" class="form-control" name="s_town">
                <option selected value="">sdfghjk</option>
         
              </select>
            </div>
          </div>
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="state">State :</label><span style="color:red;" id="m7"></span>
              <select id="s_state" class="form-control" onchange="state()" name="s_state" >
                <option selected value="">dfghjk</option>
                 </option>
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
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="form-group col-md-4">
              <label for="pin_code">Pin Code :</label><span style="color:red;" id="m8"></span>
              <input type="number" class="form-control" id="pin_code1" name="pin_code1">
            </div>
          </div>
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="landmark">Landmark :</label><span style="color:red;" id="m9" ></span>
              <input type="text" class="form-control" id="landmark1" name="landmark1" >
            </div>
            
            <div class="form-group col-md-4" style="position: relative; top: 35px; left: 150px;">
                <button type="submit" class="btn btn-success btn-lg" onclick="return UserAddVAl()">Save</button> &nbsp;&nbsp;
              <button type="button" class="btn btn-danger btn-lg" data-dismiss="modal">Close</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
  <!--Edit button Popup design End-->


  <div class="dash">
    <%@include file="PageFiles/User_SidePanel.jsp" %>
    <div class="dash-app">
      <%@include file="PageFiles/User_TopToolbar.jsp" %>
      <main class="dash-content">
        <div>
          <table class="table table-dark table-striped">
            <thead>
              <tr>
                <th>House_Number</th>
                <th>Vill/Town</th>
                <th>Police Station</th>
                <th>District</th>
                <th>State</th>
                <th>Pin</th>
                <th>Landmark</th>
                <th>Activity <button type="button" class="btn btn-primary" data-toggle="modal"
                    data-target=".cd-example-modal-xl" onclick="">Add Address</button></th>
              </tr>
            </thead>
            <tbody>
                <%
                        try{
                           String uname=session.getAttribute("UserID").toString();
                            ResultSet rs = new Database().UserAddress(uname);
                           while(rs.next())
                            {
                        
                %>
              <tr>
                <td><%=rs.getString("house_number")%></td>
                <td><%=rs.getString("vill_town")%></td>
                <td><%=rs.getString("police_station")%></td>
                <td><%=rs.getString("district")%></td>
                <td><%=rs.getString("state")%></td>
                <td><%=rs.getString("pin_code")%></td>
                <td><%=rs.getString("landmark")%></td>
                <td>
                  <button type="button" class="btn btn-success"
                     onclick="Editid('<%=rs.getString("address_id")%>')">Edit</button>
                  <button type="button" class="btn btn-labeled btn-danger" onclick="Delete('<%=rs.getString("address_id")%>')"> Delete </button>
                </td>
              </tr>
              <%
                  }
                  
                  }
                  catch(Exception ex )
                  {}
              %>
            </tbody>
          </table>
        </div>
              <%
                  try
                  {
                       String id=request.getParameter("id");
                       if(!id.equals(""))
                       {
                           ResultSet rs = new Database().UserAddress1(id);
                           if(rs.next())
                           {
              %>
            <div class="container" >
          <form action="../User_update_Address?id=<%=id%>" method="POST">
            <div class="form-row">
              <div class="form-group col-md-4">
                <label for="house_number">House Number :</label> <span style="color:red;" id="m11"></span>
                <input type="number" class="form-control" id="house_number2"  name="house_number2" value="<%=rs.getString("house_number")%>">
               
              </div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <div class="form-group col-md-4">
                <label for="street_number">Street Number :</label><span style="color:red;" id="m21"></span>
                <input type="number"  id="street_number2" class="form-control"   name="street_number2" value="<%=rs.getString("street_number")%>">
                
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-4">
                <label for="vill_town">Vill / Town :</label><span style="color:red;" id="m31"></span>
                <input type="text" class="form-control" id="vill_town2"  name="vill_town2" value="<%=rs.getString("vill_town")%>">
                
              </div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <div class="form-group col-md-4">
                <label for="post_office">Post Office :</label><span style="color:red;" id="m41"></span>
                <input type="text" class="form-control" id="post_office2"  name="post_office2" value="<%=rs.getString("post_office")%>">
                
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-4">
                <label for="police_station">Police Station :</label> <span style="color:red;" id="m51"></span>
                <input type="text" class="form-control" id="police_station2" name="police_station2"  value="<%=rs.getString("police_station")%>">
               
              </div>
               
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <div class="form-group col-md-4">
                <label for="district">District :</label>
                <select id="s_town1" class="form-control" style="position: absolute;"  name="s_town2" selected="<%=rs.getString("district")%>">
                  <option value="<%=rs.getString("district")%>" ><%=rs.getString("district")%></option>
                                            
                </select>
                <span style="color:red;" id="m61"></span>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-4">
                <label for="state">State :</label>
                <select id="s_state1" class="form-control" style="position: absolute;"  name="s_state2" onchange="state1()" selected="<%=rs.getString("state")%>">
                 
                                          
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
                <span style="color:red;" id="m71"></span>
              </div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <div class="form-group col-md-4">
                <label for="pin_code">Pin Code :</label><span style="color:red;" id="m81"></span>
                <input type="number" class="form-control" id="pin_code2"  name="pin_code2" value="<%=rs.getString("pin_code")%>">
                
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-4">
                <label for="landmark">Landmark :</label><span style="color:red;" id="m91"></span>
                <input type="text" class="form-control" id="landmark2"  name="landmark2" value="<%=rs.getString("landmark")%>">
                
              </div>
              <div class="form-group col-md-4" style="position: relative; top: 35px; left: 150px;">
                  <input type="submit" class="btn btn-success btn-lg" onclick="return UserAddVAl1()" value="Save" id="cc"> &nbsp;&nbsp;
                <input type="reset" class="btn btn-danger btn-lg">
              </div>
            </div>
          </form>
        </div>
         <% 
             }
             }
             }catch(Exception e){}
         %>
      </main>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>