package FINALES.Final20Diciembre2024;

import java.util.ArrayList;
import java.util.List;

public class ArchivoCompuesto extends Compuesto {
    private int compresion;
    private List<ElemAB> directorioABS;

    public ArchivoCompuesto(int compresion) {
        this.directorioABS = new ArrayList<>();
        this.compresion = compresion;
    }

    @Override
    public List<ElemAB> buscar(Filtro ff) {
        return List.of();
    }

    @Override
    public int calcularTamanio() {
        return super.calcularTamanio() + compresion;
    }

    public int getCompresion() {
        return compresion;
    }

    public void setCompresion(int compresion) {
        this.compresion = compresion;
    }

    public List<ElemAB> getDirectorioABS() {
        return new ArrayList<>(directorioABS);
    }

    public void setDirectorioABS(List<ElemAB> elemABS) {
        this.directorioABS = elemABS;
    }
}
