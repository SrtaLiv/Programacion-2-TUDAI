package Practicos.practico2.EJ4.src;

public class Usuario {
    String nombre;
    int cantReservas;
    boolean socio;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.cantReservas = 0;
        this.socio = false;
    }

    //METODOS
    public void incrementarReservas(){
        cantReservas++;
    }
    public boolean esSocio(){
        return getCantReservas() >= 4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantReservas() {
        return cantReservas;
    }
    public void setCantReservas(int cantReservas) {
        this.cantReservas = cantReservas;
    }


    public void setSocio(boolean socio) {
        this.socio = socio;
    }
}
