package Practicos.Practico6.Ej3_PuertoCereales;

import java.time.LocalDate;

public class Camion {
    private LocalDate fechaEntrada;
    private String cereal;

    public Camion(LocalDate fechaEntrada, String cereal) {
        this.fechaEntrada = fechaEntrada;
        this.cereal = cereal;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public String getCereal() {
        return cereal;
    }

    public String toString() {
        return cereal + " (Fecha de carga: " + fechaEntrada + ")";
    }
}
