package FINALES.Final_9_Agosto_2024_Comidas;

public class FiltroCalorias extends Filtro{
    private int calorias;

    public FiltroCalorias(int calorias) {
        this.calorias = calorias;
    }

    public FiltroCalorias() {
        this.calorias = 400;
    }

    @Override
    public boolean cumplen(ElemAB elemAB) {
        return elemAB.getCalorias() < calorias;
    }
}
