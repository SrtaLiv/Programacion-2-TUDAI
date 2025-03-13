package FINALES.Final_01_03_2024_Cocina;

import java.util.ArrayList;

public class Estacion {
    private Especialidad espeicalidad;
    private ArrayList<Pedido> colaDePlatos;

    public Estacion(Especialidad espeicalidad, ArrayList<Pedido> colaDePlatos) {
        this.espeicalidad = espeicalidad;
        this.colaDePlatos = colaDePlatos;
    }

    public Especialidad getEspeicalidad() {
        return espeicalidad;
    }

    public void setEspeicalidad(Especialidad espeicalidad) {
        this.espeicalidad = espeicalidad;
    }

    public ArrayList<Pedido> getColaDePlatos() {
        return colaDePlatos;
    }

    public void setColaDePlatos(ArrayList<Pedido> colaDePlatos) {
        this.colaDePlatos = colaDePlatos;
    }
}
