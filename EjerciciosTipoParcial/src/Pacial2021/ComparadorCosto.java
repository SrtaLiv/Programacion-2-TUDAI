package Pacial2021;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<Viaje> {

    @Override
    public int compare(Viaje o1, Viaje o2) {
        int dif = o1.getCosto() - o2.getCosto();
        if (dif != 0)
        {
            if(dif<0)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return 0;
        }

    }
}
