package Ej1;

import java.time.LocalDate;

public class Vehiculo extends Item {
    private String marca;
    private int km;
    private String patente;
    private String combustible;
    public Vehiculo(int codigo,String marca, int km, String patente, String combustible) {
        super(codigo);
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.combustible = combustible;
    }

    @Override
    protected void alquilar(LocalDate fechaDevolucion) {
         if(estaDisponible()) {
             super.setFechaDevolucion(fechaDevolucion);
             super.setFechaAlquiler(LocalDate.now());
             System.out.println("Vehiculo alquilado");
         }else
             System.out.println("Vehiculo no disponible");
    }


    public boolean estaDisponible(){
     if(super.getFechaDevolucion() == null)
         return true;
     else
         return false;
    }

    @Override
    protected void devolver() {
        super.setFechaDevolucion(null);
        super.setFechaAlquiler(null);
        System.out.println("Vehiculo devuelta");
    }
}
