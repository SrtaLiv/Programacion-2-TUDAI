package FINALES.FinalDiciembre2024_Cursos;

public class FiltroPrecio extends Filtro{

    double precio;

    public FiltroPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElemAB elemAB) {
        return elemAB.calcularPrecio() < precio;
    }
}
