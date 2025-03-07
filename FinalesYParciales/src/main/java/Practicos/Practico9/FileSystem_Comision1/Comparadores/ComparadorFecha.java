package Practicos.Practico9.FileSystem_Comision1.Comparadores;

import FileSystem.Elemento;

import java.util.Comparator;

public class ComparadorFecha implements Comparator<Elemento> {


    @Override
    public int compare(Elemento o1, Elemento o2) {
        if (o1.getFechaCreacion().isBefore(o2.getFechaCreacion())) {
            return -1;
        } else if (o1.getFechaCreacion().isAfter(o2.getFechaCreacion())) {
            return 1;
        } else
            return 0;
    }
}
