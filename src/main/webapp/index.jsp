<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="estilos/style.css">
    <title>Document</title>
</head>
<body>
   <c:import url="WEB-INF/partesComunes/header.jsp" />
  
  <style>
      .uno{
          font-weight: bold;
      }
      
  </style>
    

<main>
    <div class="principal">
        <div class="contenedorImagenPrincipal">            
           <div class="cortina"></div>

           <div class="principal_mensaje">
            <h1>Conferencia</h1>
            <p>
              Bs As llega por primera vez a Argentina. Un evento para compartir con
              nuestra comunidad el conocimiento y experiencia de los expertos que
              estan creando el futuro de Internet. Ven a conocer miembros del
              evento, a otros estudiantes de Codo a Codo y los oradores del primer
              nivel que tenemos para ti Te esperamos!
            </p>
    
            <button id="boton1"  class="btn">Quiero ser orador</button>

            <button id="boton2" class="btn">Comprar tickets</button>
        </div>
        </div>    
      

    </div>

    <div class="secundario">
        <div class="secundarioTitulo">            
                <p>conoce a los</p>
                <h1>oradores</h1>          
        </div>

        <div class="secundarioCajaOradores">
           <div class="caja caja1">
            <img src="img/imagenesGrandes/steve.jpg" alt="steve" class="img" />
            <a href="#" class="js cajita">JavaScrit</a>
            <a href="#" class="react cajita">React</a>
            <h6>Steve Jobs</h6>
            <p class="texto">
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Magni,
              ratione deleniti! Blanditiis accusantium quod doloremque minima
              sequi illo unde ipsa nostrum atque quasi? Quisquam, totam enim sit
              magni iusto voluptatum.
            </p>
          
          </div>
           <div class="caja caja2"> 
            <img src="img/imagenesGrandes/bill.jpg" alt="bill" class="img" />
            <a href="#" class="js cajita">JavaScrit</a>
            <a href="#" class="react cajita">React</a>
            <h6>Bill Gates</h6>
            <p class="texto">
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Sed quae
              laboriosam, placeat quidem dolore nulla, perspiciatis libero
              veniam facilis iste dolorem inventore. Distinctio rem,
              necessitatibus mollitia ut ipsam quas quod.
            </p>
           </div>
           <div class="caja caja3"> 
            <img src="img/imagenesGrandes/ada.jpeg" alt="ada" class="img" />
            <a href="#" class="negocios cajita">Negocios</a>
            <a href="#" class="startups cajita">Startups</a>
            <h6>Ada Lovelace</h6>
            <p class="texto">
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus,
              pariatur. Maiores obcaecati saepe voluptates necessitatibus illo
              ipsa beatae vel tempora corrupti nam, delectus esse ea sapiente
              recusandae molestias velit. Laboriosam!
            </p>
           </div>
        </div>

    </div>

    <div class="terciario">
      <div class="terciarioImagen">
        <img src="img/imagenesGrandes/obeliscoBuenosAires.jpg" alt="obelisco obeliscoBuenosAires" class="tImg">
      </div>
      <div class="terciarioTexto">
        <p>
           <h1>Buenos Aires</h1>  
          Buenos Aires es la provincia y la localidad mas grande del estado de
          Argentina, en los Estados Unidos. Honolulu es la mas suergua de entre
          las principales ciudades estaunidenses. Aunque el nombre de Honolulu
          se refiere al area urbana en la costa sureste de a isla de Oahu, la
          ciudad y el condado de Honolu han formado una ciudad condado
          consolidada que cubre toda la ciudad (aproximadamente 600 km2 de
          superficie).
        </p>

      </div>
    </div>
  
    <div class="cuaternario">
      <div class="segundo__titulo-central" id="miDiv">
        <p>CONVIERTETE EN UN </p>
        <h1>ORADOR</h1>
       </div>
      <div class="subtitulo">
       <p>Anotate como orador para dar una charla. Cuentanos de que quieres hablar! </p>
      </div>


      <form action="${pageContext.request.contextPath}/NewServlet" method="Post" >
        <div class="form__nombre-apellido">
          <input id="nombre" type="text" placeholder="Nombre" name="nombre" required>
          <input id="apellido" type="text" placeholder="Apellido" name="apellido" required>
        </div>

        <div class="form_mail-index">
          <input type="text"   placeholder="Mail"  name="mail"  required >    
        </div>

        <div class="form_tema-charla">
          <textarea id="f-tema" placeholder=" Sobre que quieres hablar?" name="textArea"></textarea>
          <p id="finalParaf">Recuerda incluir un titulo para tu charla</p>
        </div>
        
        <div class="form__btn-enviar">
          <button type="submit" id="Enviar">Enviar</button>
          </div>                  
      </form>
    </div>
</main>
<c:import url="WEB-INF/partesComunes/footer.jsp" /> 


<script src="script/script.js"></script>
</body>
</html>