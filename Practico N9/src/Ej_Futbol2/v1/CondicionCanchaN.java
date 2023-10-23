package Ej_Futbol2.v1;

import java.util.ArrayList;

public class CondicionCanchaN extends Condicion{
    // Atributos
    private int idCancha;

    // Constructor

    public CondicionCanchaN(int idCancha) {
        this.idCancha = idCancha;
    }

    // Comportamiento

    public boolean filtrar(Socio socio) {
        ArrayList<Alquiler> arrTempAlquileres = socio.getAlquileres();
        int i = 0;
        while (i < arrTempAlquileres.size() && arrTempAlquileres.get(i).getIdCancha() != this.idCancha) {
            i++;
        }

        return i < arrTempAlquileres.size();
    }
}
