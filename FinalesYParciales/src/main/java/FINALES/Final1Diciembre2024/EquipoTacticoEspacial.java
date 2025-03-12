package FINALES.Final1Diciembre2024;

import java.util.ArrayList;

public class EquipoTacticoEspacial extends EquipoTactico{

    public EquipoTacticoEspacial(String nombre) {
        super(nombre);
    }

    //El primer talle de los elementos
    public int getTalle(){
        return elementos.getFirst().getTalle();
    }

}
