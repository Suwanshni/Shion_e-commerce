let pass = document.getElementById("pwd");
let check = document.getElementById("check");


check.onclick = showPassword;

    function showPassword(){
        if(check.checked){
            pass.type="text";
        }else{
                pass.type="password";
            }
    }