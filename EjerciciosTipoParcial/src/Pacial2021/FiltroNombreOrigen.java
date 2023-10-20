package Pacial2021;

public class FiltroNombreOrigen extends Filtro {

    String nombre;

    public FiltroNombreOrigen(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Viaje viaje) {
        return viaje.getCiudadOrigen().equalsIgnoreCase(nombre);
    }
}
