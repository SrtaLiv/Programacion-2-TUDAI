package EjerciciosTipoParcial.src.Recuperatorio_19_11_2024_PapaNoel;

import java.util.ArrayList;

public abstract class ElementoRecoleccion {
    public abstract double getVelocidadTrabajo();
    public abstract double getCreatividad();
    public abstract ArrayList<String> getHabilidades();
    public abstract int cantidadPitufos(Condicion c);

    public abstract ElementoRecoleccion getCopia();
}
