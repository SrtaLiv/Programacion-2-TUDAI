package Practicos.practico5.Ej2_sombrero;

public class Hogwart {
    public static void main(String[] args) {
        //FAMILIAS
        Familia weasley = new Familia("Weasley");
        Familia potter = new Familia("Potter");
        Familia malfoy = new Familia("Malfoy");


        //ALUMNOS
        Alumno al1 = new Alumno("Harry", potter);
        al1.addCualidad("Valiente");
        al1.addCualidad("Bondadoso");

        //CUALIDADES DE LOS ALUMNOS
        Alumno al2 = new Alumno("Draco", malfoy);
        al2.addCualidad("Malvado");
        al2.addCualidad("Ambicioso");

        Alumno al3 = new Alumno("Ron", weasley);
        Alumno al4 = new Alumno("George", weasley);

        //ASIGNAR MIEMBROS A LA FAMILIA
        potter.agregarMiembro(new Alumno("Olivia", potter));
        malfoy.agregarMiembro(al2);
        weasley.agregarMiembro(al3); //se puede agregar muchos a la vez?
        weasley.agregarMiembro(al4);

        potter.mostrarMiembros();
        malfoy.mostrarMiembros();
        weasley.mostrarMiembros();

        //SELECCIONAR CASA AL ALUMNO con el sombrero
        /*
        ¿quiero crear un sombrero? No voy a instanciar un sombrero

        asignarAlumno() quien se encarga? una interface?

        un for que recorra los miembros de la familia y la casa a la que pertenecen
         */

        //alumno tiene cualidad requerida?


    }


}