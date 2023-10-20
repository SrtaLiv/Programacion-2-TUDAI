package Parcial2023;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SistemaEducacion sistema = new SistemaEducacion();

        //PALABRAS
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Java");
        palabras.add("Arreglos");
        palabras.add("Metodos");
        palabras.add("POO");

        ArrayList<String> webPalabra = new ArrayList<>();
        webPalabra.add("html");
        webPalabra.add("js");

        ArrayList<String> tmc = new ArrayList<>();
        tmc.add("Analisis matematico");
        tmc.add("Algebra lineal");


        //ESPECIALIZACIONES
        Especializacion java = new Especializacion("Programacion Java", 1000, 7, 100, palabras);
        Curso prog1 = new Curso("Programacion 1", 1000, 7, 50, palabras);
        Curso prog2 = new Curso("Programacion 2", 1000, 7, 100, palabras);
        Curso prog3 = new Curso("Programacion 3", 1000, 8, 150, palabras);
        java.addContenidoEducativo(prog1);
        java.addContenidoEducativo(prog2);
        java.addContenidoEducativo(prog3);

        Especializacion web = new Especializacion("Desarrollo Web", 500, 6, 20, webPalabra);
        web.addContenidoEducativo(new Curso("HTML BASICO", 50, 0, 8, webPalabra));
        web.addContenidoEducativo(new Curso("JS DESDE CERO", 50, 7, 20, webPalabra));

        Especializacion webFullStack = new Especializacion("Desarrollo Full Stack", 1500, 8, 100, palabras);
        webFullStack.addContenidoEducativo(new Curso("Bases de datos ", 1000, 7, 50, palabras));
        webFullStack.addContenidoEducativo(java);
        webFullStack.addContenidoEducativo(web);

        EspecializacionOptativa TMC = new EspecializacionOptativa("Taller de Matematicas", 3000, 4, 20, tmc);

        //ALUMNA
        Alumno al1 = new Alumno("Olivia", "Todesco");

        al1.agregarCurso(prog1, LocalDate.of(2023, 10, 20),10);
        al1.agregarCurso(prog2, LocalDate.of(2023, 10, 20),10);
        al1.agregarCurso(prog3, LocalDate.of(2023, 10, 22), 5);

        System.out.println(sistema.calcularPrecio(java));
        System.out.println(java.getPrecio());


        System.out.println(sistema.calcularPrecioPorAlumno(al1));
        System.out.println(sistema.obtenerCantidadDeCursos(web));
        System.out.println(sistema.cursoMaxCosto(web));
        System.out.println(sistema.buscar(new FiltroHorasCatedra(8)));

    }
}
