package Practicos.practico5.ej6_CongresoCiencias;

import java.util.ArrayList;

public class Trabajo {
    ArrayList<String> palabrasClave;
    Evaluador evaluador;

    public Trabajo() {
        this.palabrasClave = new ArrayList<>();
        this.evaluador = new Evaluador();
    }

    /*
    public void calificarEmpleado(){
        if (evaluador.esApto() && palabrasClave){

    }*/


    public void addPalabraClave(String palabra){
        this.palabrasClave.add(palabra);
    }

    public void removePalabraClave(String palabra){
        this.palabrasClave.remove(palabra);
    }

    public void showPalabrasClave(){
        for (int i = 0; i < palabrasClave.size(); i++){
            System.out.println(palabrasClave.get(i));
        }
    }

}
