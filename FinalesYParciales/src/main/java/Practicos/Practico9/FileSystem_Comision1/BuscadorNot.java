package Practicos.Practico9.FileSystem_Comision1;

public class BuscadorNot implements Buscador{

    private Buscador buscador;

    public BuscadorNot(Buscador buscador) {
        this.buscador = buscador;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return !this.buscador.cumple(archivo);
    }
}
