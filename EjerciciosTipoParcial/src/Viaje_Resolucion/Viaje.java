package Viaje_Resolucion;

import java.time.LocalDate;

public class Viaje extends ElementoViaje{
    String origen;
    String destino;
    double costo;
    String datos;
    LocalDate fecha;

    public Viaje(String origen, String destino,
                 double costo, String datos, int id, int cantPersonas) {
        super(id, cantPersonas);
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.datos = datos;
        this.fecha = null;
    }

    @Override
    public String getOrigen() {
        return origen;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public LocalDate getFechaPago() {
        return fecha;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
