package EjerciciosTipoParcial.src.ejAdicional;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contingente extends ElemAB{
    ArrayList<ElemAB> elementos;
    int asientos;

    public Contingente(String destino, LocalDate fPartida, LocalDate fRegreso) {
        super(destino, fPartida, fRegreso);
        elementos = new ArrayList<>();
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtroo ff) {
        ArrayList<ElemAB> result = new ArrayList<>();
        if (ff.cumple(this)){
            result.add(this);
        } else {
            for (ElemAB elem : elementos){
                result.addAll(elem.buscar(ff));
            }
        }
        return result;
    }

    @Override
    public double getPrecio() {
        double suma = 0;
        for (ElemAB elem : elementos){
            suma += elem.getPrecio();
        }
        return suma;
    }

    @Override
    public double getDeuda() {
        double suma = 0;
        for (ElemAB elem : elementos){
            suma += elem.getDeuda();
        }
        return suma;
    }


    public void addElemento(ElemAB elem){
        if (asientosLibres() > elem.cantPasajeros()){
            if (elem.getfPartida().equals(this.getfPartida()) &&
                    elem.getDestino().equals(this.getDestino())){
                elementos.add(elem);
        }
        }
    }

    public void addElementoRestringido(ElemAB elem, Filtroo ff){
        if (ff.cumple(this))
            elementos.add(elem);
    }

    public ArrayList<ElemAB> elementos(){
        return new ArrayList<>(elementos);
    }


    public int cantPasajeros(){
        int suma = 0;
        for (ElemAB elem : elementos){
            suma += elem.cantPasajeros();
        }
        return suma;
    }

    public int asientosLibres(){
        return asientos - cantPasajeros();
    }

    @Override
    public String getDestino() {
        return this.destino;
    }

    @Override
    public LocalDate getfPartida() {
        return this.fPartida;
    }

    @Override
    public LocalDate getfRegreso() {
        return this.fRegreso;
    }

    public Pasajero alumnoMayorDeuda(){
        Pasajero aux = null;
        double suma = 0;
        for (ElemAB elem : elementos){
            if (elem.getDeuda() > suma)
                suma = elem.getDeuda();
                aux = elem.alumnoMayorDeuda();
        }
        return aux;
    }

    @Override
    public ElemAB copia() {
        Contingente result = new Contingente(destino, fPartida, fRegreso);
        ArrayList<ElemAB> hijos = new ArrayList<>();
        for (ElemAB e : elementos){
            if (e != null){
                hijos.add(e.copia());
            }
        }
        if (hijos.size()>0){
            for (ElemAB h : hijos){
                result.addElemento(h);
            }
            return result;
        }
        return null;
    }



}
