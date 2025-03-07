package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Link extends ElemAB{
    private ElemAB elem;
    private final static int TAMANIO = 1;

    public Link(ElemAB elem, LocalDate localDate) {
        super("Acceso directo a " + elem.getNomrbe(), localDate);
        this.elem = elem;
    }

    public ElemAB getElem() {
        return elem;
    }

    public void setElem(ElemAB elem) {
        this.elem = elem;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> elemABS = new ArrayList<>();
        if (ff.cumple(this)){
            elemABS.add(this);
        }
        return elemABS;
    }

    @Override
    public int getTamanio() {
        return TAMANIO;
    }
}
