package Practicos.practico4.Avicola;

import java.time.LocalDate;

public class CongeladoAire extends Congelado{
    /*
    deben llevar la información de
la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido
de carbono y % de vapor de agua).
     */
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporDeAgua;


    public CongeladoAire(LocalDate fechaDeNacimiento, int numeroDeLote) {
        super(fechaDeNacimiento, numeroDeLote);
    }
}
