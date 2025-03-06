package CLASES.Interfaces.Ejemplo2;

import java.time.LocalDate;

public class Persona {
    String nombre;
    LocalDate nacimiento;
    int id;

    public Persona(String nombre, LocalDate nacimiento, int id) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean esMayor(ElementoComparable persona) {
        try {
            Persona per = (Persona) persona;
            return this.getId() > per.getId();
        }catch (Exception e) {
            return false;
        }
    }

    public boolean equals(Object o) {
        try {
            Persona otra = (Persona) o;
            return this.getNombre().equals(otra.getNombre());
        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

    }

}
