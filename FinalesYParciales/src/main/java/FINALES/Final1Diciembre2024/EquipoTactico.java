package FINALES.Final1Diciembre2024;

import FINALES.Final_9_Agosto_2024_Comidas.ElemAB;

import java.util.ArrayList;

public class EquipoTactico extends TrajeAB{
    protected ArrayList<TrajeAB> elementos;

    public EquipoTactico(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(TrajeAB trajeAB){
        elementos.add(trajeAB);
    }

    @Override
    public int getTalle() { //menor de los talles contenidos
        int count = 999;
        for (TrajeAB t : elementos) {
            if (t.getTalle() < count){
                count += t.getTalle();
            }
        }
        return count;
    }

    @Override
    public ArrayList<String> getMetales() { //union sin repetidos
        ArrayList<String> metales = new ArrayList<>();
        for (TrajeAB t : elementos) {
            ArrayList<String> result = new ArrayList<>(t.getMetales());
            for (String m : result) {
                if (!metales.contains(m)){
                    metales.add(m);
                }
            }
        }
        return metales;
    }

    //Trajes recomendados
    @Override
    public ArrayList<TrajeAB> buscar(Filtro ff, Miembro miembro) {
        ArrayList<TrajeAB> cumplen = new ArrayList<>();
        for (TrajeAB t : elementos) {
            cumplen.addAll(t.buscar(ff, miembro));
        }
        return cumplen;
    }

    @Override
    public TrajeAB copia(Traje traje, Modificador modificador) {
        ArrayList<TrajeAB> hijosCopia = new ArrayList<>();
        for (TrajeAB hijas : elementos) {
            hijosCopia.add(hijas.copia(traje, modificador));
        }
        EquipoTactico copia = new EquipoTactico(this.getNombre());
        if (!hijosCopia.isEmpty()){
            for (TrajeAB hijo : hijosCopia){
                copia.addElemento(hijo);
            }
        }
        return copia;
    }

    @Override
    public String getNombre() {
        return this.getNombre();
    }

    public ArrayList<TrajeAB> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<TrajeAB> elementos) {
        this.elementos = elementos;
    }
}
