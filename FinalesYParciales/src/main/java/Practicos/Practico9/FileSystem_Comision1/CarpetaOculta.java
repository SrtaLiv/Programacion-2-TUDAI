package Practicos.Practico9.FileSystem_Comision1;

import java.time.LocalDate;
import java.util.ArrayList;

public class CarpetaOculta extends Directorio{


    public CarpetaOculta(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
    }

    public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
        return new ArrayList<>();
    }
}
