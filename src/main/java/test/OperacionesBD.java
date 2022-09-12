
package test;
import beans.Membresia;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
        listarMembresia();
        actualizarMembresia(1,"Membreia profesional tipo 2");
        listarMembresia();
    }
    
    public static void actualizarMembresia(int idMembresia, String nombre){
       DBConnection con = new DBConnection();
       String sql = "UPDATE membresia SET nombre = '" + nombre + "'WHERE idMembresia = " + idMembresia;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Se ha actualizado la membresia");
        } catch (Exception ex) {
            System.out.println("Error al actualizar la membresia");
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void listarMembresia(){
       DBConnection con = new DBConnection();
       String sql = "SELECT * FROM membresia";
       try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               int idMembresia = rs.getInt("idMembresia");
               int duracion = rs.getInt("duracion");
               double valor = rs.getDouble("valor");
               String nombre = rs.getString("nombre");
            
               Membresia membresias = new Membresia(idMembresia,duracion,valor,nombre);
               System.out.println(membresias.toString());
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
     } 
}
