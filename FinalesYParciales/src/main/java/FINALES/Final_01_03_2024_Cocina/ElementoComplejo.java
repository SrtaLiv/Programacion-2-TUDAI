package FINALES.Final_01_03_2024_Cocina;

import java.util.ArrayList;

public class ElementoComplejo extends ElemAB{
    private ArrayList<String> ingredientes;
    private ArrayList<ElemAB> elementos;

    public ElementoComplejo(String nombre) {
        super(nombre);
    }

    @Override
    public int getCalorias() {
        return 0;
    }

    @Override
    public int getTiempoPreparacion() {
        return 0;
    }

    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public void asignarAEstacion(Especialidad especialidad) {

    }

    @Override
    public double getCostoTotal() {
        return 0;
    }
}
