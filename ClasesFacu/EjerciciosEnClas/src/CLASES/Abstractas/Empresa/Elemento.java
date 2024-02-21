package CLASES.Abstractas.Empresa;

public abstract class Elemento {
    String nombre;
    int anioFabricacion;

    public Elemento(String nombre, int anioFabricacion) {
        this.nombre = nombre;
        this.anioFabricacion = anioFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }



    public String toString(){
        return nombre + "-" + anioFabricacion;
    }
}
