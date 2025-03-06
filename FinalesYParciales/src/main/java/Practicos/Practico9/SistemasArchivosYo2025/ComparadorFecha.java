package Practicos.Practico9.SistemasArchivosYo2025;

import java.util.Comparator;

public class ComparadorFecha implements Comparator<ElemAB> {
    /**
     * Por ejemplo, ordenados
     * ascendentemente por fecha de creación y luego por nombre, ordenados descendentemente por
     * tamaño, luego por fecha de creación y finalmente por nombre descendente, entre otros
     * posibles criterios de ordenamiento
     */

    @Override
    public int compare(ElemAB o1, ElemAB o2) {
        return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
    }
}
