package Ej_Futbol2.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    
    // Atributos
    private ArrayList<Socio> socios;
    
    // Constructor

    public Sistema() {
        this.socios = new ArrayList<>();
    }

    // G && S

    public ArrayList<Socio> getSocios() {
        return new ArrayList<>(this.socios);
    }

    public void addSocio(Socio socio) {
        this.socios.add(socio);
    }

    // Comportamiento

    private ArrayList<Socio> filtrarElementos(Condicion condicion) {
        ArrayList<Socio> arrTemp = new ArrayList<>();
        for (int i = 0; i < this.socios.size(); i ++) {
            Socio currentSocio = this.socios.get(i);
            if (condicion.filtrar(currentSocio)) {
                arrTemp.add(currentSocio);
            }
        }
        return arrTemp;
    }

    public ArrayList<Socio> buscarSocios(Condicion condicion) {
        /*ArrayList<Socio> arrTemp = new ArrayList<>();
        for (int i = 0; i < this.socios.size(); i ++) {
            Socio currentSocio = this.socios.get(i);
            if (condicion.filtrar(currentSocio)) {
                arrTemp.add(currentSocio);
            }
        }*/
        ArrayList<Socio> arrTemp = this.filtrarElementos(condicion);
        Collections.sort(arrTemp);
        return arrTemp;
    }

    public ArrayList<Socio> buscarSocios(Condicion condicion, Comparator<Socio> ordenComparator) {
        ArrayList<Socio> arrTemp = this.filtrarElementos(condicion);
        Collections.sort(arrTemp, ordenComparator);
        return arrTemp;
    }
}
