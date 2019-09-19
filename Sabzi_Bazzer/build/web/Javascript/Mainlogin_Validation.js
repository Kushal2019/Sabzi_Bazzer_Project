//************************************ Login Validation Function Start ***********************************

function Login_Validation() {

    let Login_username, Login_password;
    Login_username = document.getElementById('Login_username');
    Login_password = document.getElementById('Login_password');

    if (Login_username.value === "") {
        Login_username.style.borderColor = "red";
        document.getElementById('v1').innerHTML = "Enter username";
        Login_username.focus();
        return false;
    }
    else {
        Login_username.style.borderColor = "green";
        document.getElementById('v1').innerHTML = "";
    }
    if (Login_password.value === "") {
        Login_password.style.borderColor = "red";
        document.getElementById('v2').innerHTML = "Enter password";
        Login_password.focus();
        return false;
    }
    else{
        Login_password.style.borderColor = "green";
        document.getElementById('v2').innerHTML = "";
    }
}