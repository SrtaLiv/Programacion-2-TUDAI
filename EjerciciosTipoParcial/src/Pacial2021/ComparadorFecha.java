package Pacial2021;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorFecha implements Comparator<Viaje> {
    @Override
    public int compare(Viaje o1, Viaje o2) {
        LocalDate fechaPago1 = o1.getFechaPago();
        LocalDate fechaPago2 = o2.getFechaPago();

        if (fechaPago1.isBefore(fechaPago2)){
            return -1;
        } else if (fechaPago1.isAfter(fechaPago2)) {
            return 1;
        }
        return 0; //Fechas iguales.
    }
}
