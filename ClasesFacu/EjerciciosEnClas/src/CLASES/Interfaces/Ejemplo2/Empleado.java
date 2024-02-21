package CLASES.Interfaces.Ejemplo2;

import java.time.LocalDate;

public class Empleado extends Persona implements ElementoComparable{
    LocalDate fechaIngreso;
    double sueldoBasico;

    public Empleado(String nombre, LocalDate nacimiento,  int id,
                    LocalDate fechaIngreso, double sueldoBasico) {
        super(nombre, nacimiento, id);
        this.fechaIngreso = fechaIngreso;
        this.sueldoBasico = sueldoBasico;
    }

    public LocalDate getAntiguedad() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldoBruto() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public boolean esMayor(ElementoComparable elemento) {
        return elemento.esMayor(elemento);
    }
}
