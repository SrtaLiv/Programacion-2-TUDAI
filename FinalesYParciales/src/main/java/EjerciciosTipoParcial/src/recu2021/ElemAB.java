package EjerciciosTipoParcial.src.recu2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElemAB {
    String descrip;

    public abstract ArrayList<Habitacion> getHabitacionDisponible(Filtro ff, Comparator<Habitacion> c1);

    public abstract double getDimension();
    public abstract int getTotalHabitaciones(Filtro ff);


}
