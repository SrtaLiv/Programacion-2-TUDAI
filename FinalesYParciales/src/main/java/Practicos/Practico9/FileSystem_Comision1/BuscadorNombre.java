package Practicos.Practico9.FileSystem_Comision1;

public class BuscadorNombre implements Buscador{

    private String palabra;

    public BuscadorNombre(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.contienePalabra(this.palabra);
        // return archivo.getNombre().contains(this.palabra);
    }
}
