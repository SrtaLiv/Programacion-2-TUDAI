package EjerciciosTipoParcial.src.recu2021;

import java.util.ArrayList;
import java.util.Comparator;

public class Habitacion extends ElemAB {
    ArrayList<String> comodidades;
    double metros;
    int cantCamas;
    String fecha;
    boolean aceptaMascotas;
    boolean estaOcupado;

    public Habitacion(double metros, int cantCamas, String fecha, boolean aceptaMascotas) {
        this.comodidades = new ArrayList<>();
        this.metros = metros;
        this.cantCamas = cantCamas;
        this.fecha = fecha;
        this.aceptaMascotas = aceptaMascotas;
        this.estaOcupado = false;
    }

    @Override
    public ArrayList<Habitacion> getHabitacionDisponible(Filtro ff, Comparator<Habitacion> c1) {
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        if (!this.estaOcupado && ff.cumple(this))
            habitaciones.add(this);
        return habitaciones;
    }

    @Override
    public double getDimension() {
        return this.metros;
    }

    @Override
    public int getTotalHabitaciones(Filtro ff) {
        if (ff.cumple(this)){
            return 1;
        }
        else return 0;
    }

    public ArrayList<String> getComodidades() {
        return new ArrayList<>();
    }

    public void setComodidades(ArrayList<String> comodidades) {
        this.comodidades = comodidades;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isAceptaMascotas() {
        return aceptaMascotas;
    }

    public void setAceptaMascotas(boolean aceptaMascotas) {
        this.aceptaMascotas = aceptaMascotas;
    }

}
