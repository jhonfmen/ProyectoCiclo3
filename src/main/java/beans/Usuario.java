
package beans;


public class Usuario {
    private String contraseña;
    private String nombre;
    private String telefono;
    private String documento;
    private String correo;

    public Usuario(String contraseña, String nombre, String telefono, String documento, String correo) {
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
        this.documento = documento;
        this.correo = correo;
    }


    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
}
