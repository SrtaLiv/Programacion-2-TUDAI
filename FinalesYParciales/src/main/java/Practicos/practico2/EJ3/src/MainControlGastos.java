package Practicos.practico2.EJ3.src;

import java.util.ArrayList;
import java.util.Random;

public class MainControlGastos {
    public static int random(int MAX, int MIN){
        Random random = new Random();
        return random.nextInt(MAX - MIN + 1) + MIN;
    }
    public static void main(String[] args) {
        //PRIMERA PROVINCIA
        ArrayList<Ciudad> ciudades1 = new ArrayList<>();
        Ciudad cc1 = new Ciudad("Olavarria");
        Ciudad cc2 = new Ciudad("Montehermoso");
        Ciudad cc3 = new Ciudad("Azul");

        ciudades1.add(cc1);
        ciudades1.add(cc2);
        ciudades1.add(cc3);

        Provincias pr1 = new Provincias("Buenos Aires");
        pr1.agregarCiudad(ciudades1);
        pr1.mostrarCiudades();

        System.out.println("---------------------------------");

        //SEGUNDA PROVINCIA
        ArrayList<Ciudad> ciudades2 = new ArrayList<>();
        ciudades2.add(new Ciudad("JONIA"));
        ciudades2.add(new Ciudad("NEXUS"));

        Provincias pr2 = new Provincias("League Of Legends");
        pr2.agregarCiudad(ciudades2);
        pr2.mostrarCiudades();



    }



}