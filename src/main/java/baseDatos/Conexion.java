
package baseDatos;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/codo";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion () {}
    
    public static Connection getConexion() {
        if (connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "*Error*: hubo un error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "*Error*: hubo un error de conectarse a la base de datos");
            }
        }
        return connection;
    }
}
