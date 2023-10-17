package baseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Orador;


public class OradorDate {
    //atributos
    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    //metodos
    
    public static void subirOrador(Orador orador){
      sql ="INSERT INTO oradores (nombre, apellido, mail, temaOratoria, estado) VALUES(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getMail());
            ps.setString(4, orador.getTemaOratoria());
            ps.setInt(5,1);
            
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs.next()){
             int id = rs.getInt(1);   
             orador.setId(id);
                System.out.println("Orador agregado con exito con id:"+id);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la Clase OradorData, metodo subirOrador  ");
        }
      
    
    
    }
    
    public static void actualizarOrador(Orador orador){
      sql = "UPDATE oradores SET nombre = ?, apellido = ?, mail =?, temaOratoria= ?, estado = ? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getMail());
            ps.setString(4, orador.getTemaOratoria());
            ps.setInt(5, orador.getEstado());
            
            ps.setInt(6, orador.getId());
            
            int row = ps.executeUpdate();
            if(row>0){
                System.out.println("Orador actualizado con exito");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la clase OradorDate clase actualizarOrador "+ex.getMessage());
        }
    
    
    }
    
    
    public static void bajarOrador(int idOrador){
      sql = "UPDATE oradores SET estado = 0 WHERE id = ?";
      try{
        ps = con.prepareStatement(sql);
        ps.setInt(1, idOrador);
      
        ps.executeUpdate();  
      }catch(SQLException ex){
          System.out.println("Error en la clase OradorDate metodo bajarOrador() "+ex.getMessage());
      }
    }
    
    public static ArrayList<Orador> listaOradores(){
     ArrayList<Orador> lista = new  ArrayList<>(); 
     sql = "SELECT * FROM oradores";
     try{
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
     
     while(rs.next()){
       Orador orador = new Orador();
       orador.setId(rs.getInt(1));
       orador.setNombre(rs.getString(2));
       orador.setApellido(rs.getString(3));
       orador.setMail(rs.getString(4));
       orador.setTemaOratoria(rs.getString(5));
       orador.setEstado(rs.getInt(6));
       
       lista.add(orador);
     }
     
     }catch(SQLException ex){
         System.out.println("Error en la clase OradorDate metodo lista de oradores");   
     }
     return lista;
    }
    
     public static ArrayList<Orador> listaOradoresActivos(){
     ArrayList<Orador> lista = new  ArrayList<>(); 
     sql = "SELECT * FROM oradores WHERE estado =1";
     try{
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
     
     while(rs.next()){
       Orador orador = new Orador();
       orador.setId(rs.getInt(1));
       orador.setNombre(rs.getString(2));
       orador.setApellido(rs.getString(3));
       orador.setMail(rs.getString(4));
       orador.setTemaOratoria(rs.getString(5));
       orador.setEstado(rs.getInt(6));
       
       lista.add(orador);
     }
     
     }catch(SQLException ex){
         System.out.println("Error en la clase OradorDate metodo lista de oradores activos");   
     }
     return lista;
    }
     
    
     public static ArrayList<Orador> listaOradoresBajos(){
     ArrayList<Orador> lista = new  ArrayList<>(); 
     sql = "SELECT * FROM oradores WHERE estado =0";
     try{
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
     
     while(rs.next()){
       Orador orador = new Orador();
       orador.setId(rs.getInt(1));
       orador.setNombre(rs.getString(2));
       orador.setApellido(rs.getString(3));
       orador.setMail(rs.getString(4));
       orador.setTemaOratoria(rs.getString(5));
       orador.setEstado(rs.getInt(6));
       
       lista.add(orador);
     }
     
     }catch(SQLException ex){
         System.out.println("Error en la clase OradorDate metodo lista de oradores bajos");   
     }
     return lista;
    } 
     
     
     
     
    
    
    
}
