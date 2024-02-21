package EjerciciosTipoParcial.src.recu2021;

import java.util.Comparator;

public class ComparadorSuperficie implements Comparator<Habitacion> {
    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        return (int) (o1.getMetros() - o2.getMetros());
    }
}
