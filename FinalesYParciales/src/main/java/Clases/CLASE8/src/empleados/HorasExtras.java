package Clases.CLASE8.src.empleados;

public class HorasExtras extends FormaPago {

	int horas;
	double valorHora;
	
	
	public HorasExtras(int horas, double valorHora) {
		super();
		this.horas = horas;
		this.valorHora = valorHora;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return horas*valorHora;
	}

}
