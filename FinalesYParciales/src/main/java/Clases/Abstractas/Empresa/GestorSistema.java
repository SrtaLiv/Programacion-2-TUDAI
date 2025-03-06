package CLASES.Abstractas.Empresa;

import java.util.ArrayList;

public class GestorSistema {
    ArrayList<Elemento> elementos;
    ArrayList<Muebles> muebles;

    public GestorSistema() {
        this.elementos = new ArrayList<>();
        this.muebles = new ArrayList<>();
    }

    public void addElemento(Elemento e){
        elementos.add(e);
    }


    public ArrayList<Muebles> mueblesPorMaterial (String material) {
        ArrayList<Muebles> muebles = new ArrayList<>();
        for (Muebles mueble : muebles) {
            if (mueble.getMaterial().toLowerCase().equals(material)){
                muebles.add(mueble);
            }
        }
        return muebles;
    }
    public ArrayList<Elemento> filtrar(Filtro filtro){
        ArrayList<Elemento> listaFiltrada = new ArrayList<>();
        for (Elemento elemento : elementos) {
            if (filtro.cumple(elemento)) {
                listaFiltrada.add(elemento);
            }
        }
        return listaFiltrada;
    }

    public static void main(String[] args) {
        GestorSistema gestor = new GestorSistema();
        gestor.addElemento(new Muebles("TV1", 2000, "Ecocuero"));
        gestor.addElemento(new Muebles("Sillon", 2021, "Ecocuero"));
        gestor.addElemento(new Muebles("Sillon", 2000, "Ecocuero"));
        gestor.addElemento(new Electrodomesticos("TV2", 2000));
        gestor.addElemento(new Electrodomesticos("TV", 2021));
        gestor.addElemento(new Electrodomesticos("TV", 2020));
        gestor.addElemento(new Electrodomesticos("TV", 2018));

        ArrayList<Elemento> filtrarAnio = gestor.filtrar(new FiltroAnio(2000));
        System.out.println(filtrarAnio);

      //  ArrayList<Elemento> filtrarNombre = gestor.filtrar(new FiltroAND(new FiltroNombreMaterial("Sillon"), new FiltroAnio(2000)));
        //System.out.println(filtrarNombre);

      //  Filtro ecocuero = new FiltroNombreMaterial("Ecocuero");
        ArrayList<Muebles> filtrarMueble = gestor.mueblesPorMaterial("Ecocuero");
        System.out.println(filtrarMueble);


    }
}
