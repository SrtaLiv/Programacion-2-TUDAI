package Parcial2023;

import java.util.ArrayList;

public class SistemaEducacion {

    ArrayList<Alumno> alumnos;
    ArrayList<ContenidoEducativo> contenido;

    public SistemaEducacion() {
        this.alumnos = new ArrayList<>();
        this.contenido = new ArrayList<>();
    }

    public void addContenido(ContenidoEducativo c){
        contenido.add(c);
    }

    public double calcularPrecio(ContenidoEducativo c){
        return c.getPrecio();
    }

    //

    public double calcularPrecioPorAlumno(Alumno al){;
        double precio = 0.0;
        for (int i = 0 ; i < al.cursosRendidos.size() ; i++){
            if (al.aprobado){
                precio += 0;
            } else precio += al.getCursosRendidos().get(i).getPrecio();
        }
        return precio;
    }

    /*
    public boolean aproboElCurso(Alumno al){
        ArrayList<ContenidoEducativo> aprobado = new ArrayList<>();
        for (int i = 0; i< al.cursosRendidos.size(); i++){
        //    if (al.getCursosRendidos().get(i))
        }
    }*/

    public int obtenerCantidadDeCursos(Especializacion esp){
        return esp.getCantidadDeContenidos();
    }

    public Curso cursoMaxCosto(Especializacion esp){
        return esp.cursoMaxCosto();
    }

    public ArrayList<ContenidoEducativo> buscar(Filtro f){
        ArrayList<ContenidoEducativo> encontradas = new ArrayList<>();
        for (int i = 0; i < contenido.size() ; i++){
            if (f.cumple(contenido.get(i))){
                encontradas.add(contenido.get(i));
            }
        }
        return encontradas;
    }

    public int obtenerCantidadHorasCatedra(){
        int contador = 0;
        for (int i = 0; i < contenido.size(); i++ ) {
            contador += contenido.get(i).getCantHorasCatedra();
        }
        return contador;
    }



}
