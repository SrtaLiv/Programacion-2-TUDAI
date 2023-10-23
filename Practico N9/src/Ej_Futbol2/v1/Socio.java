package Ej_Futbol2.v1;

import java.util.ArrayList;

public class Socio implements Comparable<Socio> {
    
    // Atributos
    private String nombre, apellido;
    private int edad;
    private boolean ultimaCuotaPaga;
    private ArrayList<Alquiler> alquiler;

    // Conctructor

    public Socio(String nombre, String apellido, int edad, boolean ultimaCuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuotaPaga = ultimaCuotaPaga;
        this.alquiler = new ArrayList<>();
    }

    // G && S

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isUltimaCuotaPaga() {
        return ultimaCuotaPaga;
    }

    public void setUltimaCuotaPaga(boolean ultimaCuotaPaga) {
        this.ultimaCuotaPaga = ultimaCuotaPaga;
    }

    public void addAlquiler(Alquiler nuevoAlquiler) {
        this.alquiler.add(nuevoAlquiler);
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<Alquiler>(this.alquiler);
    }

    // Comportamiento

    public int cantidadVecesCanchaAlquilada(int idCancha) {
        int contador = 0;
        for (int i = 0; i < this.alquiler.size(); i++ ) {
            Alquiler tempAlq = this.alquiler.get(i);
            if (tempAlq.getIdCancha() == idCancha) {
                contador++;
            }
        }
        return contador;
    }

    // Overrides
    @Override
    public int compareTo(Socio socio) {

        return this.getEdad() - socio.getEdad();
    }

    @Override
    public String toString() {
        return "\t> Nombre: " + this.nombre + "\n\t> Apellido: " + this.apellido +
            "\n\t> Edad: " + this.edad  + 
            "\n\t> Cuota paga: " + this.ultimaCuotaPaga +
            "\n\n";
    }
    

}
