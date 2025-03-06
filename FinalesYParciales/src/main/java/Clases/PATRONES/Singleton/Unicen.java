package Clases.PATRONES.Singleton;

import java.util.ArrayList;

public class Unicen {
    private static Unicen unicaInstancia;
    private String rector;
    private ArrayList<Facultad> facultades;
    private Unicen(){
        facultades = new ArrayList<Facultad>();
    }
    public static Unicen getInstance(){
        if (unicaInstancia == null)
            unicaInstancia = new Unicen();
        return unicaInstancia;
    }
    public void addFacultad(Facultad f){
        this.facultades.add(f);
    }
    public void setRector(String s){
        this.rector = s;
    }
    public String getRector(){
        return rector;
    }
}
