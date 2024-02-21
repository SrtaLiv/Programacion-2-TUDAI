package ej6_CongresoCiencias;

import java.util.ArrayList;

public class Poster extends Trabajo{
    private ArrayList<String> palabrasClave;

    public Poster(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }


    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
}
