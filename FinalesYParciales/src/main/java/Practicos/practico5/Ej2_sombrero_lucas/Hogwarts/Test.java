package Practicos.practico5.Ej2_sombrero_lucas.Hogwarts;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//se crean cualidades
		Cualidad valiente = new Cualidad();
		Cualidad inteligente = new Cualidad();
		Cualidad leal = new Cualidad();
		Cualidad ambicioso = new Cualidad();
		
		ArrayList<Cualidad> cualidadesGryffindor = new ArrayList<>();
		cualidadesGryffindor.add(valiente);
		
		ArrayList<Cualidad> cualidadesRavenclaw  = new ArrayList<>();
		cualidadesRavenclaw.add(inteligente);
		
		ArrayList<Cualidad> cualidadesHufflepuff = new ArrayList<>();
		cualidadesHufflepuff.add(leal);
		
		ArrayList<Cualidad> cualidadesSlytherin = new ArrayList<>();
		cualidadesSlytherin.add(ambicioso);
		
		//se crea la famila malfoy
		Alumno luciusMalfoy = new Alumno(null, cualidadesSlytherin);
				ArrayList<Alumno> familiaMalfoy = new ArrayList<>();
				familiaMalfoy.add(luciusMalfoy);
				luciusMalfoy.setFamiliares(familiaMalfoy);
		
		//se crean los alumnos
		Alumno harryPotter = new Alumno(null, cualidadesSlytherin);
		Alumno lunaLovegood = new Alumno(null, cualidadesRavenclaw);
		Alumno cedricDiggory = new Alumno(null, cualidadesHufflepuff);
		Alumno dracoMalfoy = new Alumno(familiaMalfoy, cualidadesSlytherin);


		//se crean las casas
		Casa gryffindor = new Casa(cualidadesGryffindor, null, 50, false);
		Casa ravenclaw = new Casa(cualidadesRavenclaw, null, 50, false);
		Casa hufflepuff = new Casa(cualidadesHufflepuff, null, 50, false);
		Casa slytherin = new Casa(cualidadesSlytherin, gryffindor, 50, true);
		
		gryffindor.setCasaEnemiga(slytherin); 
		slytherin.agregar(luciusMalfoy);// se hardcodea a "lucius" en slytherin  para poder añadir a algun alumno"
		
		//se agrega a un alumno
		
		try {
			slytherin.agregarAlumno(dracoMalfoy);
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
			
		}

	}

}
