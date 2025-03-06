package CLASES.CLASE4.dados;

public class EjemploObject {

	public static void main(String[] args) {
	Jugador j1 = new Jugador("Juan");
	Jugador j2 = new Jugador("Juan");

	if (j1 == j2) {
		System.out.println("IGUALES");
	} else {
		System.out.println("DISTINTOS");
	}
	//j2.sumarPuntos();
	
	if (j1.equals(j2)) {
		System.out.println("IGUALES");
	} else {
		System.out.println("DISTINTOS");
	}
	
	if (j1.equals("HOLA")) {
		System.out.println("IGUALES");
	} else {
		System.out.println("DISTINTOS");
	}
	
	JugadorTramposo j3 = new JugadorTramposo("Juan",null);
	if (j1.equals(j3)) {
		System.out.println("IGUALES");
	} else {
		System.out.println("DISTINTOS");
	}
	
	if (j1.getNombre().equals(j3.getNombre())) {
		System.out.println("IGUALES");
	} else {
		System.out.println("DISTINTOS");
	}
	
	
	System.out.println(j1);
	
	String ss = "Hola" + j2;
	System.out.println(ss);
	}

}
