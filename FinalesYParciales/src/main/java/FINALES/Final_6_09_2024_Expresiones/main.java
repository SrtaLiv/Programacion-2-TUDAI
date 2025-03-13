package FINALES.Final_6_09_2024_Expresiones;

public class main {
    public static void main(String[] args) {
        Operador operadorSuma = new Operador("+");
        Operador operadorPor = new Operador("*");
        Operador operadorDivision = new Operador("/");

        Conjunto conjunto = new Conjunto();
        Expresion expresion1 = new Expresion(2, 3, operadorSuma); // 2 + 3
        Expresion expresion2 = new Expresion(expresion1.getValorExpresion(), 5, operadorPor); //2+3 * 5

        conjunto.addElementos(expresion1);
        conjunto.addElementos(expresion2);

    }
}
