package FINALES.Final_6_09_2024_Expresiones;

import java.util.ArrayList;

public class Expresion extends ExpresionAB{
    double numero1, numero2; // 1 , 2
    Operador operador; // +, -

    public Expresion(double numero1, double numero2, Operador operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }


    @Override
    public double getValorExpresion() {
        return 0;
    }

    @Override
    public ArrayList<String> getOperadores() {
        return null;
    }

    @Override
    public String toString() {
        return "Expresion{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                ", operador=" + operador +
                '}';
    }

    @Override
    public ExpresionAB copia() {
        return null;
    }
}
