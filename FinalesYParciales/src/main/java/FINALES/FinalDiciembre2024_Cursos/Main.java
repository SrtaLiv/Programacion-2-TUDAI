package FINALES.FinalDiciembre2024_Cursos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Especializacion especializacion1 = new Especializacion("Programacion en JAVA");

        Curso cursoJava = new Curso("Java Básico", 15000.0, 40);
        Curso cursoWeb = new Curso("Desarrollo Web Fullstack", 25000.0, 60);
        Curso cursoData = new Curso("Análisis de Datos con Python", 20000.0, 50);
        Curso cursoUX = new Curso("Diseño UX/UI", 8000, 45);

        cursoData.addPalabraClaveSinRepetir("JAVA");
        cursoData.addPalabraClaveSinRepetir("JAVA");
        cursoData.addPalabraClaveSinRepetir("BACKEND");

        especializacion1.addElemento(cursoWeb);
        especializacion1.addElemento(cursoJava);
        especializacion1.addElemento(cursoData);
        especializacion1.addElemento(cursoUX);

        Especializacion especializacionAvanzada = new Especializacion("Programacion en C++");
        Curso cursoUXAvanzado = new Curso("Diseño UX/UI Avanzado", 40000.0, 45);
        especializacionAvanzada.addElemento(cursoUXAvanzado);

        especializacion1.addElemento(especializacionAvanzada);

        //en curso data no deberia repetirse java
        for (String s : cursoData.getPalabrasClave()){
            System.out.println(s);
        }

        //curso mas caro es Curso ux avanzado
        System.out.println("el curso mas caro es: " + especializacion1.cursoMasCaro().getNombre());

        //cantidad de cursos q posee una especializacion
        int cant = especializacionAvanzada.getCantCursos();
        System.out.println(cant);

        System.out.println("Precio total: $" + especializacion1.calcularPrecio());

        Especializacion.setDiscount(0.03); // 3% de descuento por curso
        System.out.println("Precio total con nuevo descuento: $" + especializacion1.calcularPrecio());

        //copias completas
        Especializacion copia = new Especializacion("a");
        copia.addElemento(especializacion1);
        copia.addElemento(cursoUX);

        Filtro ff = new FiltroPrecio(10000);

        System.out.println(copia.getCopia(ff));

        Curso copia2 = new Curso("Diseño UX/UI Avanzado", 7999, 45);
        System.out.println(copia2.getCopia(ff));
    }


}
