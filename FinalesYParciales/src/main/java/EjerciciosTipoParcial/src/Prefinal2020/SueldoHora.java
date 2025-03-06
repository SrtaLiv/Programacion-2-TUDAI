package EjerciciosTipoParcial.src.Prefinal2020;

public class SueldoHora extends EstrategiaSueldo {
        private double hora;
        public double monto;

        @Override
        public double getSueldo() {
                return hora * monto;
        }
}
