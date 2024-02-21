package EjerciciosTipoParcial.src.ejAdicional;

import java.time.LocalDate;

public class ContingenteJubilado extends Contingente{
    public ContingenteJubilado(String destino, LocalDate fPartida, LocalDate fRegreso) {
        super(destino, fPartida, fRegreso);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() / cantPasajeros();
    }
}
