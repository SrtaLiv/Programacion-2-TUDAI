package clase20211026.calculadores;

import clase20211026.SeguroSimple;

public class CalculadorPorcentaje extends CalculadorCosto{
    private double porcentaje;

    public CalculadorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double cuantoCuesta(SeguroSimple seguroSimple) {
        return seguroSimple.getMontoAsegurado() * porcentaje;
    }
}
