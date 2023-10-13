package lol;

public class Champ {
    //atributos
    String nombre;
    String nacion;
    String recurso;
    Rol rol;

    public Champ(String nombre, String nacion, String recurso, Rol rol) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.recurso = recurso;
    }

    public Champ(String nombre) {
        this.nombre = nombre;
    }


}
