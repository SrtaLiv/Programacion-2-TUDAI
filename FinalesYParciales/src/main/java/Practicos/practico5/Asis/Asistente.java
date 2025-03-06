package Practicos.practico5.Asis;

import java.util.ArrayList;

public class Asistente {
    private String nombre;
    private ArrayList<String> intereses;

    public Asistente(String nombre) {
        this.nombre = nombre;
        this.intereses = new ArrayList<>();
    }

    public ArrayList<String> getIntereses() {
        return new ArrayList<>(intereses);
    }

    public boolean cumple(Congreso congreso){
        int i = 0;
        while (i<intereses.size() && congreso.tieneCaracteristica(intereses.get(i)))
            i++;
        return i==intereses.size();
    }
}
