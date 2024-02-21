package EjerciciosTipoParcial.src.Prefi2020;

public class CalculadorPorcentaje extends CalculadorCosto{

    int porcentaje;

    public CalculadorPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int getCosto(SeguroSimple seguro) {
        return porcentaje * seguro.getMonto();
    }
}
