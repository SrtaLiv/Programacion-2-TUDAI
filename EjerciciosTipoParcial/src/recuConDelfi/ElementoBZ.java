package recuConDelfi;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoBZ{
    public abstract double getPeso();
    public abstract double getPrecio();
    public abstract int getCantElementos();
    public abstract ArrayList<ElementoBZ> armarCombo(Filtro f);
    public abstract ArrayList<String> categoria();


}
