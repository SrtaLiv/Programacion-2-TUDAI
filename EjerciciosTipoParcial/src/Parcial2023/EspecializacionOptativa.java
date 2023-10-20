package Parcial2023;

import java.util.ArrayList;

public class EspecializacionOptativa extends Especializacion {


    public EspecializacionOptativa(String nombre, double precio, int notaMin, int cantHorasCatedra, ArrayList<String> palabrasClave) {
        super(nombre, precio, notaMin, cantHorasCatedra, palabrasClave);
    }

    @Override
    public boolean aprobo() {
        int cantidadMinimaAprobados  = super.getCantidadDeCursos()/2;
        int contador = 0;
        for (int i = 0 ; i < cursos.size() ; i++) {
            if (cursos.get(i).aprobo()) {
                contador++;
            }
        }
        return contador >= cantidadMinimaAprobados;
    }
}
