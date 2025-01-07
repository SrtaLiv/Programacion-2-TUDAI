package FINALES.Final1Diciembre2024;

import java.util.ArrayList;

public class Miembro {
    private int altura;
    private String habilidadPrincipal;
    private ArrayList<String> metalesFavoritos;
    private String nombre;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getHabilidadPrincipal() {
        return habilidadPrincipal;
    }

    public void setHabilidadPrincipal(String habilidadPrincipal) {
        this.habilidadPrincipal = habilidadPrincipal;
    }

    public ArrayList<String> getMetalesFavoritos() {
        return metalesFavoritos;
    }

    public void setMetalesFavoritos(ArrayList<String> metalesFavoritos) {
        this.metalesFavoritos = metalesFavoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
