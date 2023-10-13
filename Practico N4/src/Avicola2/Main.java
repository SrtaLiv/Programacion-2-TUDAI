package Avicola2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto(LocalDate.of(2003,3,13), 13,
                LocalDate.of(2000, 1, 1), "La Patagonia");
        System.out.println(producto.mostrarTodosLosDatos());
    }
}

