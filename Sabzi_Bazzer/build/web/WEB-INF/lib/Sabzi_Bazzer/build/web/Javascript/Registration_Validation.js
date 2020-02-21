//************************************ User Validation Function Start ***********************************
let code;
function User_validation() {
    let u_f_name, u_last_name, u_password, u_c_password, u_email, txtEmpPhone, u_s_question, u_s_answer, f = 0;
    u_f_name = document.getElementById('u_f_name');
    u_last_name = document.getElementById('u_last_name');
    u_password = document.getElementById('u_password');
    u_c_password = document.getElementById('u_c_password');
    u_email = document.getElementById('u_email');
    txtEmpPhone = document.getElementById('txtEmpPhone');
    u_s_question = document.getElementById('u_s_question');
    u_s_answer = document.getElementById('u_s_answer');

    // First_Name Validation Start
    if (u_f_name.value == "") {
        u_f_name.style.borderColor = "red";
        document.getElementById('e1').innerHTML = "Enter the first name";
        u_f_name.focus();
        f = 1;
    }
    else {
        if (u_f_name.value.match(/^[A-Za-z]+$/)) {
            if (u_f_name.value.length < 3 || u_f_name.value.length > 10) {
                u_f_name.style.borderColor = "red";
                document.getElementById('e1').innerHTML = "First name must be 3-10 characters";
                u_f_name.focus();
                f = 1;
            }
            else {
                u_f_name.style.borderColor = "green";
                document.getElementById('e1').innerHTML = "";
            }
        }
        else {
            u_f_name.style.borderColor = "red";
            document.getElementById('e1').innerHTML = "number  not allowed";
            u_f_name.focus();
            f = 1;
        }
    }
    // First_Name Validation End

    // Last_Name Validation Start
    if (u_last_name.value == "") {
        u_last_name.style.borderColor = "red";
        document.getElementById('e2').innerHTML = "Enter the last name";

        f = 1;
    }
    else {
        if (u_last_name.value.match(/^[A-Za-z]+$/)) {

            if (u_last_name.value.length < 3 || u_last_name.value.length > 10) {
                u_last_name.style.borderColor = "red";
                document.getElementById('e2').innerHTML = "Last name must be 3-10 characters";
                u_last_name.focus();
                f = 1;
            }
            else {
                u_last_name.style.borderColor = "green";
                document.getElementById('e2').innerHTML = "";
            }
        }
        else {
            u_last_name.style.borderColor = "red";
            document.getElementById('e2').innerHTML = "number  not allowed";
            u_last_name.focus();
            f = 1;
        }
    }

    // Last_Name Validation

    // Password Validation Start
    if (u_password.value == "") {
        u_password.style.borderColor = "red";
        document.getElementById('e3').innerHTML = "Enter the password";

        f = 1;
    }
    else {

        if (!u_password.value.match(/[A-Z]/)) {
            u_password.style.borderColor = "red";
            document.getElementById('e3').innerHTML = "Password must be a capital letter";
            u_password.focus();
            f = 1;
        }
        else {
            if (!u_password.value.match(/[!@#$%^&*]/)) {
                u_password.style.borderColor = "red";
                document.getElementById('e3').innerHTML = "Password must be a special letter";
                u_password.focus();
                f = 1;
            }
            else {
                if (u_password.value.length < 4 || u_password.value.length > 10) {
                    u_password.style.borderColor = "red";
                    document.getElementById('e3').innerHTML = "Password must be 4-10 characters";
                    u_password.focus();
                    f = 1;
                }
                else {
                    u_password.style.borderColor = "green";
                    document.getElementById('e3').innerHTML = "";
                }

            }
        }
    }
    //Password Validation End

    // Confirm Password Validation Start
    if (u_c_password.value == "") {
        u_c_password.style.borderColor = "red";
        document.getElementById('e4').innerHTML = "Enter the Confirm password";
        f = 1;
    }
    else {
        if (u_password.value != u_c_password.value) {
            u_c_password.style.borderColor = "red";
            document.getElementById('e4').innerHTML = "confirm password does not match";
            u_c_password.focus();
            f = 1;
        }
        else {
            u_c_password.style.borderColor = "green";
            document.getElementById('e4').innerHTML = "";
        }

    }
    // Confirm Password Validation End
    if (u_email.value == "") {
        u_email.style.borderColor = "red";
        document.getElementById('e5').innerHTML = "Enter the Email";
        f = 1;
    }
    else {
        let atposition = u_email.value.indexOf("@");
        let dotposition = u_email.value.lastIndexOf(".");
        if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= u_email.length) {
            u_email.style.borderColor = "red";
            document.getElementById('e5').innerHTML = "Please enter a valid e-mail address";
            u_email.focus();
            f = 1;
        }
        else {
            s_email.style.borderColor = "green";
            document.getElementById('e5').innerHTML = "";
        }
    }

    if (txtEmpPhone.value == "") {
        txtEmpPhone.style.borderColor = "red";
        document.getElementById('e6').innerHTML = "Enter the phone number";
        f = 1;
    }
    else {

        if (isNaN(txtEmpPhone.value)) {
            txtEmpPhone.style.borderColor = "red";
            document.getElementById('e6').innerHTML = "character not allowed ";
            f = 1;
        }
        else {
            if (txtEmpPhone.value.length != 10) {
                txtEmpPhone.style.borderColor = "red";
                document.getElementById('e6').innerHTML = "Number must be 10 digits ";
                f = 1;
            }
            else {
                txtEmpPhone.style.borderColor = "green";
                document.getElementById('e6').innerHTML = "";
            }
        }
    }
    if (u_s_question.value == "") {
        u_s_question.style.borderColor = "red";
        document.getElementById('e7').innerHTML = "Enter the sequrity Question";
        f = 1;
    }
    else {
        u_s_question.style.borderColor = "green";
        document.getElementById('e7').innerHTML = "";
    }
    let x = SQ();
    if (x == 1) {
        u_s_answer.style.borderColor = "red";
        document.getElementById('e8').innerHTML = "Enter the Answer ";
        f = 1;

    }
    else {
        if (!u_s_answer.value == "") {
            u_s_answer.style.borderColor = "green";
            document.getElementById('e8').innerHTML = "";

        }
    }

    if (f == 0) {
        return true;
    }
    else {
        return false;
    }
}
// Password Validation End

//Question_Answer Validation Start

function SQ() {
    let u_s_question = document.getElementById('u_s_question');
    let u_s_answer = document.getElementById('u_s_answer');
    if (!u_s_question.value == "") {
        u_s_answer.disabled = false;
        if (u_s_answer.value == "") {
            return 1;
        }
    }
}
//Question_Answer Validation Start




//************************************ User Validation Function End ***********************************
//
//************************* Seller  Vallidation start*************************************************
function Seller_validation() {
    let s_f_name, s_last_name, s_password, s_c_password, s_licence, s_email, s_phone, s_Company, s_state, s_town, s_zip, s_street, s_house, s_landmark, s_capctha, f = 0;
    s_f_name = document.getElementById('s_f_name');
    s_last_name = document.getElementById('s_last_name');
    s_password = document.getElementById('s_password');
    s_c_password = document.getElementById('s_c_password');
    s_licence = document.getElementById('s_licence');
    s_email = document.getElementById('s_email');
    s_phone = document.getElementById('s_phone');
    s_Company = document.getElementById('s_Company');
    s_state = document.getElementById('s_state');
    s_town = document.getElementById('s_town');
    s_zip = document.getElementById('s_zip');
    s_street = document.getElementById('s_street');
    s_house = document.getElementById('s_house');
    s_landmark = document.getElementById('s_landmark');
    s_capctha = document.getElementById('s_capctha');

    if (s_f_name.value == "") {
        s_f_name.style.borderColor = "red";
        document.getElementById('s1').innerHTML = "Enter the first name";
        s_f_name.focus();
        f = 1;
    }
    else {
        if (s_f_name.value.match(/^[A-Za-z]+$/)) {

            if (s_f_name.value.length < 3 || s_f_name.value.length > 10) {
                s_f_name.style.borderColor = "red";
                document.getElementById('s1').innerHTML = "First name must be 3-10 characters";
                s_f_name.focus();
                f = 1;
            }
            else {
                s_f_name.style.borderColor = "green";
                document.getElementById('s1').innerHTML = "";
            }
        }
        else {
            s_f_name.style.borderColor = "red";
            document.getElementById('s1').innerHTML = "Invalid Name";
            s_f_name.focus();
            f = 1;
        }
    }
    // First_Name Validation End

    // Last_Name Validation Start
    if (s_last_name.value == "") {
        s_last_name.style.borderColor = "red";
        document.getElementById('s2').innerHTML = "Enter the last name";
        f = 1;
    }
    else {
        if (s_last_name.value.match(/^[A-Za-z]+$/)) {

            if (s_last_name.value.length < 3 || s_last_name.value.length > 10) {
                s_last_name.style.borderColor = "red";
                document.getElementById('s2').innerHTML = "Last name must be 3-10 characters";
                s_last_name.focus();
                f = 1;
            }
            else {
                s_last_name.style.borderColor = "green";
                document.getElementById('s2').innerHTML = "";
            }
        }
        else {
            s_last_name.style.borderColor = "red";
            document.getElementById('s2').innerHTML = "Invalid Name";
            s_last_name.focus();
            f = 1;
        }
    }

    // Last_Name Validation

    // Password Validation Start
    if (s_password.value == "") {
        s_password.style.borderColor = "red";
        document.getElementById('s3').innerHTML = "Enter the password";

        f = 1;
    }
    else {

        if (!s_password.value.match(/[A-Z]/)) {
            s_password.style.borderColor = "red";
            document.getElementById('s3').innerHTML = "Password must be a capital letter";
            s_password.focus();
            f = 1;
        }
        else {
            if (!s_password.value.match(/[!@#$%^&*]/)) {
                s_password.style.borderColor = "red";
                document.getElementById('s3').innerHTML = "Password must be a special letter";
                s_password.focus();
                f = 1;
            }
            else {
                if (s_password.value.length < 4 || s_password.value.length > 10) {
                    s_password.style.borderColor = "red";
                    document.getElementById('s3').innerHTML = "Password must be 4-10 characters";
                    s_password.focus();
                    f = 1;
                }
                else {
                    s_password.style.borderColor = "green";
                    document.getElementById('s3').innerHTML = "";
                }

            }
        }
    }
    //Password Validation End

    // Confirm Password Validation Start
    if (s_c_password.value == "") {
        s_c_password.style.borderColor = "red";
        document.getElementById('s4').innerHTML = "Enter the Confirm password";
        f = 1;
    }
    else {
        if (s_c_password.value != s_password.value) {
            s_c_password.style.borderColor = "red";
            document.getElementById('s4').innerHTML = "confirm password does not match";
            s_c_password.focus();
            f = 1;
        }
        else {
            s_c_password.style.borderColor = "green";
            document.getElementById('s4').innerHTML = "";
        }

    }
    // Confirm Password Validation End

    //Email validation start
    if (s_email.value == "") {
        s_email.style.borderColor = "red";
        document.getElementById('s7').innerHTML = "Enter the Email";
        f = 1;
    }
    else {
        let atposition = s_email.value.indexOf("@");
        let dotposition = s_email.value.lastIndexOf(".");
        if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= s_email.length) {
            s_email.style.borderColor = "red";
            document.getElementById('s7').innerHTML = "Please enter a valid e-mail address";
            f = 1;
        }
        else {
            s_email.style.borderColor = "green";
            document.getElementById('s7').innerHTML = "";
        }
    }

    //Email Validation End

    //Licence Number Validation Start
    if (s_licence.value == "") {
        s_licence.style.borderColor = "red";
        document.getElementById('s6').innerHTML = "Enter the Licence number";

        f = 1;
    }
    else {
        s_licence.style.borderColor = "green";
        document.getElementById('s6').innerHTML = "";
    }
    //licence number validation end

    //Company name validation start
    if (s_Company.value == "") {
        s_Company.style.borderColor = "red";
        document.getElementById('s5').innerHTML = "Enter the Company name";
        f = 1;
    }
    else {
        s_licence.style.borderColor = "green";
        document.getElementById('s5').innerHTML = "";
    }
    //Company Name Validation End

    //Phone Number Validtion Start

    if (s_phone.value == "") {
        s_phone.style.borderColor = "red";
        document.getElementById('s8').innerHTML = "Enter the phone number";
        f = 1;
    }
    else {

        if (isNaN(s_phone.value)) {
            s_phone.style.borderColor = "red";
            document.getElementById('s8').innerHTML = "Character not allowed ";
            f = 1;
        }
        else {
            if (s_phone.value.length != 10) {
                s_phone.style.borderColor = "red";
                document.getElementById('s8').innerHTML = "Number must be 10 digits ";
                f = 1;
            }
            else {
                s_phone.style.borderColor = "green";
                document.getElementById('s8').innerHTML = "";
            }
        }
    }

    //Phone Number Validation End 

    //Captch-Code Validation

    if (s_capctha.value == "") {

        s_capctha.style.borderColor = "red";
        document.getElementById('s15').innerHTML = "Enter the Captcha ";
        f = 1;
    }
    else {
        if (s_capctha.value == code) {
            s_capctha.style.borderColor = "green";
            document.getElementById('s15').innerHTML = "";
        }
        else {
            s_capctha.style.borderColor = "red";
            document.getElementById('s15').innerHTML = "Wrong Captcha ";
            f = 1;
        }
    }
    //Captch-Code Validation End

    //State and Town Validation Start

    if (s_state.value == "") {
        s_state.style.borderColor = "red";
        document.getElementById('s9').innerHTML = "Select the state";
        f = 1;
    }
    else {
        s_state.style.borderColor = "green";
        document.getElementById('s9').innerHTML = "";
        if (s_town.value == "") {
            s_town.style.borderColor = "red";
            document.getElementById('s10').innerHTML = "Select the Town";
            f = 1;
        }
        else {
            s_town.style.borderColor = "green";
            document.getElementById('s10').innerHTML = "";

        }
    }

    //State and Town Validation End

    //Zip-Code Validation Start
    if (s_zip.value == "") {
        s_zip.style.borderColor = "red";
        document.getElementById('s11').innerHTML = "Enter the Zip code";
        f = 1;
    }
    else {
        s_zip.style.borderColor = "green";
        document.getElementById('s11').innerHTML = "";
    }
    //Zip-Code Validation End

    //Street Validation Start
    if (s_street.value == "") {
        s_street.style.borderColor = "red";
        document.getElementById('s12').innerHTML = "Enter the Street";
        f = 1;
    }
    else {
        s_street.style.borderColor = "green";
        document.getElementById('s12').innerHTML = "";
    }
    //Street Validation End

    if (s_house.value == "") {
        s_house.style.borderColor = "red";
        document.getElementById('s13').innerHTML = "Enter the House number";
        f = 1;
    }
    else {
        s_house.style.borderColor = "green";
        document.getElementById('s13').innerHTML = "";
    }


    if (s_landmark.value == "") {
        s_landmark.style.borderColor = "red";
        document.getElementById('s14').innerHTML = "Enter the Landmark";
        f = 1;
    }
    else {
        s_landmark.style.borderColor = "green";
        document.getElementById('s14').innerHTML = "";
    }
    if (f == 0) {
        return true;
    }
    else {
        return false;
    }
}

//Dropdown Menu Vallidation Start
function state() {
    let s_state, s_town;
    s_state = document.getElementById('s_state');
    s_town = document.getElementById('s_town');
    if (s_state.value == "West Bengal") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='kolkata'>Kolkata</option>\n\
                            <option value='Asansol'>Asansol</option>\n\
                            <option value='North 24 Parganas'>North 24 Parganas</option>\n\
                            <option value='South 24 Parganas'>South 24 Parganas</option>\n\
                            <option value='Howrah'>Howrah</option>\n\
                            <option value='Hooghly'>Hooghly</option>\n\
                            <option value='Malda'>Malda</option>\n\
                            <option value='Paschim Medinipur'>Paschim Medinipur</option>\n\
                            <option value='Bankura'>Bankura</option>\n\
                            <option value='Purba Medinipur'>Purba Medinipur</option>";
    }
    if (s_state.value == "Bihar") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Patna'>Patna</option>\n\
                            <option value='Gaya'>Gaya</option>\n\
                            <option value='Bhagalpur'>Bhagalpur</option>\n\
                            <option value='Muzaffarpur'>Muzaffarpur</option>\n\
                            <option value='Purnia'>Purnia</option>\n\
                            <option value='Bhojpur'>Bhojpur</option>\n\
                            <option value='Jamalpur'>Jamalpur</option>\n\
                            <option value='Bagaha'>Bagaha</option>\n\
                            <option value='Siwan'>Siwan</option>";
    }
    if (s_state.value == "Gujarat") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Ahmedabad'>Ahmedabad</option>\n\
                            <option value='Surat'>Surat</option>\n\
                            <option value='Rajkot'>Rajkot</option>\n\
                            <option value='Bhavnagar'>Bhavnagar</option>\n\
                            <option value='Jamnagar'>Jamnagar</option>\n\
                            <option value='Vadodara'>Vadodara</option>\n\
                            <option value='Nadiad'>Nadiad</option>\n\
                            <option value='Gandhidham'>Gandhidham</option>\n\
                            <option value='Porbandar'>Porbandar</option>";
    }
    if (s_state.value == "Himachal Pradesh") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Shimla'>Shimla</option>\n\
                            <option value='Solan'>Solan</option>\n\
                            <option value='Dharamsala'>Dharamsala</option>\n\
                            <option value='Baddi'>Baddi</option>\n\
                            <option value='Nahan'>Nahan</option>\n\
                            <option value='Mandi'>Mandi</option>\n\
                            <option value='Paonta Sahib'>Paonta Sahib</option>\n\
                            <option value='Sundarnagar'>Sundarnagar</option>\n\
                            <option value='Chamba'>Chamba</option>";
    }
    if (s_state.value == "Maharashtra") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Mumbai'>Mumbai</option>\n\
                            <option value='Pune'>Pune</option>\n\
                            <option value='Nagpur'>Nagpur</option>\n\
                            <option value='Nashik'>Nashik</option>\n\
                            <option value='Aurangabad'>Aurangabad</option>\n\
                            <option value='Jalgaon'>Jalgaon</option>\n\
                            <option value='Gondia'>Gondia</option>\n\
                            <option value='Sangli'>Sangli</option>\n\
                            <option value='Jalna'>Jalna</option>";
    }
    if (s_state.value == "Odisha") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Bhubaneswar'>Bhubaneswar</option>\n\
                            <option value='Cuttack'>Cuttack</option>\n\
                            <option value='Rourkela'>Rourkela</option>\n\
                            <option value='Brahmapur'>Brahmapur</option>\n\
                            <option value='Puri'>Puri</option>\n\
                            <option value='Baripada'>Baripada</option>\n\
                            <option value='Jeypore'>Jeypore</option>\n\
                            <option value='Bargarh'>Bargarh</option>\n\
                            <option value='Rayagada'>Rayagada</option>";
    }
    if (s_state.value == "Tamil Nadu") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Chennai'>Chennai</option>\n\
                            <option value='Coimbatore'>Coimbatore</option>\n\
                            <option value='Madurai'>Madurai</option>\n\
                            <option value='Tiruchirappalli'>Tiruchirappalli</option>\n\
                            <option value='Tiruppur'>Tiruppur</option>\n\
                            <option value='Salem'>Salem</option>\n\
                            <option value='Erode'>Erode</option>\n\
                            <option value='Vellore'>Vellore</option>\n\
                            <option value='Dindigul'>Dindigul</option>";

    }
    if (s_state.value == "Uttarakhand") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                           <option value='Dehradun'>Dehradun</option>\n\
                            <option value='Haridwar'>Haridwar</option>\n\
                            <option value='Rudrapur'>Rudrapur</option>\n\
                            <option value='Roorkee'>Roorkee</option>\n\
                            <option value='Kashipur'>Kashipur</option>\n\
                            <option value='Rishikesh'>Rishikesh</option>\n\
                            <option value='Haldwani'>Haldwani</option>";
    }


}
//Dropdown menu Vallidation End

//Capture Validation Start
function ran(st_l) {
    var a1, a2, a3;
    a1 = Math.floor(Math.random() * 10);
    a2 = Math.floor(Math.random() * 10);
    a3 = Math.floor(Math.random() * 10);
    let r_s = '';
    let r_a;
    let rs = '';
    let ra;
    for (let i = 0; i < st_l; i++) {
        r_a = Math.floor((Math.random() * (122 - 97)) + 97);
        r_s += String.fromCharCode(r_a)

    }
    for (let i = 0; i < st_l; i++) {
        ra = Math.floor((Math.random() * (90 - 65)) + 65);
        rs += String.fromCharCode(ra)

    }
    code = a1 + "" + r_s + "" + a2 + "" + rs + "" + a3;
    document.getElementById("captext").value = code;
    //document.write(f);
    //return f;
}
 //Capture Validation End
 
  function passwordcheck()
        {
            let pass=document.getElementById("newpass");
            let cpass=document.getElementById("newcpass");
            let oldpass=document.getElementById("oldpass");
            let f=1;
            if(pass.value==="" && cpass.value==="" && oldpass.value==="" )
            {
                 document.getElementById("aaa").style.visibility = "visible";
                 document.getElementById("aaa").style.opacity = 1;
                 document.getElementById("aaa").innerHTML="please fill out all field";
                f=0;
            }
            else
            {
                if(oldpass.value==="")
                {
                     document.getElementById("aaa").style.visibility = "visible";
                      document.getElementById("aaa").style.opacity = 1;
                    document.getElementById("aaa").innerHTML="please fill out Old Password field";
                 f=0;
                }
                else
                {
                    if(pass.value==="")
                     {
                          document.getElementById("aaa").style.visibility = "visible";
                          document.getElementById("aaa").style.opacity = 1;
                            document.getElementById("aaa").innerHTML="please fill out New Password field";
                            f=0;
                      }
                      else
                      {
                          if(cpass.value==="")
                            {
                                 document.getElementById("aaa").style.visibility = "visible";
                                document.getElementById("aaa").style.opacity = 1;
                                 document.getElementById("aaa").innerHTML="please fill out Confirm Password field";
                                  f=0;
                            }
                          else
                            {
                                 if(cpass.value!==pass.value)
                                 {
                                      document.getElementById("aaa").style.visibility = "visible";
                                        document.getElementById("aaa").style.opacity = 1;
                                    document.getElementById("aaa").innerHTML="Confirm Password does not mathc new Password";
                                     f=0;
                                 }
                                 else
                                 {
                                     f=1;
                                 }
                             }
                      }
                    
                }
               
            }
           
            
           
            if(f===0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
         function hide()
        {
                //alert("hi");
            document.getElementById("btnChangePicture").style.display = "none";
            document.getElementById("btnSubmitPicture").style.display = "none";
        }
         function Show()
        {
                //alert("hi");
            document.getElementById("btnChangePicture").style.display = "block";
            
        }
         function Show1()
        {
                //alert("hi");
            document.getElementById("btnSubmitPicture").style.display = "block";
            
        }
        function selecttown()
        {
            let s_state=document.getElementById("s_state");
            let town=document.getElementById("s_town");
            let zip_code=document.getElementById("zip_code");
            let street=document.getElementById("street");
            let house_number=document.getElementById("house_number");
            let landmark=document.getElementById("landmark");
            let f=1;
            if(town.value=="")
            {
                document.getElementById("s_town").focus();
                f=0;
            }
            if(s_state.value=="" ||zip_code.value=="" ||street.value=="" || house_number.value=="" || landmark.value=="")
            {
                document.getElementById("aaa").style.visibility = "visible";
                 document.getElementById("aaa").style.opacity = 1;
                 document.getElementById("aaa").innerHTML="please fill out all field";
                f=0;
            }
            if(f==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        function validPI()
        {
            let fname,lastn,company,email,ph,lic;
            fname= document.getElementById("colFormLabelSm1");
            lastn= document.getElementById("colFormLabelSm2"); 
            company= document.getElementById("colFormLabelSm3");
            email= document.getElementById("colFormLabelSm4");
            ph= document.getElementById("colFormLabelSm5");
            lic= document.getElementById("colFormLabelSm6");
            let f=1;
            if(fname.value=="" || lastn.value=="" || company.value=="" || email.value=="" || ph.value=="" || lic.value=="")
            {
                document.getElementById("aaa").style.visibility = "visible";
                 document.getElementById("aaa").style.opacity = 1;
                 document.getElementById("aaa").innerHTML="please fill out all field";
                 document.getElementById("aaa").focus();
                 
                f=0;
            }
            if(f===1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
         function validMA()
        {
            let fname,lastn,company,email,ph,lic;
            fname= document.getElementById("colFormLabelSm1");
            lastn= document.getElementById("colFormLabelSm2"); 
            company= document.getElementById("colFormLabelSm3");
            email= document.getElementById("colFormLabelSm4");
            ph= document.getElementById("colFormLabelSm5");
            lic= document.getElementById("colFormLabelSm6");
            let f=1;
            if(fname.value=="" || lastn.value=="" || company.value=="" || email.value=="" || ph.value=="" || lic.value=="")
            {
                document.getElementById("aaa").style.visibility = "visible";
                 document.getElementById("aaa").style.opacity = 1;
                 document.getElementById("aaa").innerHTML="please fill out all field";
                 document.getElementById("aaa").focus();
                 
                f=0;
            }
            if(f===1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        function validUserPI()
        {
            let fname,lastn,company,email,ph,lic;
            fname= document.getElementById("colFormLabelSm");
            lastn= document.getElementById("colFormLabelSm1"); 
            
            email= document.getElementById("colFormLabelSm2");
            ph= document.getElementById("colFormLabelSm3");
          
            let f=1;
            if(fname.value=="" || lastn.value=="" ||  email.value=="" || ph.value=="")
            {
                document.getElementById("aaa").style.visibility = "visible";
                 document.getElementById("aaa").style.opacity = 1;
                 document.getElementById("aaa").innerHTML="please fill out all field";
                 document.getElementById("aaa").focus();
                 
                f=0;
            }
            if(f===1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        function UserAddVAl()
        {
            
            let f=1 ;
           let house_number = document.getElementById('house_number1');
           let street_number = document.getElementById('street_number1');
            let vill_town = document.getElementById('vill_town1');
            let post_office = document.getElementById('post_office1');
           let police_station = document.getElementById('police_station1');
          let  s_town = document.getElementById('s_town');
          let  s_state = document.getElementById('s_state');
         let   pin_code = document.getElementById('pin_code1');
         let   landmark = document.getElementById('landmark1');
             if (house_number.value === "") {
                  house_number.style.borderColor = "red";
                  document.getElementById('m1').innerHTML = "Enter the House No. ";
                     f = 0;
                }
                if (street_number.value == "") {
                  street_number.style.borderColor = "red";
                  document.getElementById('m2').innerHTML = "Enter the Street No. ";
                     f = 0;
                }
                if (vill_town.value == "") {
                  vill_town.style.borderColor = "red";
                  document.getElementById('m3').innerHTML = "Enter the Vill/Town. ";
                     f = 0;
                }
                if (post_office.value == "") {
                  post_office.style.borderColor = "red";
                  document.getElementById('m4').innerHTML = "Enter the Post Office ";
                     f = 0;
                }
                if (police_station.value == "") {
                  police_station.style.borderColor = "red";
                  document.getElementById('m5').innerHTML = "Enter the Police Station";
                     f = 0;
                }
               
                if (pin_code.value == "") {
                  pin_code.style.borderColor = "red";
                  document.getElementById('m8').innerHTML = "Enter the Pin code ";
                     f = 0;
                }
                if (landmark.value == "") {
                  landmark.style.borderColor = "red";
                  document.getElementById('m9').innerHTML = "Enter the Landmark ";
                     f = 0;
                }
                 if (s_town.value == "") {
                  s_town.style.borderColor = "red";
                  document.getElementById('m6').innerHTML = "Select the Distric ";
                     f = 0;
                }
                if (s_state.value == "") {
                  s_state.style.borderColor = "red";
                  document.getElementById('m7').innerHTML = "Select the State ";
                     f = 0;
                }
                if(f==1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
        }
         function UserAddVAl1()
        {
            
            let f=1 ;
           let house_number = document.getElementById('house_number2');
           let street_number = document.getElementById('street_number2');
            let vill_town = document.getElementById('vill_town2');
            let post_office = document.getElementById('post_office2');
           let police_station = document.getElementById('police_station2');
          let  s_town = document.getElementById('s_town1');
          let  s_state = document.getElementById('s_state1');
         let   pin_code = document.getElementById('pin_code2');
         let   landmark = document.getElementById('landmark2');
             if (house_number.value === "") {
                  house_number.style.borderColor = "red";
                  document.getElementById('m11').innerHTML = "Enter the House No. ";
                     f = 0;
                }
                if (street_number.value == "") {
                  street_number.style.borderColor = "red";
                  document.getElementById('m21').innerHTML = "Enter the Street No. ";
                     f = 0;
                }
                if (vill_town.value == "") {
                  vill_town.style.borderColor = "red";
                  document.getElementById('m31').innerHTML = "Enter the Vill/Town. ";
                     f = 0;
                }
                if (post_office.value == "") {
                  post_office.style.borderColor = "red";
                  document.getElementById('m41').innerHTML = "Enter the Post Office ";
                     f = 0;
                }
                if (police_station.value == "") {
                  police_station.style.borderColor = "red";
                  document.getElementById('m51').innerHTML = "Enter the Police Station";
                     f = 0;
                }
               
                if (pin_code.value == "") {
                  pin_code.style.borderColor = "red";
                  document.getElementById('m81').innerHTML = "Enter the Pin code ";
                     f = 0;
                }
                if (landmark.value == "") {
                  landmark.style.borderColor = "red";
                  document.getElementById('m91').innerHTML = "Enter the Landmark ";
                     f = 0;
                }
                 if (s_town.value == "") {
                  s_town.style.borderColor = "red";
                  document.getElementById('m61').innerHTML = "Select the Distric ";
                     f = 0;
                }
                if (s_state.value == "") {
                  s_state.style.borderColor = "red";
                  document.getElementById('m71').innerHTML = "Select the State ";
                     f = 0;
                }
                if(f==1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
        }
        function state1() {
    let s_state, s_town;
    s_state = document.getElementById('s_state1');
    s_town = document.getElementById('s_town1');
    if (s_state.value == "West Bengal") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='kolkata'>Kolkata</option>\n\
                            <option value='Asansol'>Asansol</option>\n\
                            <option value='North 24 Parganas'>North 24 Parganas</option>\n\
                            <option value='South 24 Parganas'>South 24 Parganas</option>\n\
                            <option value='Howrah'>Howrah</option>\n\
                            <option value='Hooghly'>Hooghly</option>\n\
                            <option value='Malda'>Malda</option>\n\
                            <option value='Paschim Medinipur'>Paschim Medinipur</option>\n\
                            <option value='Bankura'>Bankura</option>\n\
                            <option value='Purba Medinipur'>Purba Medinipur</option>";
    }
    if (s_state.value == "Bihar") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Patna'>Patna</option>\n\
                            <option value='Gaya'>Gaya</option>\n\
                            <option value='Bhagalpur'>Bhagalpur</option>\n\
                            <option value='Muzaffarpur'>Muzaffarpur</option>\n\
                            <option value='Purnia'>Purnia</option>\n\
                            <option value='Bhojpur'>Bhojpur</option>\n\
                            <option value='Jamalpur'>Jamalpur</option>\n\
                            <option value='Bagaha'>Bagaha</option>\n\
                            <option value='Siwan'>Siwan</option>";
    }
    if (s_state.value == "Gujarat") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Ahmedabad'>Ahmedabad</option>\n\
                            <option value='Surat'>Surat</option>\n\
                            <option value='Rajkot'>Rajkot</option>\n\
                            <option value='Bhavnagar'>Bhavnagar</option>\n\
                            <option value='Jamnagar'>Jamnagar</option>\n\
                            <option value='Vadodara'>Vadodara</option>\n\
                            <option value='Nadiad'>Nadiad</option>\n\
                            <option value='Gandhidham'>Gandhidham</option>\n\
                            <option value='Porbandar'>Porbandar</option>";
    }
    if (s_state.value == "Himachal Pradesh") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Shimla'>Shimla</option>\n\
                            <option value='Solan'>Solan</option>\n\
                            <option value='Dharamsala'>Dharamsala</option>\n\
                            <option value='Baddi'>Baddi</option>\n\
                            <option value='Nahan'>Nahan</option>\n\
                            <option value='Mandi'>Mandi</option>\n\
                            <option value='Paonta Sahib'>Paonta Sahib</option>\n\
                            <option value='Sundarnagar'>Sundarnagar</option>\n\
                            <option value='Chamba'>Chamba</option>";
    }
    if (s_state.value == "Maharashtra") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Mumbai'>Mumbai</option>\n\
                            <option value='Pune'>Pune</option>\n\
                            <option value='Nagpur'>Nagpur</option>\n\
                            <option value='Nashik'>Nashik</option>\n\
                            <option value='Aurangabad'>Aurangabad</option>\n\
                            <option value='Jalgaon'>Jalgaon</option>\n\
                            <option value='Gondia'>Gondia</option>\n\
                            <option value='Sangli'>Sangli</option>\n\
                            <option value='Jalna'>Jalna</option>";
    }
    if (s_state.value == "Odisha") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Bhubaneswar'>Bhubaneswar</option>\n\
                            <option value='Cuttack'>Cuttack</option>\n\
                            <option value='Rourkela'>Rourkela</option>\n\
                            <option value='Brahmapur'>Brahmapur</option>\n\
                            <option value='Puri'>Puri</option>\n\
                            <option value='Baripada'>Baripada</option>\n\
                            <option value='Jeypore'>Jeypore</option>\n\
                            <option value='Bargarh'>Bargarh</option>\n\
                            <option value='Rayagada'>Rayagada</option>";
    }
    if (s_state.value == "Tamil Nadu") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                            <option value='Chennai'>Chennai</option>\n\
                            <option value='Coimbatore'>Coimbatore</option>\n\
                            <option value='Madurai'>Madurai</option>\n\
                            <option value='Tiruchirappalli'>Tiruchirappalli</option>\n\
                            <option value='Tiruppur'>Tiruppur</option>\n\
                            <option value='Salem'>Salem</option>\n\
                            <option value='Erode'>Erode</option>\n\
                            <option value='Vellore'>Vellore</option>\n\
                            <option value='Dindigul'>Dindigul</option>";

    }
    if (s_state.value == "Uttarakhand") {
        s_town.innerHTML = "<option value=''>Select your Town *</option>\n\
                           <option value='Dehradun'>Dehradun</option>\n\
                            <option value='Haridwar'>Haridwar</option>\n\
                            <option value='Rudrapur'>Rudrapur</option>\n\
                            <option value='Roorkee'>Roorkee</option>\n\
                            <option value='Kashipur'>Kashipur</option>\n\
                            <option value='Rishikesh'>Rishikesh</option>\n\
                            <option value='Haldwani'>Haldwani</option>";
    }


}