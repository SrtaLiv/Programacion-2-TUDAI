package recuConDelfi;

public class FiltroPeso extends Filtro{
    double peso;

    public FiltroPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Producto elem) {
        return elem.getPeso() > this.peso;
    }
}
