package Practicos.practico4.Sueldos;

public class EmpleadoPorComision extends Empleado{
    public EmpleadoPorComision(int horas, int cantidadVentas) {
        super(horas, cantidadVentas);
        this.setNombre("Empleado Contratado");
        this.horas = horas;
        this.salario = getSalario();
    }
}
