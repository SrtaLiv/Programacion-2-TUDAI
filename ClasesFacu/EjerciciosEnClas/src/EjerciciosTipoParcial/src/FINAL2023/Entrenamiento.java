package EjerciciosTipoParcial.src.FINAL2023;

import java.util.ArrayList;

public class Entrenamiento extends EntrenamientoAB {
    String nombre;
    int duracion;
    int costoEnergetico;
    int intensidad;
    String actividad;

    //Constructor
    public Entrenamiento(String nombre, int duracion, int costoEnergetico,
                         int intensidad, String actividad) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costoEnergetico = costoEnergetico;
        this.intensidad = intensidad;
        this.actividad = actividad;
    }

    //Get y set
    @Override
    ArrayList<EntrenamientoAB> buscar(Filtro ff) {
        ArrayList<EntrenamientoAB> ent = new ArrayList<>();
        if (ff.cumple(this)){
            ent.add(this);
        }
        return ent;
    }

    @Override
    int getCosto() {
        return 0;
    }

    public int getDuracion() {
        return duracion;
    }


    public String getActividad() {
        return actividad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCostoEnergetico() {
        return costoEnergetico;
    }

    public void setCostoEnergetico(int costoEnergetico) {
        this.costoEnergetico = costoEnergetico;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
