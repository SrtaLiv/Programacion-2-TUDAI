public class CalculadorPrecio extends CalculadorEditorial{
    double costoFijo;
    
    public CalculadorPrecio(double costoFijo){
        this.costoFijo = costoFijo;
    }

    public double calcularPrecio(Capitulo cap){
        return cap.getPaginas() * this.costoFijo;
    }
}