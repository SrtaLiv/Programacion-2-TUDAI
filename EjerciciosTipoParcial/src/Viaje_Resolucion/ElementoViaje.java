package Viaje_Resolucion;

import java.time.LocalDate;

public abstract class ElementoViaje {
    int id; //Atributos en comun
    int cantPersonas;

    public ElementoViaje(int id, int cantPersonas) {
        this.id = id;
        this.cantPersonas = cantPersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    //no hace falta ponerlos como atributo
    public abstract String getOrigen();
    public abstract String getDestino();
    public abstract double getCosto();
    public abstract LocalDate getFechaPago();

}
