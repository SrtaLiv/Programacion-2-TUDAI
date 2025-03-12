package FINALES.Final_Diciembre_2024_Trajes;

public class EquipoTacticoEspacial extends EquipoTactico{

    public EquipoTacticoEspacial(String nombre) {
        super(nombre);
    }

    //El primer talle de los elementos
    public int getTalle(){
        return elementos.getFirst().getTalle();
    }

}
