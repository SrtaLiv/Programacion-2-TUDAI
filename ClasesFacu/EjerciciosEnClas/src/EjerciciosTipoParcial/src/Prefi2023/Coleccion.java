package EjerciciosTipoParcial.src.Prefi2023;

import java.util.ArrayList;

public class Coleccion extends ObjetoAB {
    ArrayList<ObjetoAB> elementos;
    public static double porcentaje = 0.1;

    public Coleccion(String nombre) {
        super(nombre); //nombre descriptivo es lo mismo?
        elementos = new ArrayList<>();
    }

    @Override
    public int getAnio() {
        int contador = 0;
        int cantElementos = 0;
        //año se calcula como el promedio
        //de los años de los elementos que contiene.
        for (ObjetoAB ob : elementos){
            contador += ob.getAnio();
            cantElementos += ob.getCantElementos();
        }
        return contador / cantElementos;
    }

    @Override
    //El valor estimado se calcula como la suma de
    //los valores de sus elementos, más un 0.1% por
    // cada objeto contenido (en cualquier nivel),
    //si bien el porcentaje puede cambiar a un futuro,
    // el mismo debe ser IGUAL para todas las
    //colecciones.
    public double getValorEstimado() {
        double suma = 0;
        for (ObjetoAB ob : elementos){
            suma += ob.getValorEstimado();
        }
        return suma + porcentaje;
    }

    @Override
    public int getPeso() {
        int peso = 0;
        for (ObjetoAB ob : elementos){
            peso += ob.getPeso();
        }
        return peso;
    }

    @Override
    public ArrayList<Objeto> cumple(Filtro ff) {
        ArrayList<Objeto> result = new ArrayList<>();
        for (ObjetoAB obj : elementos){
            result.addAll(obj.cumple(ff));
        }
        return result;
    }

    public boolean pertenece(Objeto ojb) {
        for (ObjetoAB ob : elementos){
            if (ob.pertenece(ojb))
                return true;
        }
        return false;
    }




}
