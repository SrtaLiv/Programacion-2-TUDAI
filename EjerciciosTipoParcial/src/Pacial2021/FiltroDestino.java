package Pacial2021;

public class FiltroDestino extends Filtro {
        String destino;

    public FiltroDestino(String destino) {
        this.destino = destino;
    }

    @Override
        public boolean cumple(Viaje viaje) {
            return viaje.getCiudadDestino().equalsIgnoreCase(destino);
        }
    }

