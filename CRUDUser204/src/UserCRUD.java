import java.sql.Connection;
import java.sql.PreparedStatement; //Sentencia preparada
import java.sql.SQLException;
import java.sql.ResultSet;

   
public class UserCRUD { 
    private Connection conexion;
    
    public UserCRUD(){ //Constructor de la clase donde se conecta a la BD 
       conexion=ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre, String correo, String contra){
        
        String insertSQL="INSERT INTO usuarios(nombre, correo, contrasena) VALUES (?,?,?)";
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra); //En Java está como "contra" y en la BD está "contrasena"
            return ps.executeUpdate()>0;
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al crear al usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
    
    }//Fin del INSERT
    
    //Método para Consultar por id
    
    public ResultSet buscarporid(int id){
        String sqlBuscar= "SELECT * FROM usuarios WHERE id_usuario=?";//?--> parámetro pendiente
        
        
        //Si hay error no se romperá y capturará los errores
        try{
            PreparedStatement ps=conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();//devuelve un ResultSet
            
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute la consulta
            System.out.println("Error al buscar por id"+e.getMessage());//Las excepciones son para observar donde está el error
            return null;
        }
            
        
        
    }//Fin del Método para Consultar por id
    
    
    public ResultSet obtenertodos(){
        
        //**NO SE PASAN NINGÚN PARÁMETRO, PORQUE SE DESEA OBTENER TODO Y NO UNO EN ESPECÍFICO**
        String sqltodos="SELECT * FROM usuarios";
        
        try
        {
            PreparedStatement ps = conexion.prepareStatement(sqltodos);
            return ps.executeQuery();//Regresa el ResultSet, es decir la consulta
        }
        
        catch(SQLException s){
            
            System.out.println("Error al consultar todos los datos"+s.getMessage());
            return null;
        }
        
    }//Fin del Método para obtener todos los datos de la BD
    
    
    public boolean actualizar_nombre_usuario(String nombre, String id_usuario){
        
        String insertSQL="UPDATE usuarios SET nombre=? WHERE id_usuario=?";
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, nombre);
            ps.setString(2, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al actualizar el nombre del usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN del nombre
    
    public boolean actualizar_correo_usuario(String correo, String id_usuario){
        
        String insertSQL="UPDATE usuarios SET correo=? WHERE id_usuario=?";
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, correo);
            ps.setString(2, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al actualizar el nombre del usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN del correo
    
    public boolean actualizar_contrasena_usuario(String contrasena, String id_usuario){
        
        String insertSQL="UPDATE usuarios SET contrasena=? WHERE id_usuario=?";
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, contrasena);
            ps.setString(2, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al actualizar la contraseña del usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN de la contraseña
    
    
    public boolean eliminarusuario(String id_usuario){
        
        String insertSQL="DELETE FROM usuarios WHERE id_usuario=?";//? como parámetro que luego se obtendrá
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al eliminar el registro con ese id"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ELIMINACIÓN de usuario

    
}//Llave fin de la clase
