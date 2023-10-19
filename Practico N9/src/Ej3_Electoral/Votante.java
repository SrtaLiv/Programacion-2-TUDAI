package Ej3_Electoral;

public class Votante {
    int dni;

    public Votante(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Votante{" +
                "dni=" + dni +
                '}';
    }
}
