package Seleccion_de_Futbol;

import java.time.LocalDate;

public class Administrar {
    public static void main(String[] args) {
        Futbolista ff = new Futbolista("Carlos Perez", LocalDate.of(2003,12,3),
                'Z', 200, "Central", "en casa");

        Masajista mm = new Masajista("Carla P", 2, "Fisioterapia",
                LocalDate.of(2000, 11, 23), "culeando");

        Entrenador en = new Entrenador("Walter P",
                LocalDate.of(1990, 3, 12), 2332, "De viaje");


        ff.imprimirDatos();
        mm.imprimirDatos();
        en.imprimirDatos();
    }
}
