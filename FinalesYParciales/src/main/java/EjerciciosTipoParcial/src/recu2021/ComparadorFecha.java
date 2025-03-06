package EjerciciosTipoParcial.src.recu2021;

import java.util.Comparator;

public class ComparadorFecha implements Comparator<Habitacion> {
    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        return o1.getFecha().compareTo(o2.getFecha());
    }
}
