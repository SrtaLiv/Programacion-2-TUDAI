package Practicos.Practico6.Ej1;

import java.time.LocalDate;

public abstract class Item {

    protected int codigo;
        protected LocalDate fechaDevolucion;
        protected LocalDate fechaAlquiler;

    public Item(int codigo) {
        this.codigo = codigo;
        this.fechaDevolucion = null;
        this.fechaAlquiler = null;
    }

    protected abstract void alquilar(LocalDate fechaDevolucion);

    protected boolean estaVencido(LocalDate fechaActual){
        if(fechaActual.isAfter(fechaDevolucion))
            return true;
        else
            return false;
    }
    protected abstract void devolver();


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
}
