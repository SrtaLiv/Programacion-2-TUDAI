package CLASES.CLASE2.comi2.src.ver3;

import java.time.LocalDate;

public class Persona {

	private double minimoIMC =18.5;
	private double maximoIMC = 25;
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private LocalDate fnac;
	private String sexo;
	private double peso;
	private double altura;
	
	public Persona(int dni) {
		this(dni,"femenino","N","N",1,1,
				LocalDate.of(2000,1,1));
		
	}
	public Persona(int dni,String apellido) {
		this(dni);
		this.apellido = apellido;
		
	}
	
	public Persona(int dni,String sexo,String nombre, 
			       String apellido, double altura, double peso,
			       LocalDate fnac) {
		this.dni = dni;
		this.sexo = sexo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
		this.peso = peso;
		this.fnac = fnac;
		
	}

	
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear()-fnac.getYear();
		if (hoy.getMonthValue()>fnac.getMonthValue())
			return edad;
		else {
			if (hoy.getMonthValue()<fnac.getMonthValue())
				return edad-1;
			else {
				if (hoy.getDayOfMonth()>=fnac.getDayOfMonth()) {
					return edad;
				}else {
					return edad-1;
				}
			}
		}
			
			
		
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFnac() {
		return fnac;
	}
	public void setFnac(LocalDate fnac) {
		this.fnac = fnac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDni() {
		return dni;
	}
	
	public double getIMC() {
		return peso /(altura*altura);
	}
	
	public boolean estaEnForma() {
		double imc = this.getIMC();
		if (imc>minimoIMC && imc <maximoIMC)
			return true;
		else
			return false;
	}
	
	public boolean cumpleAnios() {
		LocalDate hoy = LocalDate.now();
		return hoy.getDayOfMonth() == fnac.getDayOfMonth() &&
				hoy.getMonthValue() == fnac.getMonthValue();
	}
	
	
	public static void main (String[] args) {
		Persona p1 = new Persona(1);
	}
}
