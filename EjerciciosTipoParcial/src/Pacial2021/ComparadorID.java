package Pacial2021;

import java.util.Comparator;

public class ComparadorID implements Comparator<Viaje> {

    @Override
    public int compare(Viaje o1, Viaje o2) {
        int dif = o1.getId() - o2.getId();
        if(dif < 0) {
            return -1;
        }
        if(dif > 0) {
            return 1;
        } else return 0;
    }


}
