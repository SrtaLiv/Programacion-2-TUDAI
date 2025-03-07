package FINALES.Final_9_Agosto_2024_Comidas;

public class FiltroPrecio extends Filtro{

    private double precio;

    @Override
    public boolean cumplen(ElemAB elemAB) {
        return elemAB.getPrecio() < precio;
    }
}
