package FINALES.Final15Marzo2024_FilasYColas;

import java.util.ArrayList;

public class ColaCompuesta extends ColaAbstracta{
    private ArrayList<ColaAbstracta> colas;
    private Calculador calculador;

    public ColaCompuesta(ArrayList<ColaAbstracta> colas) {
        this.colas = new ArrayList<>();
    }

    public void addCola(ColaAbstracta cola){
        colas.add(cola);
    }

    public ColaAbstracta getCola(){
        return colas.get(0);
    }

    public ColaAbstracta getColaSeleccion(){

    }

    @Override
    public int getCantElementos() {
        return 0;
    }

    @Override
    public ColaTerminal getTermiMasElem() {
        return null;
    }

    @Override
    public boolean pertenece(ColaAbstracta colaAbstracta) {
        return false;
    }

    @Override
    public ColaAbstracta copia(ColaAbstracta cola) {
        return null;
    }

    @Override
    public int getCantTerminales() {
        return 0;
    }

    @Override
    public void eliminar() {

    }

    public ArrayList<ColaAbstracta> getColas() {
        return colas;
    }

    public void setColas(ArrayList<ColaAbstracta> colas) {
        this.colas = colas;
    }
}
