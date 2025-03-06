package Clases.CLASE1;

public class Juego {
    private int puntosJugador1;
    private int puntosJugador2;
    private final int minimoPuntos;
    private int cantidadCaras;

    //CONSTRUCTORES 3
    //TENGO 3 FORMAS DE INICIALIZAR EL OBJETO, TENGO 3 PARAMETROS
    //SABIENDO LA SIGNATURA PUEDO DECIDIR QUE CONSTRUCTOR EJECUTRAR
    public Juego() {
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
        minimoPuntos = 7; //SIN THIS
    }

    public Juego(int minimoPuntos){
        this(minimoPuntos, 6);
    }

    public Juego(int minimoPuntos, int cantidadCaras){
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;

        this.minimoPuntos = minimoPuntos;
        this.cantidadCaras = cantidadCaras;
    }

    //NO AGREGAMOS SETTERS PORQUE EL UNICO QUE CAMBIA EL VALOR SOY YO
    public int getPuntosJugador1() {
        return puntosJugador1;
    }

    public int getPuntosJugador2() {
        return puntosJugador2;
    }

    //METODOS
    public int tirarDado() {
        return (int) ((Math.random() * cantidadCaras) + 1);
    }

    public String ganador() {
        if (puntosJugador1 > puntosJugador2) {
            return "Jugador 1";
        } else if (puntosJugador2 > puntosJugador1) {
            return "Jugador 2";
        }
        return "Empate";
    }

    public String jugar() {
        int puntos1;
        int puntos2;
        for (int i = 0; i < 10; i++) {
            puntos1 = tirarDado() + tirarDado(); //Son 2 dados
            puntos2 = tirarDado() + tirarDado();

            //nunca poner constantes en codigo. Mejor ponemos minimoPuntos
            if (puntos1 >= minimoPuntos && (puntos1 > puntos2)) {
                puntosJugador1++;
            } else {
                if (puntos2 >= minimoPuntos && (puntos2 > puntos1)) {
                    puntosJugador2++;
                }
            }
        }
        return this.ganador();
    }
}
