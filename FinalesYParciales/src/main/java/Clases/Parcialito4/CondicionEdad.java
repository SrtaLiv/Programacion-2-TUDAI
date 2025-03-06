package Clases.Parcialito4;

public class CondicionEdad extends Condicion{
    int edad;

    public CondicionEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getEdadMin() > this.edad ;
    }
}
