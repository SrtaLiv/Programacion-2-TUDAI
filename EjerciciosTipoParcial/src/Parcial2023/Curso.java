package Parcial2023;

import java.time.LocalDate;
import java.util.ArrayList;

public class Curso extends ContenidoEducativo{
    boolean aprobado;

    public Curso(String nombre, double precio, int notaMin, int cantHorasCatedra, ArrayList<String> palabrasClave) {
        super(nombre, precio, notaMin, cantHorasCatedra, palabrasClave);
        boolean aprobado = false;
    }

    @Override
    public double getPrecio() {
        if (aprobado){
            return 0.0;
        }
        return this.precio;
    }

    public void aprobarCurso(int nota){
        if (nota >= this.getNotaMin()){
            this.aprobado = true;
        }
        else this.aprobado = false;
    }

    @Override
    public boolean aprobo() {
        return aprobado; //no estoy segura..
    }




}
