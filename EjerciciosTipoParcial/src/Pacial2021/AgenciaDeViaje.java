package Pacial2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AgenciaDeViaje {
    ArrayList<Viaje> viajes;

    public AgenciaDeViaje() {
        this.viajes = new ArrayList<>();
    }

    public void addViaje(Viaje v){
        viajes.add(v);
    }

    public ArrayList<Viaje> buscar(Filtro f, Comparator<Viaje> comparador){
        ArrayList<Viaje> encontrados = new ArrayList<>();
        for (int i = 0; i < viajes.size() ; i++){
            if (f.cumple(viajes.get(i))){
                encontrados.add(viajes.get(i));
            }
        }
        Collections.sort(encontrados, comparador);
        return encontrados;
    }
}
