package Avicola;

import java.time.LocalDate;
import java.util.Date;

public class Refrigerado extends Producto{
    Date fechaDeEnvasado;
    int codigoDeSupervisionAlimentaria;
    String granjaDeOrigen;
    double temperaturaDeMantenimiento;

    public Refrigerado(LocalDate fechaDeNacimiento, int numeroDeLote) {
        super(fechaDeNacimiento, numeroDeLote);
    }




}
