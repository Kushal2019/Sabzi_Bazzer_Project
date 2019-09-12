<html>

<head>
    <title>Registation Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Css/Mainlogin.css">
    <link rel="stylesheet" type="text/css" href="../Css/Registration_Style.css">
    <script type="text/javascript" src="../Javascript/Registration_Validation.js"></script>
</head>
<!--Coded with love by Mutiullah Samim-->

<body>
    <%@include file="../PageFiles/navReg.jsp" %>
    <br>
    <div class="container register">
        <div class="row">
            <div class="col-md-3 register-left">
                <img src="../image/Sabzi_Logo.png" alt="" />
                <h3>Welcome</h3>
                <p>You are 30 seconds away from earning your own money!</p>
                <input type="submit" name="" value="Login" /><br />
            </div>
            <div class="col-md-9 register-right">
                <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab"
                            aria-controls="home" aria-selected="false">User</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab"
                            aria-controls="profile" aria-selected="true">Seller</a>
                    </li>
                </ul>
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                        <form>
                            <h3 class="register-heading">Apply as a User</h3>
                            <div class="row register-form">
                                <div class="col-md-6">

                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="First Name *"
                                            name="u_f_name" id="u_f_name" />
                                        <span style="color:red;" id="e1"></span>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Last Name *" value=""
                                            name="u_last_name" id="u_last_name" />
                                        <span style="color:red;" id="e2"></span>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" placeholder="Password *" value=""
                                            name="u_password" id="u_password" />
                                        <span style="color:red;" id="e3"></span>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" placeholder="Confirm Password *"
                                            value="" name="u_c_password" id="u_c_password" />
                                        <span style="color:red;" id="e4"></span>
                                    </div>
                                    <div class="form-group">
                                        <div class="maxl">
                                            <label class="radio inline">
                                                <input type="radio" name="u_gender" value="male" checked id="male">
                                                <span> Male </span>
                                            </label>
                                            <label class="radio inline">
                                                <input type="radio" name="u_gender" value="female" id="female">
                                                <span>Female </span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input type="email" class="form-control" placeholder="Your Email *" value=""
                                            name="u_email" id="u_email" />
                                        <span style="color:red;" id="e5"></span>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" minlength="10" maxlength="10" name="txtEmpPhone"
                                            class="form-control" placeholder="Your Phone *" value="" id="txtEmpPhone" />
                                        <span style="color:red;" id="e6"></span>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control" name="u_s_question" id="u_s_question"
                                            onchange="SQ()">
                                            <option class="hidden" selected disabled value="">Please select your
                                                Sequrity Question</option>
                                            <option value="What is your Birthdate?">What is your Birthdate?</option>
                                            <option value="What is Your old Phone Number">What is Your old Phone Number
                                            </option>
                                            <option value="What is your Pet Name?">What is your Pet Name?</option>
                                        </select>
                                        <span style="color:red;" id="e7"></span>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Enter Your Answer *"
                                            disabled value="" name="u_s_answer" id="u_s_answer" />
                                        <span style="color:red;" id="e8"></span>
                                    </div>
                                    <input type="submit" class="btnRegister" value="Register"
                                        onclick="return User_validation()" />
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="tab-pane fade show" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                        <form>
                            <h3 class="register-heading">Apply as a Seller</h3>
                            <div class="row register-form">
                                <div class="col-md-6">
                                    <form>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" value=""
                                                name="s_f_name" id="s_f_name" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" value=""
                                                name="s_last_name" id="s_last_name" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Password *"
                                                value="" name="s_password" id="s_password" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Confirm Password *"
                                                value="" name="s_c_password" id="s_c_password" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Licence Number *"
                                                value="" name="s_licence" id="s_licence" />
                                        </div>
                                        <div class="form-group">
                                            <input type="email" class="form-control" placeholder="Email *" value=""
                                                name="s_email" id="s_email" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" maxlength="10" minlength="10" class="form-control"
                                                placeholder="Phone *" value="" name="s_phone" id="s_phone" />
                                        </div>
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline">
                                                    <input type="radio" name="s_gender" value="male" checked id="male">
                                                    <span> Male </span>
                                                </label>
                                                <label class="radio inline">
                                                    <input type="radio" name="s_gender" value="female" id="female">
                                                    <span>Female </span>
                                                </label>
                                            </div>
                                        </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <select class="form-control" name="s_state" id="s_state" onchange="state()">
                                            <option class="hidden" selected disabled>Select your State *</option>
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
                                    <div class="form-group">
                                        <select class="form-control" name="s_city" id="s_town">
                                            <option class="hidden" selected disabled>Select your Town *</option>
                                            <option>Unknown Town</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Zip Code *" value=""
                                            name="s_zip" id="s_zip" />
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Street *" value=""
                                            name="s_street" id="s_street" />
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="House Number *" value=""
                                            name="s_house" id="s_house" />
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Landmark *" value=""
                                            name="s_landmark" id="s_landmark" />
                                    </div>
                                    <input type="submit" class="btnRegister" value="Register"
                                        onclick="Seller_validation()" />

                                </div>
                            </div>

                    </div>
                </div>
            </div>
        </div>

    </div>
    </form>
    <%@include file="../PageFiles/footerMain.jsp" %>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>

</html>