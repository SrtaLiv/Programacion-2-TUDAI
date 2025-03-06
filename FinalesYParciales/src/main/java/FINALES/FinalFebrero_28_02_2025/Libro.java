package FINALES.FinalFebrero_28_02_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends LibroAB{
    private int cantPaginas;
    private Socio socio; // si esta null no tiene duenio
    private ArrayList<String> caracteristicas; // Tapa dura, edicion limitada

    public Libro(int cantPaginas, Socio socio) {
        this.cantPaginas = cantPaginas;
        this.socio = socio;
        this.caracteristicas = new ArrayList<>();
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCantLibros() {
        return 1;
    }

    @Override
    public int getLibrosDisponibles(RequisitoEspecial ff) {
        if (this.socio != null && ff.cumple(this, this.socio)){
            return this.getCantLibros();
        }
        return 0;
    }

    public int getPorcentajeLibros(RequisitoEspecial ff){
        return this.getLibrosDisponibles(ff) / getCantLibros(); // creo q es redundante poner el
                                                            // dividido aca pq siempre es por uno pero bueno
                                                            // por las dudas(?
    }

    //libros con condiciones dadas
    @Override
    public ArrayList<Libro> solicitarLibro(Socio s, RequisitoEspecial ff) {
        ArrayList<Libro> libros = new ArrayList<>();
        if (ff.cumple(this, socio) && this.socio == null){
            libros.add(this);
        }
        return libros;
    }

}
