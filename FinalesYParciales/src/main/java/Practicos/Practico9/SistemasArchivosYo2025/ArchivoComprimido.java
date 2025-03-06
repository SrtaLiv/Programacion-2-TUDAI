package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivoComprimido extends Directorio{
    private int tasaCompresion;

    public ArchivoComprimido(int tasaCompresion, String nombre, LocalDate fecha) {
        super(nombre, fecha);
        this.tasaCompresion = tasaCompresion;
    }

    public ArrayList<ElemAB> buscar(Filtro ff){
        ArrayList<ElemAB> elemABS = new ArrayList<>();
        for (ElemAB elem : getElems()){
            if (ff.cumple(elem)){
                elemABS.add(this);
                return elemABS;
            }
        }
        return elemABS;
    }

    public int getTamanio(){
        return super.getTamanio() / tasaCompresion;
    }

    public String getTasaCompresion() {
        return tasaCompresion + "KB";
    }

    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }
}
