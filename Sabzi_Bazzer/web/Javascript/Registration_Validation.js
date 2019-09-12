//************************************ User Validation Function Start ***********************************
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
        u_email.style.borderColor = "green";
        document.getElementById('e5').innerHTML = "";
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


//************************* Seller Vallidation Start********************************************

    //dropdown menu validation start
function state()
{
    let s_state,s_town;
     s_state=document.getElementById('s_state');
     s_town=document.getElementById('s_town');
     if(s_state.value=="West Bengal")
     {
         s_town.innerHTML="<option value='kolkata'>Kolkata</option>\n\
                            <option value='Asansol'>Asansol</option>\n\
                            <option value='North 24 Parganas'>North 24 Parganas</option>\n\
                            <option value='South 24 Parganas'>South 24 Parganas</option>\n\
                            <option value='Howrah'>Howrah</option>\n\
                            <option value='Hooghly'>Hooghly</option>\n\
                            <option value='Malda'>Malda</option>\n\
                            <option value='Paschim Medinipur'>Paschim Medinipur</option>\n\
                            <option value='Purba Medinipur'>Purba Medinipur</option>";
     }
     if(s_state.value=="Bihar")
     {
         s_town.innerHTML="<option value='Patna'>Patna</option>\n\
                            <option value='Gaya'>Gaya</option>\n\
                            <option value='Bhagalpur'>Bhagalpur</option>\n\
                            <option value='Muzaffarpur'>Muzaffarpur</option>\n\
                            <option value='Purnia'>Purnia</option>\n\
                            <option value='Bhojpur'>Bhojpur</option>\n\
                            <option value='Jamalpur'>Jamalpur</option>\n\
                            <option value='Bagaha'>Bagaha</option>\n\
                            <option value='Siwan'>Siwan</option>";
     }
     if(s_state.value=="Gujarat")
     {
         s_town.innerHTML="<option value='Ahmedabad'>Ahmedabad</option>\n\
                            <option value='Surat'>Surat</option>\n\
                            <option value='Rajkot'>Rajkot</option>\n\
                            <option value='Bhavnagar'>Bhavnagar</option>\n\
                            <option value='Jamnagar'>Jamnagar</option>\n\
                            <option value='Vadodara'>Vadodara</option>\n\
                            <option value='Nadiad'>Nadiad</option>\n\
                            <option value='Gandhidham'>Gandhidham</option>\n\
                            <option value='Porbandar'>Porbandar</option>";
     }
     if(s_state.value=="Himachal Pradesh")
     {
         s_town.innerHTML="<option value='Shimla'>Shimla</option>\n\
                            <option value='Solan'>Solan</option>\n\
                            <option value='Dharamsala'>Dharamsala</option>\n\
                            <option value='Baddi'>Baddi</option>\n\
                            <option value='Nahan'>Nahan</option>\n\
                            <option value='Mandi'>Mandi</option>\n\
                            <option value='Paonta Sahib'>Paonta Sahib</option>\n\
                            <option value='Sundarnagar'>Sundarnagar</option>\n\
                            <option value='Chamba'>Chamba</option>";
     }
     if(s_state.value=="Maharashtra")
     {
         s_town.innerHTML="<option value='Mumbai'>Mumbai</option>\n\
                            <option value='Pune'>Pune</option>\n\
                            <option value='Nagpur'>Nagpur</option>\n\
                            <option value='Nashik'>Nashik</option>\n\
                            <option value='Aurangabad'>Aurangabad</option>\n\
                            <option value='Jalgaon'>Jalgaon</option>\n\
                            <option value='Gondia'>Gondia</option>\n\
                            <option value='Sangli'>Sangli</option>\n\
                            <option value='Jalna'>Jalna</option>";
     }
     if(s_state.value=="Odisha")
     {
         s_town.innerHTML="<option value='Bhubaneswar'>Bhubaneswar</option>\n\
                            <option value='Cuttack'>Cuttack</option>\n\
                            <option value='Rourkela'>Rourkela</option>\n\
                            <option value='Brahmapur'>Brahmapur</option>\n\
                            <option value='Puri'>Puri</option>\n\
                            <option value='Baripada'>Baripada</option>\n\
                            <option value='Jeypore'>Jeypore</option>\n\
                            <option value='Bargarh'>Bargarh</option>\n\
                            <option value='Rayagada'>Rayagada</option>";
     }
     if(s_state.value=="Tamil Nadu")
     {
         s_town.innerHTML="<option value='Chennai'>Chennai</option>\n\
                            <option value='Coimbatore'>Coimbatore</option>\n\
                            <option value='Madurai'>Madurai</option>\n\
                            <option value='Tiruchirappalli'>Tiruchirappalli</option>\n\
                            <option value='Tiruppur'>Tiruppur</option>\n\
                            <option value='Salem'>Salem</option>\n\
                            <option value='Erode'>Erode</option>\n\
                            <option value='Vellore'>Vellore</option>\n\
                            <option value='Dindigul'>Dindigul</option>";
     }
}