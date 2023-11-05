package recuHechoDelfi;

import recuHechoDelfi.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoBZ {
	Producto contenedor = null;
	public abstract ArrayList<String> getCategorias();
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<ElementoBZ> obtenerSiCumple(Condicion cond);
	public abstract int cantTotal();
	public abstract Producto productoMenorPeso();
	public abstract ElementoBZ copia();
	public abstract ElementoBZ copia(Condicion cond);

	public Producto getContenedor() {
		return contenedor;
	}
	public void setContenedor(Combo contenedor) {
	//	this.contenedor = contenedor;
	}
}

