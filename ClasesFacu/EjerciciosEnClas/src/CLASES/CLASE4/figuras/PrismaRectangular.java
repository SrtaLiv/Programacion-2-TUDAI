package CLASES.CLASE4.figuras;

public class PrismaRectangular extends Figura3D {

	private double lado1;
	private double lado2;
	
	public PrismaRectangular( double lado1, double lado2, double altura) {
		super("PrismaRectangular",altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getVolumen() {
		return this.superficieBase()*this.getAltura();
	}
	
	
	public double getSuperficie() {
		return (lado1*2+lado2*2)*this.getAltura() +
				2 * this.superficieBase();
	}
	
	public double superficieBase() {
		return lado1*lado2;
	}
	
	
	
}
