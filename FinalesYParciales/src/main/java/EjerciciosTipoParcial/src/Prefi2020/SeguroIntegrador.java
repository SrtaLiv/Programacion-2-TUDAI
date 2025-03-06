package EjerciciosTipoParcial.src.Prefi2020;

import java.util.ArrayList;

public class SeguroIntegrador extends SeguroAB {
    ArrayList<SeguroAB> elementos;

    //El monto asegurado de un seguro integrador
    // se calcula como la suma de todos los seguros
    //que contiene.
    @Override
    public int getMonto() {
        int suma = 0;
        for (SeguroAB elem : elementos){
            suma += elem.getMonto();
        }
        return 0;
    }

    //número de póliza de un seguro integrador queda
    // determinado por el mayor número de
    //póliza de los seguros que contiene.
    @Override
    public int getNroPoliza() {
        int nroMayorPoliza = -1;
        for (SeguroAB elem : elementos){
            if (elem.getNroPoliza() > nroMayorPoliza){
                nroMayorPoliza = elem.getNroPoliza();
            }
        }
        return 0;
    }

    @Override
    public int getCosto() {
        int suma = 0;
        for (SeguroAB elem : elementos){
            suma += elem.getCosto();
        }
        return 0;
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Filtro ff) {
        ArrayList<SeguroSimple> result = new ArrayList<>();
        for (SeguroAB elem : elementos){
            result.addAll(elem.buscar(ff));
        }
        return result;
    }
}
