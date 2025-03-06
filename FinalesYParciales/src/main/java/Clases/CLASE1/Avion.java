package Clases.CLASE1;

public class Avion {
    int capacidad;
    String color;
    String estado;

    public Avion() {
        capacidad = 100;
        color = "blanco";
        estado = "en tierra";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String nuevocolor) {
        color = nuevocolor;
    }

}
