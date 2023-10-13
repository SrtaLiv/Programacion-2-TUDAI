package Ej4_CandyCrush;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Ficha f1 = new Ficha("Chocolate", 4, 3, 3);
        Ficha f2 = new Ficha("Queso", 5, 3, 3);
        Ficha f3 = new Ficha("Caramelo", 2, 7, 2);
        Ficha fe1 = new FichaEspecial("Piedra", 2, 3, 0);
        Ficha fe2 = new FichaEspecial("Caramelo a Rayas", 2, 4, 10);
        Ficha fe3 = new FichaEspecial("Torta", 8, 6, 4);

        tablero.addFichas(f1);
        tablero.addFichas(f2);
        tablero.addFichas(f3);
        tablero.addFichas(fe1);
        tablero.addFichas(fe2);
        tablero.addFichas(fe3);

        System.out.println("Todas las fichas que posean un poder de destrucción mayor a 2");
        System.out.println(tablero.buscarFicha(new FiltroPoderDestruccion(2)) + "\n");

        System.out.println("Todas las fichas que ocupen más de 4 lugares");
        System.out.println(tablero.buscarFicha(new FiltroEspacioTablero(4))+ "\n");

        System.out.println("Todas las fichas que tengan una fortaleza mayor a 5");
        System.out.println(tablero.buscarFicha(new FiltroFortaleza(5))+ "\n");

        System.out.println("Combinaciones lógicas de los anteriores");
        System.out.println(tablero.buscarFicha(new FiltroAND(new FiltroFortaleza(5), new
                FiltroEspacioTablero(4)))+ "\n");

        System.out.println("DIFICULTAD DEL TABLERO:");
        System.out.println(tablero.getDificultad());
    }

}
