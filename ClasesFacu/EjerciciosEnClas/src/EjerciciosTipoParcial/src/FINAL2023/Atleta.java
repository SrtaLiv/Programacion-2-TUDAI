package EjerciciosTipoParcial.src.FINAL2023;

import java.util.ArrayList;

public class Atleta {
    String nombre;
    ArrayList<EntrenamientoAB> entrenamientoABS;
    double frecuenciaCardiaca;
    int cantCalorias;
    int pasos;
    ArrayList<Efecto> efectos;

    public Atleta(String nombre, double frecuenciaCardiaca,
                  int cantCalorias, int pasos) {
        this.nombre = nombre;
        this.entrenamientoABS = new ArrayList<>();
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.cantCalorias = cantCalorias;
        this.pasos = pasos;
        this.efectos = new ArrayList<>();
    }

    public void producirEfecto(Filtro ff, Efecto eff){
        for (EntrenamientoAB ent: entrenamientoABS){
            if (ff.cumple(ent)){ //ej mucha intensidad
                eff.efecto(this);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<EntrenamientoAB> getEntrenamientoABS() {
        return new ArrayList<>();
    }

    public void setEntrenamientoABS(ArrayList<EntrenamientoAB> entrenamientoABS) {
        this.entrenamientoABS = entrenamientoABS;
    }

    public double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public ArrayList<Efecto> getEfectos() {
        return efectos;
    }

    public void setEfectos(ArrayList<Efecto> efectos) {
        this.efectos = efectos;
    }
}
