package controller;

import java.util.Map;

public interface IUsuarioController {

    public String login(String correo, String contrasena);

    public String register(String idUsuario, String contrasena,
            String nombre, String apellidos, String telefono, String documento, String correo);

    public String pedir(String idUsuario);
    
    public String modificar(String idUsuario, String nuevaContrasena, 
            String nuevoNombre, String nuevosApellidos,String nuevoTelefono,String nuevoDocumento,String nuevoCorreo);
   
    
    public String eliminar(String idUsuario);

}
