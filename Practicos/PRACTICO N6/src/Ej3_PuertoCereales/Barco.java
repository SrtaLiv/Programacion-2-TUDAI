package Ej3_PuertoCereales;

public class Barco {
    int capacidad;
    String nombre;

    public Barco(int capacidad, String nom) {
        this.capacidad = capacidad;
        this.nombre = nom;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String toString() {
        return nombre + " (Capacidad: " + capacidad + ")";
    }

}
