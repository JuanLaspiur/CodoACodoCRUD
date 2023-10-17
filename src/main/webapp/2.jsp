<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilos/style.css">
    <link rel="stylesheet" href="estilos/2.css">
    <title>Document</title>
</head>
<body>
  <c:import url="WEB-INF/partesComunes/header.jsp" />

<main>

    <div class="conteiner_listaOradores">
      <h1>Lista de Oradores</h1>
      <p>A continuaci�n los oradores que participaran del proximo encuentro</p>
    </div>


    <table>
      <thead>  
        <tr>
           <th>Nombre</th>
           <th>Correo Electronico</th>
            <th></th> 
           <th></th> 

        </tr>
      </thead>
      <tbody>
        <!-- Filas de datos -->
        
       <c:forEach items="${listaUsuarios}" var="usuario"> 
        <tr>
          <td>${usuario.getNombre()} ${usuario.getApellido()} </td>
          <td class="ocultarRes">${usuario.getCorreo()}</td>
          <td>
            <a href="${pageContext.request.contextPath}/NewServlet?accion=menuEditar&id=${usuario.getId()}" ><img src="img/imagenesPequeñas/editLapiz.png" alt="lapiz" width=25px class="iconoTabla"></a> 
          </td>
          <td>
           <a href="#" onclick="eliminarPersona(${usuario.getId()})" > <img src="img/imagenesPequeñas/tachoBasuraRojo2.png" alt="tacho basura" width="25px" class="iconoTabla"></a> 
        </td>
        </tr>  
        </c:forEach>
        
      </tbody> 

    </table>        
  
    <script>
    function eliminarPersona(id) {

        if (confirm('�Seguro de que quieres eliminar esta persona?')) {
            var xhr = new XMLHttpRequest();
               
            xhr.open('DELETE', '${pageContext.request.contextPath}/NewServlet?id=' + id, true);
              
            xhr.onload = function() {
               if (xhr.status === 200) {
            console.log('Respuesta del servidor: ' + xhr.responseText);
            alert('Persona eliminada exitosamente');
            window.location.reload();
        } else {
            alert('Error al eliminar persona');
        }
            };

            xhr.send();
        }
    }

    
    
    
    </script>


    
</main>
<c:import url="WEB-INF/partesComunes/footer.jsp" /> 
 
<script src="script/script.js"></script>
</body>

</html>