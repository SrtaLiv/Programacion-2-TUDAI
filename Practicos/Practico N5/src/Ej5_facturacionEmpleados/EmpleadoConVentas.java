package Ej5_facturacionEmpleados;

public class EmpleadoConVentas extends Empleado{
    int ventasExtra;
    public EmpleadoConVentas(String nombre, String apellido, int dni, double sueldoMensual, int ventas, FormaPago fp) {
        super(nombre, apellido, dni, sueldoMensual, fp);
        this.ventasExtra = ventas;
    }

    @Override
    public String toString() {
        return "EMPLEADO: " + nombre + " " + apellido + " - " + dni + " - " + sueldoMensual + " - " + ventasExtra;
    }

    public int getVentasExtra() {
        return ventasExtra;
    }

    public void setVentasExtra(int ventasExtra) {
        this.ventasExtra = ventasExtra;
    }


}
