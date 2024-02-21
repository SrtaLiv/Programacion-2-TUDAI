package EjerciciosTipoParcial.src.recu2021;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Habitacion> {
    Comparator<Habitacion> c1, c2;

    public ComparadorCompuesto(Comparator<Habitacion> c1, Comparator<Habitacion> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        int dif = c1.compare(o1, o2);
        if (dif == 0) {
            return c2.compare(o1, o2);
        }
        return dif;
    }
}
