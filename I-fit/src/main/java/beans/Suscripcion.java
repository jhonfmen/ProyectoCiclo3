
package beans;

import java.sql.Date;

public class Suscripcion {
    private int idSuscripcion;
    private String idUsuario;
    private int idMembresia;
    private Date fechaInicio;
    private Date fechaFinal;
    private double totalSuscripcion;
    private double descuento;

    public Suscripcion(int idSuscripcion, String idUsuario, int idMembresia, Date fechaInicio, Date fechaFinal, double totalSuscripcion, double descuento) {
        this.idSuscripcion = idSuscripcion;
        this.idUsuario = idUsuario;
        this.idMembresia = idMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.totalSuscripcion = totalSuscripcion;
        this.descuento = descuento;
    }

    
    
    
    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getTotalSuscripcion() {
        return totalSuscripcion;
    }

    public void setTotalSuscripcion(double totalSuscripcion) {
        this.totalSuscripcion = totalSuscripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Suscripcion{" + "idSuscripcion=" + idSuscripcion + ", idUsuario=" + idUsuario + ", idMembresia=" + idMembresia + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", totalSuscripcion=" + totalSuscripcion + ", descuento=" + descuento + '}';
    }
    
    
}
