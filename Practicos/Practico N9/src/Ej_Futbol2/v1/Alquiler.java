package Ej_Futbol2.v1;

import java.time.LocalDate;

public class Alquiler {
    
    // Atributos

    private LocalDate fechaAlquiler;
    private int idCancha;
    private double pago;

    // Contructor

    public Alquiler (LocalDate fecha, int idCancha, double pago) {
        this.fechaAlquiler = fecha;
        this.idCancha = idCancha;
        this.pago = pago;
    }

    // G && S

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    
}
