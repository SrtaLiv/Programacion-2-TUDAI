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

    public void addContenidoEducativo(ContenidoEducativo c){
        contenido.add(c);
    }

    public int getCantidadDeCursos(){
        return cursos.size();
    }

    //curso=10- curso 20 - curso 8
    /*
    10 > -1 = true / contador = 10 / encontrado = curso10
    20>10? true / contador = 20 / encontrado = curso20
    8>20? false
     */

    //aca o en el sistema?
    public Curso cursoMaxCosto(){
        Curso cursoMax = null;
        int contador = -1;
        for (int i = 0; i < cursos.size(); i++){
            if (cursos.get(i).getPrecio() > contador){
                contador = (int) cursos.get(i).getPrecio();
                cursoMax = cursos.get(i);
            }
        }
        return cursoMax;
    }

    @Override
    public double getPrecio() {
        int precio = 10;
        for (int i = 0; i < cursos.size(); i++ ) {
            precio += cursos.get(i).getPrecio();
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
