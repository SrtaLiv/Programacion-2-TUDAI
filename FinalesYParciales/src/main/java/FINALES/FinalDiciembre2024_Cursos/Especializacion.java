package FINALES.FinalDiciembre2024_Cursos;

import EjerciciosTipoParcial.src.Recu2021Combo.Producto;
import EjerciciosTipoParcial.src.Recu2021Combo.ProductoAB;

import java.util.ArrayList;
import java.util.List;

public class Especializacion extends ElemAB {
    private List<ElemAB> elems;
    private static double discount = 0.02; // 2% de descuento por curso
    private static double tope_discount = 0.50; // Máximo descuento del 50%;

    public Especializacion(String nombre) {
        super(nombre);
        this.elems = new ArrayList<>();
    }

    public Curso cursoMasCaro() {
        double price = 0;
        Curso curso = null;
        for (ElemAB elem : elems) {
            double mayorPrecio = elem.calcularPrecio();
            Curso cursoAux = elem.cursoMasCaro();

            if (mayorPrecio > price) {
                price = mayorPrecio;
                curso = cursoAux;
            }
        }
        return curso;
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 0;

        // Sumar el precio de todos los elementos dentro de la especialización
        for (ElemAB elem : elems) {
            precioBase += elem.calcularPrecio();
        }

        int cantidadCursos = getCantCursos();
        double descuentoTotal = precioBase * (discount * cantidadCursos);

        // Limitar el descuento al tope permitido
        double descuentoAplicado;
        if (descuentoTotal > precioBase * tope_discount) { //si desctTotal es > 50% al tope
            descuentoAplicado = precioBase * tope_discount; //hago el descuento
        } else { //si el descuento total es menor, solo hago descuento total
            descuentoAplicado = descuentoTotal;
        }

        // Retornar el precio final con el descuento aplicado
        return precioBase - descuentoAplicado;
    }


    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> result = new ArrayList<>();
        for (ElemAB elem : elems) {
            ArrayList<String> aux = new ArrayList<>();
            aux.addAll(elem.getPalabrasClave());

            for (String ss : aux) {
                if (!result.contains(ss)) {
                    result.add(ss);
                }
            }
        }
        return result;
    }

    @Override
    public ArrayList<String> getDocentesACargo() {
        ArrayList<String> result = new ArrayList<>();
        for (ElemAB elem : elems) {
            ArrayList<String> aux = new ArrayList<>();
            aux.addAll(elem.getDocentesACargo());

            for (String ss : aux) {
                if (!result.contains(ss)) {
                    result.add(ss);
                }
            }
        }
        return result;
    }


    @Override
    public int getCantHoras() {
        int calc = 0;
        for (ElemAB elem : elems) {
            calc += elem.getCantHoras();
        }
        return calc;
    }

    @Override
    public int getCantCursos() {
        int calc = 0;
        for (ElemAB elem : elems) {
            calc += elem.getCantCursos();
        }
        return calc;
    }

    @Override
    public ElemAB getCopia(Filtro ff) {
        ArrayList<ElemAB> result = new ArrayList<>(); //cursos q cumplen
        for (ElemAB hijo : elems) {
                result.add(hijo.getCopia(ff)); //hijos copia
        }
        if (!result.isEmpty()) { //agrego los hijos a la copia
            Especializacion especializacion = new Especializacion(getNombre());
            for (ElemAB elem : result) {
                if (elem!=null){
                    especializacion.addElemento(elem);
                }
            }
            return especializacion;
        }
        return null;
    }

    public void addElemento(ElemAB elem) {
        elems.add(elem);
    }

    public List<ElemAB> getElems() {
        return new ArrayList<>(elems);
    }

    public void setElems(List<ElemAB> elems) {
        this.elems = elems;
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        Especializacion.discount = discount;
    }

    public static double getTope_discount() {
        return tope_discount;
    }

    public static void setTope_discount(double tope_discount) {
        Especializacion.tope_discount = tope_discount;
    }

    @Override
    public String toString() {
        return "Especializacion{" +
                "elems=" + elems +
                '}';
    }
}


