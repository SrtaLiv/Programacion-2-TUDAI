package FINALES.Final1Diciembre2024;

import java.util.ArrayList;

public class EquipoTacticoEspacial extends EquipoTactico{

    public EquipoTacticoEspacial(String nombre) {
        super(nombre);
    }

    public ArrayList<String> getMetales() { //union sin repetidos
        return super.getMetales();
    }

    //El primer talle de los elementos
    public int getTalle(){
        ArrayList<TrajeAB> elem = super.getElementos();
        TrajeAB aux = elem.get(0);
        return aux.getTalle();
    }

}
