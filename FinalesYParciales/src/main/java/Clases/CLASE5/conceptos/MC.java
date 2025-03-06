package Clases.CLASE5.conceptos;

public class MC extends Circulo {

	public MC(double radio) {
		super(radio);
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return super.getArea()/2;
	}
	public String getNombre() {
		return "MC";
	}

}
