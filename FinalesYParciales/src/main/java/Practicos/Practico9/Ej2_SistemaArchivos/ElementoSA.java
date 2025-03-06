package Practicos.Practico9.Ej2_SistemaArchivos;

import java.time.LocalDate;

public abstract class ElementoSA {
    String nombre;
    LocalDate fechaC;

    public ElementoSA(String nombre, LocalDate fechaC, double tamanio) {
        this.nombre = nombre;
        this.fechaC = fechaC;
    }

    public abstract double getTamanio();
    public abstract int cantArchivos();

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

}
