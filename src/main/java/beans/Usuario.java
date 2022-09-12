
package beans;


public class Usuario {
    private String idUsuario;
    private String nombre;
    private String apellidos; 
    private String contraseña;
    private String telefono;
    private String documento;
    private String correo;

    public Usuario(String idUsuario, String nombre, String apellidos, String contraseña, String telefono, String documento, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.documento = documento;
        this.correo = correo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidos=" + apellidos + ", contrase\u00f1a=" + contraseña + ", telefono=" + telefono + ", documento=" + documento + ", correo=" + correo + '}';
    }
}
