package EjerciciosTipoParcial.src.recu2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hotel extends ElemAB {
    ArrayList<ElemAB> elementos;

    @Override
    public ArrayList<Habitacion> getHabitacionDisponible(Filtro ff, Comparator<Habitacion> c1) {
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        for (ElemAB elem : elementos){
            habitaciones.addAll(elem.getHabitacionDisponible(ff, c1));
        }
        Collections.sort(habitaciones, c1);
        return habitaciones;
    }

    public double getDimension(){
        double suma = 0;
        for (ElemAB elem : elementos){
            suma += elem.getDimension();
        }
        return suma;
    }


    //no se XD
    public int getTotalHabitaciones(Filtro ff) {
        int suma = 0;
        for (ElemAB elem : elementos) {
            suma += elem.getTotalHabitaciones(ff);
        }
        return suma;
    }
}
