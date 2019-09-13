//************************************ Login Validation Function Start ***********************************

function Login_Validation() {

    var Login_username, Login_password;
    Login_username = document.getElementById('Login_username');
    Login_password = document.getElementById('Login_password');

    if (Login_username.value == "") {
        Login_username.style.borderColor = "blue";
        document.getElementById('Login_password_Error').innerHTML = "Please fill the fild";
        Login_username.focus();
        return false;
    }

    else if (Login_password.value == "") {
        Login_password.style.borderColor = "blue";
        document.getElementById('Login_password').innerHTML = "Please fill the fild";
        Login_password.focus();
        return false;
    }
    return true;
}