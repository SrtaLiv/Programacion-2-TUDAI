package Ej8_MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Usuario {
    String nombre;
    LocalDate anioRegistro;
    String email;

    public Usuario(String nombre, LocalDate anioRegistro, String email) {
        this.nombre = nombre;
        this.anioRegistro = anioRegistro;
        this.email = email;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(LocalDate anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", anioRegistro=" + anioRegistro +
                ", email='" + email + '\'' +
                '}';
    }


}
