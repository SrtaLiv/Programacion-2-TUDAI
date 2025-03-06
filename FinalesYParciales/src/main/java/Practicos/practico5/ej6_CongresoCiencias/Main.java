package Practicos.practico5.ej6_CongresoCiencias;

public class Main {
    public static void main(String[] args) {
        Trabajo trabajo = new Trabajo();


        Evaluador ev1 = new Evaluador();
        Evaluador ev2 = new Evaluador();
        Evaluador ev3 = new Evaluador();

        ev1.addConocimientos("Programacion");
        ev1.addConocimientos("Algoritmos");
        ev1.mostrarEvaluador();


    }
}
