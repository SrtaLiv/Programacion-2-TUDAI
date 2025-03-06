package Practicos.Practico9.Ej3_Electoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SistemaGestion {
    String nombre;
    ArrayList<Candidato> candidatos;

    public SistemaGestion(String nombre) {
        this.nombre = nombre;
        candidatos = new ArrayList<>();
    }


    public void agregarCandidatos(Candidato c){
        candidatos.add(c);
    }

    public ArrayList<Candidato> listarCandidatos(Comparator<Candidato> ordenar){
        ArrayList<Candidato> encontrados = new ArrayList<>();
        for (int i = 0; i < candidatos.size(); i++) {
            encontrados.add(candidatos.get(i));
        }
        Collections.sort(encontrados, ordenar);
        return encontrados;
    }




}
