package FINALES.Final_6_09_2024_Expresiones;

import java.util.ArrayList;

public abstract class ExpresionAB {
    public abstract double getValorExpresion();
    public abstract ArrayList<String> getOperadores();
    public abstract String toString();
    public abstract ExpresionAB copia();
}
