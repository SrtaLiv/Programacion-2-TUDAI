package CLASES.CLASE8.src.empleados;

public class SueldoFijo extends FormaPago {

	double sueldo;
	
	
	
	public SueldoFijo(double sueldo) {
		super();
		this.sueldo = sueldo;
	}



	public double calcularSueldo() {
		return sueldo;
	}

}
