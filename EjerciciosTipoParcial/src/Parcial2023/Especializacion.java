package Parcial2023;

import java.util.ArrayList;

public class Especializacion extends ContenidoEducativo{
    ArrayList<Curso> cursos;
    ArrayList<Especializacion> especializaciones;
    ArrayList<ContenidoEducativo> contenido;
    public Especializacion(String nombre, double precio, int notaMin, int cantHorasCatedra, ArrayList<String> palabrasClave) {
        super(nombre, precio, notaMin, cantHorasCatedra, palabrasClave);
        this.cursos = new ArrayList<>();
        this.especializaciones = new ArrayList<>();
        this.contenido = new ArrayList<>(); //lo pongo como 1 o lo separo?
    }

    //agregar curso y/o contenido?
    public void addContenidoEducativo(ContenidoEducativo c){
        contenido.add(c);
    }


    public void addCurso(Curso c){
        cursos.add(c);
    }

    public int getCantidadDeContenidos(){
        return contenido.size();
    }

    //curso=10- curso 20 - curso 8
    /*
    10 > -1 = true / contador = 10 / encontrado = curso10
    20>10? true / contador = 20 / encontrado = curso20
    8>20? false
     */

    //aca o en el sistema?
    public Curso cursoMaxCosto() {
        Curso cursoMax = null;
        double maxPrecio = -1.0; // Inicializa con un valor negativo para comparar con precios reales

        for (Curso curso : cursos) {
            if (curso.getPrecio() > maxPrecio) {
                maxPrecio = curso.getPrecio();
                cursoMax = curso;
            }
        }
        return cursoMax;
    }


    @Override
    public double getPrecio() {
        double precio = 0.0;
        for (int i = 0; i < contenido.size() ; i++ ) {
            precio += contenido.get(i).getPrecio();
        }
        return precio;
    }

    @Override //si todos los cursos estan aprobados retorno true
    public boolean aprobo() {
        for (int i = 0; i < cursos.size(); i++){
            if (!cursos.get(i).aprobo()){
                return false;
            }
        }
        return true;
    }

   public ArrayList<String> obtenerPalabrasClave(){
        ArrayList<String> palabrasEncontradas = new ArrayList<>();
        for (int i = 0; i < palabrasClave.size(); i++ ) {
            String palabra = palabrasClave.get(i);
            if (!palabrasEncontradas.contains(palabra)){ //no puede haber repetidos
                palabrasEncontradas.add(palabra);
            }
        }
        return palabrasEncontradas;
    }



}
