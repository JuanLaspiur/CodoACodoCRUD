package baseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;
public class UsuarioData {
       //atributos
    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;
        //metodos
     public static void subirUsuario(Usuario usuario){
      sql ="INSERT INTO usuarios (nombre, apellido, correo, contrasenia, estado) VALUES(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getContrasenia());
            ps.setInt(5,1);
            
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs.next()){
             int id = rs.getInt(1);   
             usuario.setId(id);
                System.out.println("Usuario agregado con exito con id:"+id);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la Clase UsuarioData, metodo subirUsuario  ");
        }
      
    
    
    }
    
     public static Usuario obtenerUsuarioXid(int id) {
    	 Usuario usuario= new Usuario();
    	sql="SELECT * FROM usuarios WHERE ID=?";
    	try {
    	ps = con.prepareStatement(sql);
    	ps.setInt(1,id);
    	rs = ps.executeQuery();
    	if(rs.next()){
    		usuario.setId(rs.getInt(1));
    		usuario.setNombre(rs.getString(2));    
    		usuario.setApellido(rs.getString(3));
    		usuario.setCorreo(rs.getString(4));
    		usuario.setContrasenia(rs.getString(5));
    		usuario.setEstado(rs.getInt(6));    		
    	}
    	
    	}catch(SQLException ex){
    		System.out.println("Error CLASE: UsuarioData ");
    		System.out.println("METODO: obtenerUsuarioXid");
    	}
    	
    	 
    	return usuario; 
     }

     public static void actualizarUsuario(Usuario usuario){
         
      sql = "UPDATE usuarios SET nombre =?, apellido =?, correo =?, contrasenia= ?, estado=1 WHERE ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getContrasenia());
        
            
            ps.setInt(5, usuario.getId());
            
            int row = ps.executeUpdate();
            if(row>0){
                System.out.println("Usuario actualizado con exito");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la clase UsuarioData clase actualizarUsuario "+ex.getMessage());
        }
    
    
    }

         
     
     
     public static void bajarUsuario(int idUsuario){
      sql = "UPDATE usuarios SET estado = 0 WHERE id = ?";
      try{
        ps = con.prepareStatement(sql);
        ps.setInt(1, idUsuario);
      
        ps.executeUpdate();  
      }catch(SQLException ex){
          System.out.println("Error en la clase UsuariosData metodo bajarUsuario() "+ex.getMessage());
      }
    }
 
 public static ArrayList<Usuario> listaUsuarios(){
     ArrayList<Usuario> lista = new  ArrayList<>(); 
     sql = "SELECT * FROM usuarios";
     try{
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
     
     while(rs.next()){
       Usuario usuario = new Usuario();
       usuario.setId(rs.getInt(1));
       usuario.setNombre(rs.getString(2));
       usuario.setApellido(rs.getString(3));
       usuario.setCorreo(rs.getString(4));
       usuario.setContrasenia(rs.getString(5));
       usuario.setEstado(rs.getInt(6));
       
       lista.add(usuario);
     }
     
     }catch(SQLException ex){
         System.out.println("Error en la clase UsuarioData metodo lista de usuarios");   
     }
     return lista;
    }

   public static ArrayList<Usuario> listaUsuariosActivos(){
     ArrayList<Usuario> lista = new  ArrayList<>(); 
     sql = "SELECT * FROM usuarios WHERE estado =1";
     try{
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
     
     while(rs.next()){
       Usuario usuario = new Usuario();
       usuario.setId(rs.getInt(1));
       usuario.setNombre(rs.getString(2));
       usuario.setApellido(rs.getString(3));
       usuario.setCorreo(rs.getString(4));
       usuario.setContrasenia(rs.getString(5));
       usuario.setEstado(rs.getInt(6));
       
       lista.add(usuario);
     }
     
     }catch(SQLException ex){
         System.out.println("Error en la clase UsuarioDate metodo lista de usuarios activos");   
     }
     return lista;
    }

        public static ArrayList<Usuario> listaUsuariosBajos(){
     ArrayList<Usuario> lista = new  ArrayList<>(); 
     sql = "SELECT * FROM usuarios WHERE estado =0";
     try{
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
     
     while(rs.next()){
       Usuario usuario = new Usuario();
       usuario.setId(rs.getInt(1));
       usuario.setNombre(rs.getString(2));
       usuario.setApellido(rs.getString(3));
       usuario.setCorreo(rs.getString(4));
       usuario.setContrasenia(rs.getString(5));
       usuario.setEstado(rs.getInt(6));
       
       lista.add(usuario);
     }
     
     }catch(SQLException ex){
         System.out.println("Error en la clase UsuarioDate metodo lista de usuarios bajos");   
     }
     return lista;
    } 





}
