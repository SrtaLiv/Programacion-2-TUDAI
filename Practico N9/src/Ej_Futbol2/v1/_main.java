package Ej_Futbol2.v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class _main {
    public static void main(String[] args) {
        
        Sistema club = new Sistema();

        // generar socios
        Socio socio1 = new Socio("Geto", "Jujutsu", 16,true);
        Socio socio2 = new Socio("Naruto", "Uzumaki", 18,true);
        Socio socio3 = new Socio("Goku", "DBZ", 45, true);
        Socio socio4 = new Socio("Roberto", "Mamez", 13, false);
        Socio socio5 = new Socio("Milena", "Uzumaki", 18, true);
        Socio socio6 = new Socio("Kitana", "Mortal Kombat", 17, false);
        Socio socio7 = new Socio("Milk", "Sra. Goku", 23, false);
        Socio socio8 = new Socio("Kakashi", "Hatake", 35, true);

        // generar alquileres
        Alquiler alquiler1 = new Alquiler(LocalDate.now(), 2, 500);
        Alquiler alquiler2 = new Alquiler(LocalDate.now(), 13, 505);
        Alquiler alquiler3 = new Alquiler(LocalDate.now(), 13, 420);
        Alquiler alquiler4 = new Alquiler(LocalDate.now(), 03, 350);
        Alquiler alquiler5 = new Alquiler(LocalDate.now(), 13, 1500);
        Alquiler alquiler6 = new Alquiler(LocalDate.now(), 113, 780);
        Alquiler alquiler7 = new Alquiler(LocalDate.now(), 16, 1000);
        Alquiler alquiler8 = new Alquiler(LocalDate.now(), 03, 260);

        // agregar alquiler a socios

        socio1.addAlquiler(alquiler3);
        socio3.addAlquiler(alquiler2);
        socio3.addAlquiler(alquiler3);
        socio5.addAlquiler(alquiler1);
        socio7.addAlquiler(alquiler8);
        socio8.addAlquiler(alquiler8);
        socio5.addAlquiler(alquiler7);
        socio6.addAlquiler(alquiler6);
        socio2.addAlquiler(alquiler5);
        socio4.addAlquiler(alquiler7);
        socio7.addAlquiler(alquiler2);
        socio1.addAlquiler(alquiler4);

        // Agregar socios
        club.addSocio(socio1);
        club.addSocio(socio2);
        club.addSocio(socio3);
        club.addSocio(socio4);
        club.addSocio(socio5);
        club.addSocio(socio6);
        club.addSocio(socio7);
        club.addSocio(socio8);


        

        ArrayList<Socio> arrTemp;

        

        System.out.println(" a) - Cuota impaga + ordenados alfabeticamente apellido y nombre\n");
        CondicionCuotaPaga cuotaPaga = new CondicionCuotaPaga();
        arrTemp = club.buscarSocios(new CondicionNOT(cuotaPaga),
                                    new ComparatorCompuesto(new ComparatorApellido(), new ComparatorNombre()));
        System.out.println(arrTemp);
        System.out.println("\n");


        System.out.println(" b) - Menores de edad + Ordenados por edad (Comparable):\n");
        Condicion menorEdad = new CondicionMenorEdad();
        arrTemp = club.buscarSocios(menorEdad);
        System.out.println(arrTemp);
        System.out.println("\n");

        System.out.println(" c) -  Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad total de alquileres de esa cancha.\n");
        Condicion canchaID = new CondicionCanchaN(13);
        //arrTemp = club.buscarSocios(canchaID);
        ComparatorCanchaID comparadorCanchaID = new ComparatorCanchaID(13);
        arrTemp = club.buscarSocios(canchaID, Collections.reverseOrder(comparadorCanchaID));
        System.out.println(arrTemp);
        System.out.println("\n");

        System.out.println(" d) - Todos los socios que pagaron más de $500 por algún alquiler de cancha, " +
        "listando primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los morosos, " +
        "también ordenados alfabéticamente.\n");

        CondicionAlquilerMayor pagoAlquilerMayor = new CondicionAlquilerMayor(500);
        ComparatorCuotaPaga comparadorCuotaPaga = new ComparatorCuotaPaga();
        //arrTemp = club.buscarSocios(pagoAlquilerMayor);
        arrTemp = club.buscarSocios(pagoAlquilerMayor, comparadorCuotaPaga);
        arrTemp = club.buscarSocios(pagoAlquilerMayor,
                                    new ComparatorCompuesto(Collections.reverseOrder(comparadorCuotaPaga),
                                                            new ComparatorCompuesto(new ComparatorNombre(),
                                                                                    new ComparatorApellido())
                                                            )
                                    );
        System.out.println(arrTemp);



    }
}