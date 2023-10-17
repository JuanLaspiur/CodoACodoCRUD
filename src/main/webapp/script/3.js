// Variables
let categoriaSeleccionada = document.getElementById("categoria").value;
let cantidadDePersonas = document.getElementById("cantidadPersonas").value;


//Eventos
//onchange="seleccionar()"--> en el HTMl


//Funciones
function seleccionar(){
let categoriaSeleccionada = document.getElementById("categoria").value;
let caja1 = document.getElementById("c1");
let caja2 = document.getElementById("c2");
let caja3 = document.getElementById("c3");


function cajaSeleccionada(cajaSeleccion, cajaDeseleccion1, cajaDeseleccion2){
    cajaSeleccion.classList.add("cajaSeleccionada");

    cajaDeseleccion1.classList.remove("cajaSeleccionada");
    cajaDeseleccion2.classList.remove("cajaSeleccionada");
}


switch(categoriaSeleccionada){
  case '1': 
    cajaSeleccionada(caja1,caja2,caja3);
    break;
  case '2':
    cajaSeleccionada(caja2,caja1,caja3);
    break;
  case '3':
    cajaSeleccionada(caja3,caja2,caja1);    
    break;
  case '4':
    caja1.classList.remove("cajaSeleccionada");
    caja2.classList.remove("cajaSeleccionada");
    caja3.classList.remove("cajaSeleccionada");
    break;        


}

}

function obtenerValor() {
    var cantidad = document.getElementById("cantidad").value;
    let categoriaSeleccionada = document.getElementById("categoria").value;
    let precioTotal;

    switch (categoriaSeleccionada) {
        case '1':
            precioTotal = 300 - (300 * 0.5);
            break;
        case '2':
            precioTotal = 300 - (300 * 0.3);
            break;
        case '3':
            precioTotal = 300 - (300 * 0.15);
            break;
        case '4':
            precioTotal = 300;
            break;
    }

    var totalPagar = cantidad * precioTotal;
    document.getElementById("spanTotalPagar").textContent = totalPagar.toFixed(2);
  
  }


  function borrar() {
    document.getElementById("spanTotalPagar").textContent = "";
    document.getElementById("cantidad").value = "";
    document.getElementById("categoria").value = 0; // Restablecer la categoría a Estudiante
  }