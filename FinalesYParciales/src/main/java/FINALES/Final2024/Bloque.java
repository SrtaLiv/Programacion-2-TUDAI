package FINALES.Final2024;

import java.util.ArrayList;

public class Bloque extends ComandoAB{
    ArrayList<ComandoAB> comandos;
    public int EXTRA; //ES EL MISMO PARA TODOS LOS BLOQUES

    public Bloque() {
        this.comandos = comandos;
    }

    @Override
    public double getGastoBateria() {
        int result = 0;
        for (ComandoAB com : comandos){
            result += com.getGastoBateria();
        }
        result += EXTRA * getCantTiempo();
        return result;
    }

    public double getGastoBateriaBloque(){
        return this.getGastoBateria();
    }


    @Override
    public int getCantTiempo() {
        for (ComandoAB com : comandos){
            com.getCantTiempo();
        }
        return 0;
    }

    public int cantElementos(){
        return 1;
    }

    @Override
    public ComandoAB copia(Filtro ff) {
        Bloque copy = new Bloque();
        for (ComandoAB hijos : comandos){
            ComandoAB copiaHijos = hijos.copia(ff);
            if (copiaHijos != null){
                copy.addElemento(copiaHijos);
            }
        }
        if (copy.cantElementos() == 0){
            return null;
        }
        return copy;
    }

    @Override
    public ArrayList<ComandoAB> buscar(Filtro ff) {
        ArrayList<ComandoAB> result = new ArrayList<>();
        for (ComandoAB cc : comandos){
            result.addAll(cc.buscar(ff));
        }
        return result;
    }

    @Override
    public int getConsumo() {
        return 0;
    }

    public void addElemento(ComandoAB com){
        comandos.add(com);
    }
}
