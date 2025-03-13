package FINALES.Final_6_09_2024_Expresiones;

import java.util.ArrayList;

public class Conjunto extends ExpresionAB {
    ArrayList<Expresion> expresiones;

    public void addElementos(Expresion expresion){
        expresiones.add(expresion);
    }

    @Override
    public double getValorExpresion() {

        return 0;
    }

    public ArrayList<Integer> getNumeros(){
        ArrayList<Integer> numeros = new ArrayList<>();
        for (Expresion expresion : expresiones){
            numeros.add(expresion.getNumero());
        }
        return numeros;
    }

    @Override
    public ArrayList<String> getOperadores() {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public ExpresionAB copia() {
        return null;
    }
}
