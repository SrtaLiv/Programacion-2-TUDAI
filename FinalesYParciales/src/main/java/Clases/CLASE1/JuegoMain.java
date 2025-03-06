package Clases.CLASE1;

public class JuegoMain {
    public static void main(String[] args) {
        Juego j1 = new Juego();
        Juego j2 = new Juego(3);
        Juego j3 = new Juego(8,8);

        System.out.println(j1.getPuntosJugador1());
        System.out.println(j1.getPuntosJugador2());

        System.out.println(j1.jugar());

        System.out.println(j1.getPuntosJugador1());
        System.out.println(j1.getPuntosJugador2());

        System.out.println("JUEGO J2:");
        System.out.println(j2.getPuntosJugador1());
        System.out.println(j2.getPuntosJugador2());

        System.out.println(j2.jugar());

        System.out.println(j2.getPuntosJugador1());
        System.out.println(j2.getPuntosJugador2());
    }
}
