package EjerciciosTipoParcial.src.recuCombos;

import java.util.ArrayList;

public abstract class ElementoBazar {
	
	public abstract ArrayList<String> getCategorias();
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<ElementoBazar> obtenerSiCumple(Condicion cond);
	public abstract int cantTotal();
	public abstract Producto productoMenorPeso();
	
}	

