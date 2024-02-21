package Ej1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Item cars = new Pelicula(2, "Cars", 1);
        Item avion =  new Vehiculo(3, "Toyo", 23, "123", "Cero");

        Cliente oli = new Cliente("Olivia");
        oli.alquilarItem(cars, LocalDate.of(2023,10, 23));
        oli.devolverItem(cars);

        Cliente juan = new Cliente("Juan");
        juan.alquilarItem(cars, LocalDate.of(2023,10, 24));
    }
}