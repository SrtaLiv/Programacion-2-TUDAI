package Ej_Futbol2.v1;

import java.util.ArrayList;

public class CondicionAlquilerMayor extends Condicion{

    // Atributos
    private double valor;

    // Constructor

    public CondicionAlquilerMayor(int valor) {
        this.valor = valor;
    }

    // Override

    @Override
    public boolean filtrar(Socio socio) {
        ArrayList<Alquiler> arrTemp = socio.getAlquileres();
        
        /*for (int i = 0; i < arrTemp.size(); i ++) {
            Alquiler tempAlq = arrTemp.get(i);
            if (tempAlq.getPago() > this.valor) {

            }
        }*/
        int i = 0;
        while (i < arrTemp.size() && arrTemp.get(i).getPago() <= this.valor) {
            i++;
        }

        return i < arrTemp.size();

    }
    
}
