package clase20211026.calculadores;

import clase20211026.SeguroSimple;

public class CalculadorMontoFijo extends CalculadorCosto{
    private double montoFijo;

    public CalculadorMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double cuantoCuesta(SeguroSimple seguroSimple) {
        return montoFijo;
    }
}
