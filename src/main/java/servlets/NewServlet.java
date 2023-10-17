package servlets;

import baseDatos.UsuarioData;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import modelo.Usuario;

@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        accion = (accion == null) ? "" : accion;

        switch (accion) {
            case "eliminar":
                doDelete(request, response);
                request.getRequestDispatcher("/menuEditar.jsp").forward(request, response);
                break;

            case "menuEditar":
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("usuario", UsuarioData.obtenerUsuarioXid(id));
                request.getRequestDispatcher("/menuEditar.jsp").forward(request, response);
                break;

            default:
                request.setAttribute("listaUsuarios", UsuarioData.listaUsuariosActivos());
                request.getRequestDispatcher("/2.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        accion = (accion == null) ? "" : accion;

        switch (accion) {

            case "editar":
                int id2 = Integer.parseInt(request.getParameter("id"));
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String correo = request.getParameter("correo");

                UsuarioData.actualizarUsuario(new Usuario(id2, nombre, apellido, correo, "", 1));
                request.setAttribute("listaUsuarios", UsuarioData.listaUsuariosActivos());
                request.getRequestDispatcher("/2.jsp").forward(request, response);
                break;

            default:

                String nombre1 = request.getParameter("nombre");
                String apellido1 = request.getParameter("apellido");
                String correo1 = request.getParameter("mail");

                Usuario usuario = new Usuario();
                usuario.setNombre(nombre1);
                usuario.setApellido(apellido1);
                usuario.setCorreo(correo1);
                usuario.setContrasenia("");
                usuario.setEstado(1);

                subirUsuario(usuario);
                doGet(request, response);
        }

    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        UsuarioData.bajarUsuario(id);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    public void subirUsuario(Usuario usuario) {
        UsuarioData.subirUsuario(usuario);
        System.out.println("Entro");
    }

}
