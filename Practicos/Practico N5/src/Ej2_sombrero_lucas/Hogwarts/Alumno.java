package Ej2_sombrero_lucas.Hogwarts;

import java.util.ArrayList;

public class Alumno {
private ArrayList<Alumno> familiares = new ArrayList<>();
private ArrayList<Cualidad> cualidades = new ArrayList<>();
private Casa casa;
public Alumno(ArrayList<Alumno> familiares, ArrayList<Cualidad> cualidades) {
	this.familiares = familiares;
	this.cualidades = cualidades;
}

public Alumno(ArrayList<Alumno> familiares, ArrayList<Cualidad> cualidades, Casa casa) {
	this.familiares = familiares;
	this.cualidades = cualidades;
	this.casa= casa;
}

public ArrayList<Cualidad> getCualidades() {
	return cualidades;
}
public ArrayList<Alumno> getFamiliares() {
	return familiares;
}
public Casa getCasa() {
	return casa;
}

public void  setFamiliares(ArrayList<Alumno> familia) {
	this.familiares = familia;
}
	


}
