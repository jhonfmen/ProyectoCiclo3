
package beans;

public class Membresia {
    private int idMembresia;
    private int duracion;
    private Double valor;
    private String nombre;

    public Membresia(int idMembresia, int duracion, Double valor, String nombre) {
        this.idMembresia = idMembresia;
        this.duracion = duracion;
        this.valor = valor;
        this.nombre = nombre;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Membresia{" + "idMembresia=" + idMembresia + ", duracion=" + duracion + ", valor=" + valor + ", nombre=" + nombre + '}';
    }
}
