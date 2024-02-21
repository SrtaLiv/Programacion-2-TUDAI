package CLASES.CLASE7;

import java.util.ArrayList;

public class Cliente {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected long dni;
    protected int descuento;

    protected ArrayList<String> autoresFavoritos;
    protected ArrayList<String> generosFavoritos;

    protected ArrayList<Producto> compras;

    public Cliente(String nombre, String apellido, String direccion, long dni) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        autoresFavoritos = new ArrayList<String>();
        generosFavoritos = new ArrayList<String>();
        compras = new ArrayList<Producto>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getDni() {
        return dni;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public void addAutorFavorito(String nombre){
        // CONTAINS FUNCIONA USANDO EL EQUALS DEL TIPO DE ELEMENTO
        if (!autoresFavoritos.contains(nombre))
        autoresFavoritos.add(nombre);
    }

    public void addGeneroFavorito(String genero){
        // CONTAINS FUNCIONA USANDO EL EQUALS DEL TIPO DE ELEMENTO
        if (!generosFavoritos.contains(genero))
            generosFavoritos.add(genero);
    }

    public void addProductoComprado(Producto prod){
        // CONTAINS FUNCIONA USANDO EL EQUALS DEL TIPO DE ELEMENTO
        //HAY QUE DEFINIR equals EN prodcuto
        if (!compras.contains(prod))
            compras.add(prod);
    }

    /*
    public ArrayList<Producto> getProductosComprados(){
        //OPCION 1 MUY MAL PQ ROMPE ENCAPSULAMIENTO
        //return compras;
        //OPCION 2
        return new ArrayList<Producto>(compras);
    }*/

    public boolean comprasteProducto(Producto p){
        for (int i=0; i<compras.size();i++){
            Producto p1 = compras.get(i);
            if (p1.equals(p)) {
                return true;
            }
        }
        return false;
    }
}
