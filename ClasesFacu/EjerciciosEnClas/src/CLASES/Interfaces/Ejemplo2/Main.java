package CLASES.Interfaces.Ejemplo2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate cumple1 = LocalDate.of(2000, 11, 23);
        LocalDate cumple2 = LocalDate.of(2004, 12, 22);

        ElementoComparable a1 = new Alumno("Juan Perez", cumple1, 23779, 1);
        Alumno a2 = new Alumno("Maria Garcia", cumple2, 23780, 3);
        System.out.println( a1.esMayor(a2) );
        System.out.println( a2.getNombre() );
        System.out.println( ((Alumno) a1).getNombre() );
    }
}
