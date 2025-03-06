package FINALES.FinalFebrero_28_02_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int edad;
    private ArrayList<Prestamo> historialLibrosRetirados;
    private ArrayList<String> requisitosEspeciales;
    private LocalDate fechaPrestamo; // deberia setear el libro a prestado = True
    private LocalDate fechaDevolucion = null;  // deberia setear el libro a prestado = false cuando lo devuelve

    public Socio(String nombre, int edad, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.nombre = nombre;
        this.edad = edad;
        this.historialLibrosRetirados = new ArrayList<>();
        this.requisitosEspeciales = new ArrayList<>();
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Prestamo> getHistorialLibrosRetirados() {
        return historialLibrosRetirados;
    }

    public void setHistorialLibrosRetirados(ArrayList<Prestamo> historialLibrosRetirados) {
        this.historialLibrosRetirados = new ArrayList<>();
    }

    public ArrayList<String> getRequisitosEspeciales() {
        return new ArrayList<>(requisitosEspeciales);
    }

    public void setRequisitosEspeciales(ArrayList<String> requisitosEspeciales) {
        this.requisitosEspeciales = requisitosEspeciales;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
