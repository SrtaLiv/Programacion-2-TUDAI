package Clases.CLASE7;

public class Producto {
    protected String nombre;
    protected String autor;
    protected int precio;

    public Producto(String nombre, String autor, int precio) {
        setNombre(nombre);
        this.autor = autor;
        this.precio = precio;
    }

    public double getPrecio(Cliente comprador) {
        if (comprador!=null){
            return precio - ((comprador.getDescuento()/100)*precio);
        } else {
            return precio;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equalsIgnoreCase("Luis")){
            this.nombre = nombre;
        }else this.nombre = "Carlos";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
