package Clases.Abstractas.SistemaArchivos;
import java.time.LocalDate;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fCreacion;
    private CLASES.Abstractas.SistemaArchivos.Carpeta contenedor = null;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CLASES.Abstractas.SistemaArchivos.Carpeta getContenedor() {
        return contenedor;
    }

    public void setContenedor(CLASES.Abstractas.SistemaArchivos.Carpeta contenedor) {
        this.contenedor = contenedor;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public String toString(){
        return this.nombre;
    }

    public abstract double getTamanio();
    public int cantElementos(){
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        ElementoSA otro = (ElementoSA) o;
        try{
            return otro.getNombre().equals(this.getNombre());
        }
        catch (Exception e){
            return false;
        }
    }

}
