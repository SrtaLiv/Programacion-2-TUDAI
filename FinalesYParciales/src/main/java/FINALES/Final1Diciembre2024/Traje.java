package FINALES.Final1Diciembre2024;

import java.util.ArrayList;

public class Traje extends TrajeAB{
    private int talle;
    private ArrayList<String> metalesEnConfeccion;
    private String planetaOrigen;

    public Traje(String nombre) {
        super(nombre);
    }

    public Traje(String nombre, int talle, String planetaOrigen) {
        super(nombre);
        this.talle = talle;
        this.metalesEnConfeccion = new ArrayList<>();
        this.planetaOrigen = planetaOrigen;
    }

    @Override
    public int getTalle() {
        return 0;
    }

    @Override
    public ArrayList<String> getMetales() {
        return null;
    }

    @Override
    public ArrayList<TrajeAB> buscar(Filtro ff, Miembro miembro) {
        ArrayList<TrajeAB> trajesRecomendados = new ArrayList<>();
        if (ff.cumple(miembro)){
            trajesRecomendados.add(this);
        }
        return trajesRecomendados;
    }

    @Override
    public String getNombre() {
        return "";
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public ArrayList<String> getMetalesEnConfeccion() {
        return metalesEnConfeccion;
    }

    public void setMetalesEnConfeccion(ArrayList<String> metalesEnConfeccion) {
        this.metalesEnConfeccion = metalesEnConfeccion;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

}
