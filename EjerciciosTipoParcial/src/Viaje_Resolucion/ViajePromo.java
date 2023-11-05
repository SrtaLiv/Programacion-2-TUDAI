package Viaje_Resolucion;

import java.time.LocalDate;

public class ViajePromo extends Viaje{
    LocalDate fInicio;
    LocalDate fFin;
    double descuento;

    public ViajePromo(String origen, String destino, double costo, String datos, int id, int cantPersonas) {
        super(origen, destino, costo, datos, id, cantPersonas);
    }

    public double getCosto(){ //ya tengo getCosto en viaje
        if (this.getFechaPago()!=null){
            if (this.getFechaPago().isBefore(fFin) &&
                    this.getFechaPago().isAfter(fInicio)); //se puede con compareto
        return super.getCosto()*descuento;
        }
        return super.getCosto();
    }
}
