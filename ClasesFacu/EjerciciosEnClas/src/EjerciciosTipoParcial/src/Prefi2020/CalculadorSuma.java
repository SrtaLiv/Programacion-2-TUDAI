package EjerciciosTipoParcial.src.Prefi2020;

public class CalculadorSuma extends CalculadorCosto{
    CalculadorCosto c1, c2;
    @Override
    public int getCosto(SeguroSimple seguro) {
        return c1.getCosto(seguro) + c2.getCosto(seguro);
    }
}
