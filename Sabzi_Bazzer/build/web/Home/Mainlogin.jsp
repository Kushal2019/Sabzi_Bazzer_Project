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
	<script src="../Javascript/Mainlogin_Validation.js"></script>
        <script>
            function errorMag()
            {
                alert("Invalid Userid or Password");
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
    }
    catch(Exception e){}
%>

<body onload="<%=(err==1)?"errorMag()":""%>">
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
							<input type="text" name="Login_username" id="Login_username" class="form-control input_user" value="" placeholder="username">
                                                        <span id="Login_username_Error" style="color:red;"></span>
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
                                                            <span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="Login_password" id="Login_password" class="form-control input_pass" value="" placeholder="password">
                                                        <span id="Login_password_Error" style="color:red;"></span> 
						</div>
						<div class="form-group">
							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input" id="customControlInline">
								<label class="custom-control-label" for="customControlInline">Accept Terms & Condition</label>
							</div>
						</div>
						<div class="d-flex justify-content-center mt-8 login_container">
							<input type="submit" name="log_sub" class="btn login_btn"
								onclick="return Login_Validation()" value="Login">
						</div>
                                        
					</form>
				</div>
				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Don't have an account? <a href="Registration.jsp" class="ml-2">Sign Up</a>
					</div>
					<div class="d-flex justify-content-center links">
						<a href="#">Forgot your password?</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="../PageFiles/footerMain.jsp" %>
</body>

</html>