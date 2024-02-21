package Ej3_Electoral;

import java.util.ArrayList;

public class CondicionPadron extends Condicion{
    Mesa m1;

    public CondicionPadron(Mesa m1) {
        this.m1 = m1;
    }

    @Override
    public boolean cumple(Votante vo) {
        return m1.loEncontre(vo);
    }
}
