

document.getElementById("btn__registrese").addEventListener("click",register);
document.getElementById("btn__iniciar-secion").addEventListener("click",iniciarSecion);;
window.addEventListener("resize", anchoPage);
//Declarando Variables
let contenedor_login_registrer = document.querySelector(".contenedor__login-registrer");
let formulario_login = document.querySelector(".formulario__login"); 
let formulario__registrer = document.querySelector(".formulario__registrer"); 

let caja_trasera_login = document.querySelector(".caja__trasera-login"); 
let  caja_trasera_registrer = document.querySelector(".caja__trasera-registrer"); 


function anchoPage(){
    if(window.innerWidth > 850){
        caja_trasera_login.style.display ="block";
        caja_trasera_registrer.style.display = "block";

    }else{
        caja_trasera_registrer.style.display ="block";
        caja_trasera_registrer.style.opacity = "1";
        caja_trasera_login.style.display = none;   
        formulario_login.style.display = "block";
        formulario__registrer.style.display = none;
        contenedor_login_registrer.style.left = "0px";

    }


}









function iniciarSecion(){

    if(window.innerWidth > 850){

    formulario__registrer.style.display = "none";
    contenedor_login_registrer.style.left = "10px";
    formulario_login.style.display = "block";
    caja_trasera_registrer.style.opacity = "1";
    caja_trasera_login.style.opacity ="0";
    }else {
    formulario__registrer.style.display = "none";
    contenedor_login_registrer.style.left = "0px";
    formulario_login.style.display = "block";
    caja_trasera_registrer.style.display = "block";
    caja_trasera_login.style.display ="none";    


    }  
    
    

}


function register(){
    if(window.innerWidth > 850){
    formulario__registrer.style.display = "block";
    contenedor_login_registrer.style.left = "410px";
    formulario_login.style.display = "none";
    caja_trasera_registrer.style.opacity = "0";
    caja_trasera_login.style.opacity ="1";
    } else {
    formulario__registrer.style.display = "block";
    contenedor_login_registrer.style.left = "0px";
    formulario_login.style.display = "none";
    caja_trasera_registrer.style.display = "none";
    caja_trasera_login.style.display ="block";
    caja_trasera_login.style.opacity ="1";

    }


}

