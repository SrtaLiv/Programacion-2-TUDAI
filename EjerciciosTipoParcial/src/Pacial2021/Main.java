package Pacial2021;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AgenciaDeViaje adv = new AgenciaDeViaje();
        PaqueteSuperViaje p1 = new PaqueteSuperViaje(1);

        Viaje v1 = new Viaje(10, 1, "Roma", "Miami", LocalDate.of(2023, 2, 1), 100, "A");
        Viaje v2 = new Viaje(10, 2, "Miami", "Londres", LocalDate.of(2023, 2, 2), 100, "A");
        Viaje v3 = new Viaje(10, 3, "Londres", "Paris", LocalDate.of(2023, 2, 3), 100, "A");
        Viaje v4 = new Viaje(10, 4, "Paris", "Cancun", LocalDate.of(2023, 2, 4), 100, "A");
        p1.agregarViaje(v1);
        p1.agregarViaje(v2);
        p1.agregarViaje(v3);
        p1.agregarViaje(v4);

        PaqueteSuperViaje p2 = new PaqueteSuperViaje(2);
        p2.agregarViaje(new Viaje(10, 1, "Cancun", "Miami", LocalDate.of(2023, 2, 1), 100, "A"));
        p2.agregarViaje(new Viaje(10, 1, "Cancun", "Miami", LocalDate.of(2023, 2, 1), 100, "A"));
        p2.agregarViaje(new Viaje(10, 1, "Cancun", "Miami", LocalDate.of(2023, 2, 1), 100, "A"));
        p2.agregarViaje(new Viaje(10, 1, "Cancun", "Miami", LocalDate.of(2023, 2, 1), 100, "A"));

        System.out.println(p1.getCosto());
       // System.out.println(p2);

        ViajeNaturaleza vn1= new ViajeNaturaleza(5, 1, "Iguazu", "Cancun",
                LocalDate.of(2023,2,2), 500 ,4, "Hotel 4 estrellas");

        ViajeNaturaleza vn2= new ViajeNaturaleza(3, 2, "Cancun", "Miami",
                LocalDate.of(2023,2,2), 600 ,4, "Hotel 4 estrellas");

        ViajeNaturaleza vn3= new ViajeNaturaleza(5, 3, "Buenos Aires", "Montevideo",
                LocalDate.of(2021,1,1), 750 ,4, "Hotel 4 estrellas");

        adv.addViaje(p1);
        adv.addViaje(p2);
        adv.addViaje(vn1);
        adv.addViaje(vn2);
        adv.addViaje(vn3);

        Filtro fno = new FiltroDestino("Cancun");
        ComparadorID ci = new ComparadorID();
        ComparadorCiudadOrigen cco = new ComparadorCiudadOrigen();
        ComparadorFecha ccf = new ComparadorFecha();
        ComparadorCompuesto cc = new ComparadorCompuesto(ci,cco);
        ArrayList<Viaje> encontrados =adv.buscar(fno,cc);
        for (Viaje v: encontrados) {
            System.out.println(v.toString());
        }

        Filtro ffe = new FiltroFecha(LocalDate.of(2023,2,1));
        ArrayList<Viaje> viajes = adv.buscar(ffe, ccf);
        System.out.println("Viajes:");
        for (Viaje v: viajes) {
            System.out.println(v.toString());
        }

    }
}
