package Parcial2022_Recuperatorio;

import java.util.ArrayList;

public abstract class ElementoAB implements Comparable<ElementoAB> {
    String categoria;

    public abstract ArrayList<String> getPalabrasClave();
    public abstract String getCategoria();

    public abstract ElementoAB copiaRestringida(Filtro ff);
    @Override
    public int compareTo(ElementoAB nuevo){
        return this.getCategoria().compareTo(nuevo.getCategoria());
    }
}
