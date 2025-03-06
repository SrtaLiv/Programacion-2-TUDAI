package Practicos.practico4.Sueldos;

public class EmpleadoHoraExtra extends Empleado{

    public EmpleadoHoraExtra(int horas, int cantidadVentas) {
        super(horas, cantidadVentas);
        setHoras(horas);
        this.setNombre("Empleado por Horas Extras");
        this.setCantidadVentas(cantidadVentas); //no son importantes
        this.setSalario(getSalario()*horas);
    }
}
