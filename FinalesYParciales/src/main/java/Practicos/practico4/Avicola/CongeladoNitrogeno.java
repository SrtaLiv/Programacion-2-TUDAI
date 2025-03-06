package Practicos.practico4.Avicola;

import java.time.LocalDate;

public class CongeladoNitrogeno extends Congelado{
    public CongeladoNitrogeno(LocalDate fechaDeNacimiento, int numeroDeLote) {
        super(fechaDeNacimiento, numeroDeLote);
    }

    private double tiempoDeExposicion; //en segundos
    private String metodoDeCongelacion;
}
