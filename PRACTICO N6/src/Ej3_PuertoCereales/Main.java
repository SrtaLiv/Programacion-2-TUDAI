package Ej3_PuertoCereales;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PuertoCereal p = new PuertoCereal();

        p.agregarCamion(new Camion(LocalDate.of(2023,11,10),"frutila"));
        p.agregarCamion(new Camion(LocalDate.of(2023,10,10), "uva"));
        p.agregarCamion(new Camion(LocalDate.of(2023,12,10), "trix"));
        p.ordenarCamion();
        p.descargarCamion();

        p.agregarBarco(new Barco(32, "ADS2"));
        p.agregarBarco(new Barco(1, "ADS232"));
        p.agregarBarco(new Barco(44, "ADS2342"));
        p.ordenarBarco();
        p.mostrarBarcos();
    }
}
