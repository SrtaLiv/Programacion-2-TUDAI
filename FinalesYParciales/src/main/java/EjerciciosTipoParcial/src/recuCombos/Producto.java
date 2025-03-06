package EjerciciosTipoParcial.src.recuCombos;

import java.util.ArrayList;

public class Producto extends ElementoBazar{
	
	private ArrayList<String> categorias;
	private double precio;
	private double peso;
	public Producto(double peso, double precio) {
		super();
		categorias = new ArrayList<>();
		this.peso = peso;
		this.precio = precio;
	}
	
	public void addCategoria(String categoria) {
		categorias.add(categoria);
		
	}
	
	public ArrayList<String> getCategorias(){
		return new ArrayList<String>(categorias);
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public double getPrecio() {
		return this.getPrecio();
	}
	
	@Override
	public double getPeso() {
		return this.getPeso();
	}

	@Override
	public ArrayList<ElementoBazar> obtenerSiCumple(Condicion cond) {
		ArrayList<ElementoBazar> elemCumple = new ArrayList<>();
		if(cond.cumple(this)) {
			elemCumple.add(this);
		}
		return elemCumple;
	}

	@Override
	public int cantTotal() {
		return 1;
	}

	@Override
	public Producto productoMenorPeso() {
		return this;
	}
}
