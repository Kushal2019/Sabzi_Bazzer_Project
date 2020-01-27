//************************************ Login Validation Function Start ***********************************

function Login_Validation() {

    let Login_username, Login_password, customControlInline, f = 0;
    Login_username = document.getElementById('Login_username');
    Login_password = document.getElementById('Login_password');
    customControlInline = document.getElementById('customControlInline');
    if (Login_username.value == "") {
        alert("Enter the Username");
        Login_username.style.borderColor = "red";
        Login_username.focus();
        f = 1;
    } else {
        Login_username.style.borderColor = "green";
        if (Login_password.value == "") {
            alert("Enter the Password");
            Login_password.style.borderColor = "red";
            Login_password.focus();
            f = 1;
        }
        else {
            Login_password.style.borderColor = "green";
            if (customControlInline.checked == false) {
                alert('You must agree Terms & Conditions');
                customControlInline.focus();
                f = 1;
            }
        }
    }
    if (f == 0) {
        return true;
    }
    else {
        return false;
    }
}