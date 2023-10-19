package Ej2_SistemaArchivos;

import java.time.LocalDate;

public class Archivo extends ElementoSA{

    public Archivo(String nombre, LocalDate fechaC, double tamanio) {
        super(nombre, fechaC, tamanio);
    }

    @Override
    public double getTamanio() {
        return 0;
    }

    @Override
    public int cantArchivos() {
        return 0;
    }
}
