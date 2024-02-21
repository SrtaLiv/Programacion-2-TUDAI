package Ej5_facturacionEmpleados;

public class SueldoExtra extends FormaPago{
    public static final int VENTAS_REQUERIDAS = 50;
    public static final int BONO = 1000;
    int ventas;
    double sueldo;
    public double calcularSueldo(){
        if (ventas > VENTAS_REQUERIDAS){
            return ventas*sueldo+BONO;
        } else return ventas*sueldo;
    }

}
