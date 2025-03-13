package FINALES.Final15Marzo2024_FilasYColas;

import java.util.ArrayList;

public class ColaTerminal extends ColaAbstracta{
    private ArrayList<Elem> elems; // de que tipo seria esto?

    @Override
    public int getCantElementos() {
        return elems.size();
    }

    @Override
    public ColaTerminal getTermiMasElem() {
        return this;
    }

    @Override
    public boolean pertenece(ColaAbstracta colaAbstracta) {
        return true;
    }

    @Override
    public ColaAbstracta copia(ColaAbstracta cola) {
        return null;
    }

    @Override
    public int getCantTerminales() {
        return 1;
    }

    // ep enunciado dice que cuando se lo pide tambien se lo elimina, hay que obtener y eliminar??
    public Elem getElem(){
        elems.remove(0);
        return elems.get(0);
    }

}
