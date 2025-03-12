package FINALES.Final1Diciembre2024;

import FINALES.Final_9_Agosto_2024_Comidas.ElemAB;

import java.util.ArrayList;

public class Traje extends TrajeAB{
    private int talle;
    private ArrayList<String> metalesEnConfeccion;
    private String planetaOrigen;

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

    public void addMetal(String ss){
        metalesEnConfeccion.add(ss);
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
    public TrajeAB copia(Traje traje, Modificador modificador) {
        Traje trajeModificado = new Traje(this.getNombre(), this.getTalle(), this.getPlanetaOrigen());
        for (String metal : getMetales()){
            trajeModificado.addMetal(metal);
        }
        modificador.modificar(traje);
        return trajeModificado;
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
