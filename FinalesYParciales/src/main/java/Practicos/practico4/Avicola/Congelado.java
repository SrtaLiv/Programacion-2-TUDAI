package Practicos.practico4.Avicola;

import java.time.LocalDate;
import java.util.Date;

public class Congelado extends Producto{
    Date fechaDeEnvasado;
    int codigoSupervisionAlimentaria;
    String granjaDeOrigen;
    double temperaturaDeMantenimiento;

    public Congelado(LocalDate fechaDeNacimiento, int numeroDeLote) {
        super(fechaDeNacimiento, numeroDeLote);
    }
}
