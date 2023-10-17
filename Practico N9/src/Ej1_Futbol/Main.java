package Ej1_Futbol;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Socio s1 = new Socio("Martín", "Juarez", 26, true);
        Socio s2 = new Socio("Carla", "Juarez", 29, true);
        Socio s3 = new Socio("Ramiro", "Lopez", 16, false);
        Socio s4 = new Socio("Joaquín", "Martinez", 19, true);
        Socio s5 = new Socio("María", "Rodriguez", 27, true);
        Socio s6 = new Socio("Domingo", "Perón", 30, false);
        Socio s7 = new Socio("Isaac", "Juarez", 26, false);
        Socio s8 = new Socio("Santiago", "Caputo", 21, false);

        AlquilerCancha c1 = new AlquilerCancha(LocalDate.of(2023, 10, 20), 13, 500);
        AlquilerCancha c2 = new AlquilerCancha(LocalDate.of(2023, 11, 25), 4, 400);
        AlquilerCancha c3 = new AlquilerCancha(LocalDate.of(2023, 10, 15), 9, 600);
        AlquilerCancha c4 = new AlquilerCancha(LocalDate.of(2023, 12, 14), 10, 200);
        AlquilerCancha c5 = new AlquilerCancha(LocalDate.of(2023, 12, 14), 13, 200);
        AlquilerCancha c6 = new AlquilerCancha(LocalDate.of(2023, 12, 17), 13, 700);
        AlquilerCancha c7 = new AlquilerCancha(LocalDate.of(2023, 12, 19), 13, 700);


        s1.addCanchaAlquilada(c1);
        s1.addCanchaAlquilada(c2);
        s1.addCanchaAlquilada(c5);
        s1.addCanchaAlquilada(c6);

        s2.addCanchaAlquilada(c3);
        s2.addCanchaAlquilada(c1);
        s2.addCanchaAlquilada(c5);
        s2.addCanchaAlquilada(c6);
        
        s3.addCanchaAlquilada(c2);
        s3.addCanchaAlquilada(c4);
        s3.addCanchaAlquilada(c5);
        s3.addCanchaAlquilada(c6);

        s4.addCanchaAlquilada(c2);
        s4.addCanchaAlquilada(c3);

        s5.addCanchaAlquilada(c4);
        s5.addCanchaAlquilada(c1);

        s6.addCanchaAlquilada(c3);
        s6.addCanchaAlquilada(c4);

        s7.addCanchaAlquilada(c3);
        s7.addCanchaAlquilada(c1);

        s8.addCanchaAlquilada(c2);
        s8.addCanchaAlquilada(c1);
        s8.addCanchaAlquilada(c5);
        s8.addCanchaAlquilada(c6);
        s8.addCanchaAlquilada(c7);

        ArrayList<Socio> socios = new ArrayList<>();

        socios.add(s1);
        socios.add(s2);
        socios.add(s3);
        socios.add(s4);
        socios.add(s5);
        socios.add(s6);
        socios.add(s7);
        socios.add(s8);

        System.out.println("\n" + socios);

        // System.out.println("\n");
        // System.out.println("Ordenados por Nombre y Apellido");
        // Collections.sort(socios, new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre()));
        // System.out.println("\n" + socios);
        // System.out.println("\n");
        // System.out.println("Ordenados por Edad");
        // Collections.sort(socios, new ComparadorEdad());
        // System.out.println("\n" + socios);
        // System.out.println("\n");
        // System.out.println("Ordenados por Cancha 13");
        // Collections.sort(socios, new ComparadorCancha(13));
        // Collections.reverse(socios);
        // System.out.println("\n" + socios);
        System.out.println("Ordenados por XXXXXXXX");
        Collections.sort(socios, new ComparadorCompuesto(new ComparadorCuota(), 
            new ComparadorCompuesto(new ComparadorPrecio(550), new ComparadorNombre())));
        System.out.println("\n" + socios);
    }
}
