package Practicos.practico4.Avicola;

import java.time.LocalDate;
import java.util.Date;

public class Producto {
    private LocalDate fechaDeNacimiento;
    private int numeroDeLote;

    public Producto(LocalDate fechaDeNacimiento, int numeroDeLote) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numeroDeLote = numeroDeLote;
    }

    public void imprimir(){
        System.out.println("Fecha de nacimiento " + getFechaDeNacimiento() +"\n"+
                "Numero de lote " + getNumeroDeLote()); ;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public static void main(String[] args) {
        Congelado p1 = new Congelado(LocalDate.of(2000, 3, 3), 23);
        p1.imprimir();
    }

}
