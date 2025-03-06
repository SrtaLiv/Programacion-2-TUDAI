package FINALES.FinalDiciembre2024_Cursos;

import java.util.List;

public class EspecializacionPremium extends Especializacion{

    public EspecializacionPremium(String nombre) {
        super(nombre);
    }

    /**
     * DUDA: los atributos estaticos se heredan?
     *
     * No, los atributos estáticos no se heredan en el sentido tradicional como los
     * atributos de instancia. Sin embargo,
     * las clases hijas pueden acceder a los atributos estáticos de la clase padre, ya que estos pertenecen a la clase en sí y no a las instancias.
     */


    public double calcularPrecio(){
        double result = 0;
        for (ElemAB elem : getElems()){
            result += elem.calcularPrecio();
        }
        return result;
    }



}
