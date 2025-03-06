package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;

public class FiltroDespuesDeFecha extends Filtro{

    private LocalDate fecha;

    @Override
    public boolean cumple(ElemAB elemAB) {
        return elemAB.getFechaCreacion().isAfter(fecha);
    }
}
