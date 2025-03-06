package CLASES.CLASE4.figurasV2;
public class Figura3D {
	private String nombre;
	private Figura base;
	private double altura;
	
	
	public Figura3D(String nombre, Figura base, double altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Figura getBase() {
		return base;
	}


	public void setBase(Figura base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return base.getArea()*this.getAltura();
	}
	
	public double getSuperficie() {
		return base.getPerimetro()*this.getAltura();
	}
	
	public double superficieBase() {
		return base.getArea();
	}

}
