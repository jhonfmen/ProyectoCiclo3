
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Usuario;
import connection.DBConnection;



public class UsuarioController implements IUsuarioController {
    
    @Override
    public String login(String correo, String contrasena) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "Select * from usuario where correo = '" + correo
                + "' and contrasena = '" + contrasena + "'";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String documento = rs.getString("documento");
                Usuario usuario = new Usuario(contrasena, nombre, telefono, documento, correo);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }
    
    @Override
    public String register(String contrasena, String nombre, String correo) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "INSERT INTO usuario(contrasena,nombre,correo) VALUES('" + contrasena + "', '" + nombre + "', '" + correo + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuario usuario = new Usuario(contrasena, nombre, null, null, correo);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
    
    @Override
    public String pedir(String idUsuario) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from usuario where idUsuario = '" + idUsuario + "'";

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String contrasena = rs.getString("contrasena");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String documento = rs.getString("documento");
                String correo = rs.getString("correo");
                
                Usuario usuario = new Usuario(contrasena, nombre, telefono, documento, correo);

                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }
    
    @Override
    public String modificar(String idUsuario, String nuevaContrasena,
            String nuevoNombre, String nuevosApellidos,
            String nuevoTelefono, String nuevoDocumento, String nuevoCorreo) {

        DBConnection con = new DBConnection();

        String sql = "Update usuario set contrasena = '" + nuevaContrasena
                + "', nombre = '" + nuevoNombre + "', "
                + "apellidos = '" + nuevosApellidos + "', telefono = '"
                + nuevoTelefono + "', documento = " + nuevoDocumento + ", correo = " + nuevoCorreo;

        sql += " where idUsuario = '" + idUsuario + "'";

        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";

    }
    
    @Override
    public String eliminar(String correo) {

        DBConnection con = new DBConnection();

        String sql1 = "Delete from suscripcion where correo = '" + correo + "'";
        String sql2 = "Delete from usuario where correo = '" + correo + "'";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }
}