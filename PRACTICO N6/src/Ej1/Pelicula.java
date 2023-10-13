package Ej1;

import java.time.LocalDate;

public class Pelicula extends Item {
    private String informacionFilmografica;
    private int cantidadCopias;
    public Pelicula(int codigo, String informacionFilmografica, int cantidadCopias) {
        super(codigo);
        this.informacionFilmografica = informacionFilmografica;
        this.cantidadCopias = cantidadCopias;
    }

    @Override
    protected void alquilar(LocalDate fechaDevolucion) {
        if(cantidadCopias > 0){
          cantidadCopias--;
         super.setFechaDevolucion(fechaDevolucion);
         super.setFechaAlquiler(LocalDate.now());
            System.out.println("Pelicula alquilada");
        }else
            System.out.println("No hay copias disponibles");
    }

    @Override
    protected void devolver() {
        super.setFechaDevolucion(null);
        super.setFechaAlquiler(null);
        cantidadCopias++;
        System.out.println("Pelicula devuelta");
    }
}
