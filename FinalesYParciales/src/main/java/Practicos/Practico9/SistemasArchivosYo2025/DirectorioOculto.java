package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DirectorioOculto extends Directorio{
    public DirectorioOculto(String name, LocalDate fecha) {
        super(name, fecha);
    }

    /**
     * ¿Cómo quedaría implementada la búsqueda si incorporamos
     * una “Carpeta oculta”, que es invisible (sus archivos no
     * se incluyen) en los resultados de búsqueda?
     */

    public List<ElemAB> getElems() { // vacio
        return new ArrayList<>();
    }
}
