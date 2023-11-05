package Viaje_Resolucion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Superviaje extends ElementoViaje{
    ArrayList<ElementoViaje> elementos; //cualquier tipo de viaje o viajeCompuesto

    public Superviaje(int id, int cant) {
        super(id, cant);
        this.elementos = new ArrayList<>();
    }

    @Override
    public String getOrigen() { //origen: es el origen del PRIMER VIAJE.
        if (!elementos.isEmpty())
            return elementos.get(0).getOrigen();
        else return null;
    }

    @Override
    public String getDestino() {
        int size = elementos.size();
        if (size>0)
            return elementos.get(size-1).getDestino();
        else return null;
    }

    @Override
    public double getCosto() {
        double aux = 0;
        for (int i = 0; i < elementos.size(); i++){
            ElementoViaje hijo = elementos.get(i);
            aux += hijo.getCosto();
        }
        return aux;
    }

    @Override
    public LocalDate getFechaPago() {
        //devolver fecha mayir
        LocalDate mayor = LocalDate.of(1900,1,1); //para buscar una mayor a esta la inicializo en 1900
        for (int i = 0; i < elementos.size();i++){
            ElementoViaje hijo = elementos.get(i);
            LocalDate fecha = hijo.getFechaPago();
            if (fecha == null){ //no tiene fecha de pago
                return null;
            } else {
                if (fecha.compareTo(mayor)>0){
                    //if (fecha.isAfter(mayor))
                    mayor = fecha;
                    //no poner return aca asi recorre el for
                }
            }
        }
        return mayor;
    }

    public void addPaquete(ElementoViaje paquete){
        if (paquete.getCantPersonas() == this.getCantPersonas()){
            if (elementos.size() == 0){
                elementos.add(paquete);
            } else {
                if (this.getDestino().equals(paquete.getOrigen()))
                    elementos.add(paquete);
            }
        }
    }

}
