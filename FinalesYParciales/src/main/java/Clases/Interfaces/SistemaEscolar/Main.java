package CLASES.Interfaces.SistemaEscolar;

public class Main {

    public static void main(String[] args) {
        SistemaEscuela sistema = new SistemaEscuela();
        Alumno pepe = new Alumno("123", "Laurenz", "Pepe");
        Alumno oli = new Alumno("1313", "Todesco", "Oli");
        Alumno lore = new Alumno("32234", "Perrone", "Lore");

        oli.addExamen(new ExamenEscrito("23", 10, 2));
        oli.addExamen(new ExamenEscrito("23", 10, 50));
        oli.addExamen(new ExamenEscrito("23", 10, 89));

        pepe.addExamen(new ExamenEscrito("23", 3, 3));

        lore.addExamen(new ExamenEscrito("23", 3, 32));

        sistema.addAlumno(oli);
        sistema.addAlumno(pepe);
        sistema.addAlumno(lore);

        System.out.println("Aprobados: " + sistema.cantAprobados() );


    }
}
