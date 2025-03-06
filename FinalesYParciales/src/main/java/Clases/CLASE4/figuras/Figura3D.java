package CLASES.CLASE4.figuras;


public class Figura3D {

	private String nombre;
	private double altura;
	
	public Figura3D(String nn, double altura) {
		nombre = nn;
		this.altura = altura;
	}
	
	public double getVolumen() {
		return 0;
	}
	
	public double getSuperficie() {
		return 0;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double superficieBase() {
		return 0;
	}
	
}
