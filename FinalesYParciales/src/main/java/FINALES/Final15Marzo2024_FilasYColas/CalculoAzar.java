package FINALES.Final15Marzo2024_FilasYColas;

public class CalculoAzar extends Calculador{

    @Override
    public ColaAbstracta calcular(ColaCompuesta cola) {
        int indice = (int) Math.floor(Math.random() * cola.getColas().size());
        return cola.getColas().get(indice);
    }

}
