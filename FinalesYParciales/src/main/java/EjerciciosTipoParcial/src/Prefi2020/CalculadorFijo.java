package EjerciciosTipoParcial.src.Prefi2020;

public class CalculadorFijo extends CalculadorCosto{

    @Override
    public int getCosto(SeguroSimple seguro) {
        return seguro.getMonto();
    }
}
