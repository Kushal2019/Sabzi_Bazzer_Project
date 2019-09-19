//************************************ Login Validation Function Start ***********************************

function Login_Validation() {

    let Login_username, Login_password, f = 0;
    Login_username = document.getElementById('Login_username');
    Login_password = document.getElementById('Login_password');

    if (Login_username.value === "") {
        Login_username.style.borderColor = "red";
        document.getElementById('v1').innerHTML = "Enter username";
        Login_username.focus();
        f = 1;
    }
    else {
        Login_password.style.borderColor = "green";
        document.getElementById('v2').innerHTML = "";
    }
    if (Login_password.value === "") {
        Login_password.style.borderColor = "red";
        document.getElementById('v2').innerHTML = "Enter password";
        Login_password.focus();
        f = 1;
    }
    else{
        Login_username.style.borderColor = "green";
        document.getElementById('v1').innerHTML = "";
    }
    if (f === 0) {
        return true;
    }
    else {
        return false;
    }
}