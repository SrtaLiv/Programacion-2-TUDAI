package ej6_CongresoCiencias;

import java.util.ArrayList;

public class Evaluador{
    ArrayList<String> conocimientos;
    public Evaluador() {
        this.conocimientos = new ArrayList<>();
    }

    public void mostrarEvaluador(){
        showConocimientos();
        if (esApto()){
            System.out.println("EXPERTO");
        }

    }
    public void addConocimientos(String conocimiento){
        this.conocimientos.add(conocimiento);
    }

    public boolean esApto(){
        return conocimientos.contains("Programacion");
    }

    public void showConocimientos(){
        for (int i = 0; i< conocimientos.size(); i++){
            System.out.println(conocimientos.get(i));
        }
    }


    //si el evaluador conoce algoritmos asignar a articulo
}
