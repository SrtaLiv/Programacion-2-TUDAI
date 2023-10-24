package recuConDelfi;

public class FiltroPrecio extends Filtro{
    double precio;

    public FiltroPrecio(double precio) {
        this.precio = precio;
    }

    public boolean cumple(Producto elem){
        return precio < elem.getPrecio();
    }

}
