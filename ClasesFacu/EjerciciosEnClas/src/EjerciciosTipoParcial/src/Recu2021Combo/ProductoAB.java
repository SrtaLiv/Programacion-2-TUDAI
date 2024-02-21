package EjerciciosTipoParcial.src.Recu2021Combo;

import java.util.ArrayList;

public abstract class ProductoAB {

    //el nombre yt descriocion la tenian el combo y el producto
    private String nombre, descripcion;

    public ProductoAB(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

/*
  Si hay que escribir los metodos get precio, get categorias en el prodAbstracto
    porque se calculan de maneras distintas segun si es combo o producto.

    Que el combo no tenga el atributo precio-categoria-peso no significa
    que no tenga el comportamiento de saber calcular su precio-peso-categproa
 */
    public abstract double getPrecio();
    public abstract double getPeso();
    public abstract ArrayList<String> getCategorias();
    public boolean tieneCategoria(String categoria){
        return this.getCategorias().contains(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract int getCantProducto();
    public abstract ArrayList<ProductoAB>buscar(Filtro ff); //ProductoAB pq pide combo/producto

    //si quiero duplicar un producto tengo q devolver un producto, no un array (error grave)
    public abstract ProductoAB copia(Filtro ff);
    public abstract Producto productoMenorPeso(); //El menor de todos.
    //necesito q este aca pq cuando recorro mis elementos en el compuesto
    //no se si es un producot o un combo


    @Override
    public String toString() {
        return "ProductoAB{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
