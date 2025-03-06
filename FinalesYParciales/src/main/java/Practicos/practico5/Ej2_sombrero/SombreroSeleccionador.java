package Practicos.practico5.Ej2_sombrero;

import java.util.ArrayList;

public abstract class SombreroSeleccionador{
    Alumno alumno;
    ArrayList<String> cualidades;
    Casa gry;
    Casa sly;
    ArrayList<Casa> casitas;
    boolean enemistad;

    public SombreroSeleccionador(Alumno alumno) {
        this.alumno = alumno;
        cualidades = getCualidades();

        this.gry = new Casa("Gryffindor");
        this.sly = new Casa("Slytherin");
    }
/*
    public void seleccionarCasa(){
        for (int i=0; i<5; i++){
            if (esGryffindor() && (!esEnemistad(alumno.getFamilia()))){
                System.out.println("PERTENECE A GRIFFYNDOR!");
            }
        }
    }*/
    public boolean esGryffindor(){
        return (alumno.getCualidades().equals("Valiente"));
    }

    public boolean esSlytherin(){
        return (alumno.getCualidades().equals("Ambicion"));
    }

/*
    public boolean esEnemistad(Familia familia){
        if (familia. .equals(this.sly)){

        }
       return true;
    }

*/

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }



}
