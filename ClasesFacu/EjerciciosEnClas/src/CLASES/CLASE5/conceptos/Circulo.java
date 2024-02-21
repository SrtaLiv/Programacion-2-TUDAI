package CLASES.CLASE5.conceptos;

public class Circulo  extends Figura{
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo( double radio) {
		super("Circulo");
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI*radio*radio;
	}

}
