package Pacial2021;
import java.util.ArrayList;
public class PaqueteSuperViaje extends Viaje{

    ArrayList<Viaje> viajes;

    public PaqueteSuperViaje(int id) {
        super(id);
        this.viajes = new ArrayList<>();

    }

    ////paquete Superviaje: origen vaiej 1 desitno = origen viaje 2 destino = origen viaje 3 destino

    public String obtenerCiudadDestino(){
        int ultimaPosicion = viajes.size()-1;
        String destino = viajes.get(ultimaPosicion).ciudadDestino;
        return destino;
    }

    /*public LocalDate ultimaFecha(){
        LocalDate ultimaFecha = null;
        int ultimo = viajes.size();
        System.out.println(ultimo);
        ultimaFecha = viajes.get(ultimo).getFechaPago();
        return ultimaFecha;
    }*/

   public void agregarViaje(Viaje viajeNuevo){
       if(viajes.size()==0)
       {
           this.ciudadOrigen = viajeNuevo.getCiudadOrigen();
           this.ciudadDestino = viajeNuevo.getCiudadDestino();
           this.costo += viajeNuevo.getCosto();
           viajes.add(viajeNuevo);
           this.datosAlojamiento = viajeNuevo.getDatosAlojamiento();
           this.cantidadMiembros = viajeNuevo.getCantidadMiembros();
           this.fechaPago = viajeNuevo.getFechaPago();
       }
       else {
           int posicion = viajes.size() - 1;
           if (obtenerCiudadDestino().equalsIgnoreCase(viajeNuevo.ciudadOrigen)) {
               if (viajes.get(posicion).cantidadMiembros == viajeNuevo.getCantidadMiembros()) {
                   this.ciudadDestino = viajeNuevo.getCiudadDestino();
                   this.costo += viajeNuevo.getCosto();
                   viajes.add(viajeNuevo);
                   this.fechaPago = viajeNuevo.getFechaPago();
               } else {
                   System.out.println("No cumple la misma cantidad de miembros.");
               }

           } else {
               System.out.println("El viaje que usted quiere incorporar no tiene el mismo origen que el destino del ultimo");
           }
       }
    }

}
