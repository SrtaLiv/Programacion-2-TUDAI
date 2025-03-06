package Practicos.practico4.Avicola;

import java.time.LocalDate;

public class CongeladoAgua extends Congelado{
    private double gramosDeSal;
    private double litrosDeAgua;

    public CongeladoAgua(LocalDate fechaDeNacimiento, int numeroDeLote) {
        super(fechaDeNacimiento, numeroDeLote);
    }

    public double salinidadDelAgua(){
        return gramosDeSal * litrosDeAgua;
    }
}
