package CLASES.CLASE8.src.empleados;

public class ComisionVentas extends FormaPago {

	double ventas;
	double comision;
	
	
	
	public double getVentas() {
		return ventas;
	}



	public void setVentas(double ventas) {
		this.ventas = ventas;
	}



	public double getComision() {
		return comision;
	}



	public void setComision(double comision) {
		this.comision = comision;
	}



	public ComisionVentas(double ventas, double comision) {
		super();
		this.ventas = ventas;
		this.comision = comision;
	}



	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return ventas*comision;
	}

}
