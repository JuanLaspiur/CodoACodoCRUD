<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilos/style.css">
    <link rel="stylesheet" href="estilos/menuEditar.css">
    <title>Document</title>
</head>
<body>
    <c:import url="WEB-INF/partesComunes/header.jsp" />



    <div class="fondo">
   
        <div class="conteiner-form-editar">
   <form id="myForm" method="POST" action="${pageContext.request.contextPath}/NewServlet?accion=editar&id=${usuario.getId()}">
      <div class="editarNombreApellido">
        <input type="text" value="${usuario.getNombre()}" name="nombre">
        <input type="text" value="${usuario.getApellido()}" name="apellido">
      </div>
      <div class="editarMail">
        <input type="text" value="${usuario.getCorreo()}" name="correo">
      </div>
      <button type="submit" name="accion" value="guardarCambios">Guardar Cambios y salir</button>
    </form>

<form id="deleteForm" >
    <button id="eliminar" onclick="eliminarPersona(${usuario.getId()})">Eliminar Orador</button>
</form>

        </div>
    </div> 

    <c:import url="WEB-INF/partesComunes/footer.jsp" /> 


<script>
    function eliminarPersona(id) {

        if (confirm('¿Estas seguro de que quieres eliminar esta persona?')) {
            var xhr = new XMLHttpRequest();
               
            xhr.open('GET', '${pageContext.request.contextPath}/NewServlet?accion=eliminar&id=' + id, true);
              
            xhr.onload = function() {
                 if (xhr.status === 200) {
                   alert('Persona eliminada exitosamente');             
                 } else {
                   alert('Error al eliminar persona');
                 }
            };

           xhr.send();
        }
    }

</script>

    
</body>
</html>