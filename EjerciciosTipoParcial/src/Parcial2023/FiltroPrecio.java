package Parcial2023;

public class FiltroPrecio extends Filtro{
    double precio;

    public FiltroPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    //true=precio del elemento debe ser mayor al q le paso
    public boolean cumple(ContenidoEducativo cc) {
        return cc.getPrecio() > this.precio;
    }
}
