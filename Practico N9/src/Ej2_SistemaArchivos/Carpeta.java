package Ej2_SistemaArchivos;
import java.time.LocalDate;

public class Carpeta extends ElementoSA{
    public Carpeta(String nombre, LocalDate fechaC, double tamanio) {
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
