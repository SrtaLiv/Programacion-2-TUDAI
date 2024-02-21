package EjerciciosTipoParcial.src.Prefi2023;

import java.time.LocalDate;

public class ObjetoDigital extends Objeto{
    public ObjetoDigital(String nombre, String marca, int anio, double valor, int peso) {
        super(nombre, marca, anio, valor, peso);
    }

    public LocalDate getFecha(){
        return LocalDate.now();
    }
}
