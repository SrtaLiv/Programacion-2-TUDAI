package CLASES.CLASE5.conceptos;

public class Figura {

	private String nombre;

	
	
	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public double getArea() {
		return 0;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String datosCompletos() {
		return this.getNombre()+":"+this.getArea();
	}
	
	
}
