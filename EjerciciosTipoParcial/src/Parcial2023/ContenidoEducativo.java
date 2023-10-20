package Parcial2023;

import java.util.ArrayList;

public abstract class ContenidoEducativo{
    String nombre;
    double precio;
    int notaMin;
    int cantHorasCatedra;
    ArrayList<String> palabrasClave;

    public ContenidoEducativo(String nombre, double precio, int notaMin, int cantHorasCatedra, ArrayList<String> palabrasClave) {
        this.nombre = nombre;
        this.precio = precio;
        this.notaMin = notaMin;
        this.cantHorasCatedra = cantHorasCatedra;
        this.palabrasClave = palabrasClave;
    }

    public abstract double getPrecio();
    public abstract boolean aprobo();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNotaMin() {
        return notaMin;
    }

    public void setNotaMin(int notaMin) {
        this.notaMin = notaMin;
    }

    public int getCantHorasCatedra() {
        return cantHorasCatedra;
    }

    public void setCantHorasCatedra(int cantHorasCatedra) {
        this.cantHorasCatedra = cantHorasCatedra;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    @Override
    public String toString() {
        return "ContenidoEducativo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", notaMin=" + notaMin +
                ", cantHorasCatedra=" + cantHorasCatedra +
                ", palabrasClave=" + palabrasClave +
                '}';
    }
}
