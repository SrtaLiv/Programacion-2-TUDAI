package Practicos.practico4.Seleccion_de_Futbol;

import java.time.LocalDate;

public class Entrenador extends Persona{
    int idFederacion;

    public Entrenador(String nombreCompleto, LocalDate fechaNacimiento, int idFederacion, String estado) {
        super(nombreCompleto, fechaNacimiento, "Entrenador", estado);
        this.idFederacion = idFederacion;
    }


    public void imprimirDatos(){
        System.out.println("NOMBRE: " + getNombreCompleto() +
                "\nROL: " + getRol() +
                "\nID FEFERACION: " + getIdFederacion() +
                "\nFECHA DE NACIMIENTO: " + getFechaNacimiento());
        System.out.println("-------------------------");

    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}
