package FINALES.FinalFebrero_28_02_2025;

import java.util.ArrayList;

public abstract class LibroAB {

    public abstract ArrayList<Libro> solicitarLibro(Socio s, RequisitoEspecial ff);
    public abstract int getCantLibros();
    public abstract int getLibrosDisponibles(RequisitoEspecial ff);
    public abstract int getPorcentajeLibros(RequisitoEspecial ff);

}
