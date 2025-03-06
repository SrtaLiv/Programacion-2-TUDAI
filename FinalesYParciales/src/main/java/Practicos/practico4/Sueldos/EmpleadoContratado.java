package Practicos.practico4.Sueldos;

public class EmpleadoContratado extends Empleado{

    public EmpleadoContratado(int horas, int cantidadVentas) {
        super(horas, cantidadVentas);
        this.horas = getHoras();
        this.setNombre("por Comision");
        this.salario = getSalarioPorComision();
    }

}
