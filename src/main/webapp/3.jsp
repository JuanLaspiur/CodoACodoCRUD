<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="estilos/3.css">
</head>
<body>
    
  <c:import url="WEB-INF/partesComunes/header.jsp" />   

  
  
  <main>
    <div class="conteiner_tituloComprar">
        <h1>Compra tu tiquet</h1>
        <p>Si sos estudiante del sector IT aprovecha las promociones..</p>
        <p>Valor de tiquet sin descuento: $300</p>
        
      </div>


    <div class="conteiner_promociones">
        <div class="cajita cAzul" id="c1"><p>Descuento Estudiante 50%</p></div>
        <div class="cajita cVerde" id="c2"><p>Descuento Trainee 30%</p></div>
        <div class="cajita cAmarillo"  id="c3"><p>Descuento Junior 15%</p></div>
    </div>
  
    <div class="conteiner_imputs-comprarTiquet">

        <div class="inputs_NyA">
            <input type="text" class="name" placeholder="Nombre" id="nom"> 
            <input type="text" class="apellido" placeholder="Apellido" id="apell">
        </div>

        <div class="input_correo">
            <input type="email" class="correo" placeholder="Correo" id="correo">
       </div>

        <div class="categoria_texto">
          <p id="Canti">Cantidad</p>
          <p id="Cate">Categoria</p>
         </div>

         <div class="inputs_categoria-texto">
            <input type="number" placeholder="Cantidad" id="cantidad" max="50" min="0">
            <select name="transporte" id="categoria" onchange="seleccionar()">
              <option value="0" selected>Selecciona una categoria</option>
              <option value="1">Estudiante</option>
              <option value="2">Trainee</option>
              <option value="3">Junior</option>
              <option value="4">Sin descuento</option>
            </select>
            
          </div>

          <div class="caja__valorTotal">
            <p>Total a pagar: $<span id="spanTotalPagar"></span></p>
          </div> 

          <div class="conteiner__botones_dos">
            <button onclick="borrar()">Borrar</button>
            <button onclick="obtenerValor()" ondblclick="borrar()">Resumen</button>
          </div>
 

    </div>



  </main>



  <c:import url="WEB-INF/partesComunes/footer.jsp" /> 
  <script src="script/script.js"></script>
  <script src="script/3.js"></script>
    
</body>
</html>