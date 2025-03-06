package Practicos.practico5.Asis;


import java.util.ArrayList;

public class Congreso {
    private ArrayList<String> caracteristicas = new ArrayList<>();

    public boolean tieneCaracteristica(String caracteristica){
        return caracteristicas.contains(caracteristica);
    }

    public boolean cumple(Asistente asistente){
        ArrayList<String> caractAsistente = asistente.getIntereses();
        int i=0;
        while (i<caractAsistente.size() && tieneCaracteristica(caractAsistente.get(i)))
            i++;
        return i==caractAsistente.size();
    }
}
