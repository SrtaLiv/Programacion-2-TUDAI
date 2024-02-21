package EjerciciosTipoParcial.src.Prefinal2020;

public class SueldoFijo extends EstrategiaSueldo{
    double sueldo;

    public SueldoFijo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double getSueldo() {
        return this.sueldo;
    }
}
