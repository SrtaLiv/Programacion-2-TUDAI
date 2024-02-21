package Seleccion_de_Futbol;

import java.time.LocalDate;

public class Masajista extends Persona {
    int experiencia;
    String titulo;

    public Masajista(String nombreCompleto, int experiencia, String titulo
                     ,LocalDate fechaNacimiento,  String estado) {
        super(nombreCompleto, fechaNacimiento, "Masajista", estado);
        this.experiencia = experiencia;
        this.titulo = titulo;
    }

    public void imprimirDatos(){
        System.out.println("NOMBRE: " + getNombreCompleto() +
                "\nROL: " + getRol() +
                "\nTITULO: " + getTitulo() +
                "\nEXPERIENCIA:" + getExperiencia() +
                "\nFECHA DE NACIMIENTO: " + getFechaNacimiento()+
                "\nESTADO:" + getEstado());
        System.out.println("-------------------------");

    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
