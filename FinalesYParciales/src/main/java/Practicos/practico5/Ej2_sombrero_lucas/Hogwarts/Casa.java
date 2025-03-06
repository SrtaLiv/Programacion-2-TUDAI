package Practicos.practico5.Ej2_sombrero_lucas.Hogwarts;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Alumno> alumnos;
	private ArrayList<Cualidad> cualidades;
	private Casa casaEnemiga;
	private int cantAlumnosMax;
	private boolean requiereLinaje;

	public Casa(ArrayList<Cualidad> cualidades, Casa casaEnemiga, int cantAlumnosMax, boolean requiereLinaje) {
		this.alumnos = new ArrayList<>(cantAlumnosMax);
		this.cualidades = cualidades;
		this.casaEnemiga = casaEnemiga;
		this.cantAlumnosMax = cantAlumnosMax;
		this.requiereLinaje = requiereLinaje;
	}

	public void agregarAlumno(Alumno alumno) {
		if (!verificarLugar()) {
			throw new IllegalArgumentException("No hay lugar en la casa ");
		} else

		if (!verificarCualidades(alumno)) {
			throw new IllegalArgumentException("No cumple las cualidades para ingresar a esta casa");
		}
		if (this.requiereLinaje && !tieneFamiliar(alumno)) {
			throw new IllegalArgumentException("No cuenta con familiares dentro de la casa");
		}
		
		if(alumno.getCasa() == null) {
			this.alumnos.add(alumno);
			System.out.println("Se agrego el alumno ");
		}else if (verificarSiEsEnemigo(alumno)) {
			throw new IllegalArgumentException("El alumno pertenece a una casa enemiga");
		}else {
			this.alumnos.add(alumno);
			System.out.println("Se agrego el alumno ");
		}

	}

	private boolean verificarSiEsEnemigo(Alumno alumno) {
		
		return alumno.getCasa().equals(casaEnemiga);

	}

	private boolean tieneFamiliar(Alumno alumno) {
		int i = 0;
		boolean tieneFamiliar = false;
		if( !(alumno.getFamiliares() == null)  && !this.alumnos.isEmpty()) {
			while (tieneFamiliar == false && i < alumno.getFamiliares().size()) {
				int j = 0;
				while (j < this.cantAlumnosMax && tieneFamiliar == false)
					if (alumno.getFamiliares().get(i) == this.alumnos.get(j)) {
						tieneFamiliar = true;
					} else {
						j++;
					}
				i++;
			}
			
		}
		return tieneFamiliar;
	}

	private boolean verificarCualidades(Alumno alumno) {
		return alumno.getCualidades().equals(this.cualidades);

	}

	private boolean verificarLugar() {
		return this.alumnos.size() < this.cantAlumnosMax;
		// TODO Auto-generated method stub

	}
	
	public void agregar(Alumno alumno) {
	this.alumnos.add(alumno);
	}

	public void setCasaEnemiga(Casa casa) {
		this.casaEnemiga = casa;
		
	}

}
