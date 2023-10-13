package Ej4;

public class Contacto {
    String nombre;
    String apellido;
    int edad;
    int numeroTel;
    String ciudad;

    public Contacto(String nombre, String apellido, int edad, int numeroTel, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTel = numeroTel;
        this.ciudad = ciudad;
    }

    public void mostrarInformacion(){
        System.out.println("INFORMACION DEL CONTACTO" +
                "\nNOMBRE: " + getNombre() +
                "\nAPELLIDO: " + getApellido() +
                "\nEDAD: " + getEdad() +
                "\nNUMERO TELEFONICO: " + getNumeroTel() +
                "\nCIUDAD: " + getCiudad());
    }

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

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
