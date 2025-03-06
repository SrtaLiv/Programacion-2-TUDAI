package Practicos.Practico9.Ej8_MisVideos;

public class FiltroPalabra extends Filtro{
    String palabra;

    public FiltroPalabra(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Video elem) {
        return elem.getPalabrasClave().contains(palabra);
    }
}
