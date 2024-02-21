package Ej5_facturacionEmpleados;

import java.util.ArrayList;

public class Empleado {
    FormaPago fp;
    String nombre;
    String apellido;
    int dni;
    double sueldoMensual;

    public Empleado(String nombre, String apellido, int dni, double sueldoMensual, FormaPago fp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
        this.fp = fp;
    }

    @Override
    public String toString() {
        return "EMPLEADO: " + nombre + " " + apellido + " - " + dni + " - " + sueldoMensual;
    }

    public double getSueldo() {
        return fp.calcularSueldo();
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setFormaPago(FormaPago fp) {
        this.fp = fp;
    }

    public FormaPago getFp() {
        return fp;
    }

    public void setFp(FormaPago fp) {
        this.fp = fp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
