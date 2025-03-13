package FINALES.Final_01_03_2024_Cocina;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Estacion> estaciones;

    public void prepararPlato(Pedido pedido){
        ArrayList<ElemAB> platosQueCumplen = new ArrayList<>();
        for (Estacion estacion : estaciones) {
            for (ElemAB elem : pedido.getElementos()){
                if (estacion.getEspeicalidad().cumple(elem)){
                    platosQueCumplen.add(elem);
                }
            }
        }
    }
}
