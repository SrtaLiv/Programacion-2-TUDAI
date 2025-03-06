package CLASES.CLASE4.figurasV2;
public class MedioCirculo extends Circulo{

	public MedioCirculo(double radio) {
		super(radio);
		this.setNombre("MedioCirculo");
	}
	
	public double getArea() {
		return super.getArea()/2;
	}
	
	public double getPerimetro() {
		return super.getPerimetro()/2+this.getDiametro();
	}
}
