package Avicola;

import java.time.LocalDate;
import java.util.Date;

public class Fresco extends Producto{
    Date fechaDeEnvasado;
    String granjaDeOrigen;

    public Fresco(LocalDate fechaDeNacimiento, int numeroDeLote) {
        super(fechaDeNacimiento, numeroDeLote);
    }
}

