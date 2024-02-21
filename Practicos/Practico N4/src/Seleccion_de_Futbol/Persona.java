package Seleccion_de_Futbol;

import java.time.LocalDate;

public class Persona {

    //ME FALTO EL PASAPORTE PQ ME DIO PAJA!
    private String nombreCompleto;
    private String rol;
    private String estado;
    private LocalDate fechaNacimiento;



    public Persona(String nombreCompleto, LocalDate fechaNacimiento, String rol, String estado) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.estado = estado;

    }


    public void imprimirDatos(){
        System.out.println("nombre completo: " + getNombreCompleto() +
                            "\nRol:" + getRol());
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
