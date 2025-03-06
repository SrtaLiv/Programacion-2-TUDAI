package Clases.CLASE7;

import java.util.ArrayList;

public class Libreria {
    ArrayList<Producto> productos;
    ArrayList<Cliente> clientes;

    public Libreria() {
        productos = new ArrayList<Producto>();
        clientes = new ArrayList<Cliente>();
    }

    public double getPrecio(Producto p, Cliente c){
        return p.getPrecio(c);
    }

    public boolean comproProducto(Cliente cli, Producto pp) {
        return cli.comprasteProducto(pp);
    }
}
