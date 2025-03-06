package Clases.CLASE5.conceptos;

public class Persona {

	private String nombre;
	private int dni;
	private static int contador =1;
	private static Persona eva;
	public static final int MAYOR=18;
	
	public static Persona getPrimera() {
		return eva;
	}
	public Persona(String nombre) {
	
		if (eva==null)
			eva=this;
		this.nombre = nombre;
		dni = contador;
		contador++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	
	public static int getContador() {
	//	int x = 3;
		return contador;
	}
	
}
