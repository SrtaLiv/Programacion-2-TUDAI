package Practicos.practico4.Seleccion_de_Futbol;

import java.time.LocalDate;

public class Futbolista extends Persona{
    char mano;
    int goles;
    String posicion;


    public Futbolista(String nombreCompleto, LocalDate fechaNacimiento, char mano, int goles, String posicion
    , String estado) {
        super(nombreCompleto, fechaNacimiento, "futbolista", estado);
        this.mano = mano;
        this.goles = goles;
        this.posicion = posicion;
    }

    public void imprimirDatos(){
        System.out.println("NOMBRE: " + getNombreCompleto() +
                            "\nROL: " + getRol() +
                            "\nMANO: " + getMano() +
                            "\nGOLES:" + getGoles() +
                            "\nFECHA DE NACIMIENTO: " + getFechaNacimiento() +
                            "\nESTADO:" + getEstado());
        System.out.println("-------------------------");
    }


    public char getMano() {
        return mano;
    }

    public void setMano(char mano) {
        this.mano = mano;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


}
