package Ej3_Electoral;

public class Candidato {
    String nombre;
    String partidoPolitico;
    String agrupacion;
    int votos;

    public Candidato(String nombre, String partidoPolitico, String agrupacion) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nombre='" + nombre + '\'' +
                ", partidoPolitico='" + partidoPolitico + '\'' +
                ", agrupacion='" + agrupacion + '\'' +
                '}';
    }



}
