//************************************ Login Validation Function Start ***********************************

function Login_Validation() {

    let Login_username, Login_password, f = 0;
    Login_username = document.getElementById('Login_username');
    Login_password = document.getElementById('Login_password');

    if (Login_username.value == "") {
        Login_username.style.borderColor = "red";
        document.getElementById('Login_password_Error').innerHTML = "Please fill the fild-1";
        Login_username.focus();
        f = 1;
    }
    else (Login_password.value == "") {
        Login_password.style.borderColor = "red";
        document.getElementById('Login_password').innerHTML = "Please fill the fild-2";
        Login_password.focus();
        f = 1;
    }
    if(f=0){
        return true;
    }
    else{
        return false;
    }
}