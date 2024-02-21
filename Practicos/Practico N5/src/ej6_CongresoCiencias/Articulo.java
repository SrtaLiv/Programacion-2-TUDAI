package ej6_CongresoCiencias;

import java.util.ArrayList;

public class Articulo extends Trabajo{
    private ArrayList<String> palabrasClave;
    public static final String[] PALABRAS_CLAVE = {"Algoritmos", "Lenguajes de Programación", "Redes de Comunicación"};

    public Articulo(){
        super();
        palabrasClave = new ArrayList<>();
    }


    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
}
