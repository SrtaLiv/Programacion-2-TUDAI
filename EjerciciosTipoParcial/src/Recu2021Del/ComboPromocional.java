package Recu2021Del;

import java.util.ArrayList;

public class ComboPromocional extends Combo{
    public ComboPromocional(String nombre, String descripcion, double porcentajeDtoPorProducto, double porcentajeTopeDto, Filtro ff) {
        super(nombre, descripcion, porcentajeDtoPorProducto, porcentajeTopeDto, ff);
    }

    /*
    el precio del mismo se calcula siempre como
    el promedio de los precios que él contiene
     (no va a cambiar nunca la forma)
    */
    @Override
    public double getPrecio() {
        double precioTotal = this.precioSinDescuento();
        double totalProductos = this.getCantProducto();
        return precioTotal / totalProductos;
    }
}
