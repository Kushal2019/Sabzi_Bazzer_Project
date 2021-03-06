<html>

<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="../Css/Mainlogin.css">
    <link href="../Css/Loder.css" rel="stylesheet">
    <script src="../Javascript/Mainlogin_Validation.js"></script>
    <script>
        function errorMag() {
            document.getElementById("aaa").innerHTML="<span class='tooltip11text' style='color:red;' id='aaa2' ></span>";
            document.getElementById("aaa2").style.visibility = "visible";
            document.getElementById("aaa2").style.opacity = 1;
            document.getElementById("aaa2").innerHTML="Your Username & Password Invalid!";
        }
        function Notfound()
        {
             document.getElementById("aaa").innerHTML="<span class='tooltip11text' style='color:red;' id='aaa2' ></span>";
            document.getElementById("aaa2").style.visibility = "visible";
            document.getElementById("aaa2").style.opacity = 1;
            document.getElementById("aaa2").innerHTML="Your Email ID Does not exited";
        }
         function notactive()
        {
             document.getElementById("aaa").innerHTML="<span class='tooltip11text' style='color:red;' id='aaa2' ></span>";
            document.getElementById("aaa2").style.visibility = "visible";
            document.getElementById("aaa2").style.opacity = 1;
            document.getElementById("aaa2").innerHTML="Your account not Approve";
        }
    </script>
    
</head>
<%
    
    int err=0;
    
    try
    {
        String error=request.getParameter("error");
        if(error.equals("1"))
        {
            err=1;
        }
        if(error.equals("3"))
        {
            err=2;
        }
        if(error.equals("4"))
        {
            err=3;
        }
    }
    catch(Exception e){}
%>

<body onload="<%if(err==1){out.print("errorMag()");}else if(err==2){out.print("Notfound()");}else if(err==3){out.print("notactive()");}%>">
    <div id="loader">
        <center><img src="../image/loading.gif"></center>
    </div>
    <%@include file="../PageFiles/navLog.jsp" %>
    <%
        try
        {
            String userType=session.getAttribute("UserType").toString();
            if(userType.equals("USER"))
            {
                //user
                response.sendRedirect("../User/index.jsp");
            }
            else
            {
                if(userType.equals("SELLER"))
                {
                    //Seller
                    response.sendRedirect("../Seller/index.jsp");
                }  
                else
                {
                    if(userType.equals("ADMIN"))
                    {
                        //Admin
                        response.sendRedirect("../Admin/index.jsp");
                    }
                    else
                    {
                        //none of the above
                    }
                }
            }
        }
        catch(Exception ex){}
    %>
    <br><br>
    <div class="container h-100">
        <div class="d-flex justify-content-center h-100">
            <div class="user_card">
                <div class="d-flex justify-content-center">
                    <div class="brand_logo_container">
                        <img src="../image/Sabzi_Logo.png" class="brand_logo" alt="Logo">
                    </div>
                </div>
                <div class="d-flex justify-content-center form_container">
                    <form name="login" action="../MainLogin" method="POST">
                        <div class="input-group mb-3">
                            <div class="input-group-append">
                                <span class="input-group-text"><i class="fas fa-user"></i></span>
                            </div>
                            <input type="text" name="Login_username" id="Login_username" class="form-control input_user"
                                 placeholder="username" onblur="CheckEmail(this.value)">
                            <span id="Login_username_Error" style="color:red;"></span>
                        </div>
                        <div class="input-group mb-2">
                            <div class="input-group-append">
                                <span class="input-group-text"><i class="fas fa-key"></i></span>
                            </div>
                            <input type="password" name="Login_password" id="Login_password"
                                class="form-control input_pass" value="" placeholder="password">
                            <span id="Login_password_Error" style="color:red;"></span>
                        </div>
                        <div class="form-group">
                            <div class="custom-control custom-checkbox">
                                <input type="checkbox" class="custom-control-input" id="customControlInline">
                                <label class="custom-control-label" for="customControlInline"
                                    style="color:#ffff00;">Accept Terms & Condition
                                   
                                </label>
                                
                            </div>
                        </div>
                        <div class="d-flex justify-content-center mt-8 login_container">
                            <input type="submit" name="log_sub" class="btn login_btn"
                                onclick="return Login_Validation()" value="Login">
                        </div>
                      
                    </form>
                </div>
                <div class="mt-4">
                     
                    <div class="d-flex justify-content-center links" style="color:#ffff00;">
                        Don't have an account? <a href="Registration.jsp" class="ml-2" style="color:#ffff00;">Sign
                            Up</a>
                       
                    </div>
                    <div class="container">
                        <a href="#" data-target="#pwdModal" data-toggle="modal"
                            style="color: tomato; position: relative; left: 78px;">Forgot my password</a>
                    <div class="tooltip11" id="aaa">
                     
                     </div>
                    </div>
                </div>
                <!--Forgot Password Model Start-->
                <div id="pwdModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="text-center">What's My Password ?</h1>
                            </div>
                            <div class="modal-body">
                                <div class="col-md-12">
                                    <div class="panel panel-default">
                                        <div class="panel-body">
                                            <div class="text-center">
                                                <p>If you have forgotten your password you can reset it here.</p>
                                                <form class="form-group" action="../SendMail" method="POST">
                                                    <div class="panel-body">
                                                        <fieldset>
                                                            <div class="form-group">
                                                                <input class="form-control input-lg"
                                                                    placeholder="E-mail Address" name="email"
                                                                    type="email" id="email">
                                                            </div>
                                                            <div class="form-group"><font color="red" id="em"></font></div>
                                                            <input class="btn btn-lg btn-primary btn-block"
                                                                value="Send My Password" type="submit" onclick="return emailcheck()">
                                                        </fieldset>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <div class="col-md-7">
                                    <button class="btn" data-dismiss="modal" aria-hidden="true" onClick="close()">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--Forgot Password Model End-->

            </div>
        </div>
    </div>
    <%@include file="../PageFiles/footerMain.jsp" %>
     <script src="../Javascript/loder.js"></script>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
     <script>
function CheckEmail(str) {
    if (str.length == 0) { document.getElementById("aaa2").style.visibility = "hidden"; document.getElementById("aaa2").style.opacity = 0; document.getElementById("aaa2").innerHTML = ""; return; }
  $.ajax({
      url: "CheckEmail_login.jsp",
      type:'post',
      data:{q:str},
      success: function(result){
           $("#aaa").html(result);
            document.getElementById("aaa2").style.visibility = "visible";
            document.getElementById("aaa2").style.opacity = 1;
     
  }});
 // xhttp.open("GET", "CheckEmail_login.jsp?q="+str, true);
 
}
</script>
</body>

</html>