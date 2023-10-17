let clickMenu = document.getElementById("clickMenu");
let centinela =true; 

clickMenu.addEventListener("click", mostrarMenu);

function mostrarMenu(){
let menuDeplegable = document.getElementById("menuDeplegable");
  if(centinela){
    menuDeplegable.classList.add("mostrarMenu");
    centinela=false;
  }else{
    menuDeplegable.classList.remove("mostrarMenu");
    centinela=true;
  }
}

let btn = document.getElementById("boton1");
btn.addEventListener("click", scr);

function scr() {
  window.location.href ='index.jsp#miDiv';

}


