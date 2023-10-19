package Ej3_Electoral;

import java.util.ArrayList;

public class Mesa{
    ArrayList<Votante> padron; //votantes anotados en la lista.
    ArrayList<Voto> votos;
    String establecimientoEducativo; //Barrio o localidad
    //if votante.getVoto.equals(mesa.getPadron), else sout("no puede votar en este padron")

    public Mesa(String establecimientoEducativo) {
        this.padron = new ArrayList<>(); //Lista de votanrtes
        this.votos = new ArrayList<>();
        this.establecimientoEducativo = establecimientoEducativo;
    }

    public Mesa() {

    }

    public void agregarVotanteAlPadron(Votante vo){
        if (padron != null) {
            padron.add(vo);
        }
    }


    public ArrayList<Votante> buscar(Condicion c){
        ArrayList<Votante> encontrados = new ArrayList<>();
        for (int i = 0 ; i < padron.size() ; i++ ){
            if (c.cumple(padron.get(i))){
                encontrados.add(padron.get(i));
            }
        }
        return encontrados;
    }

    public boolean loEncontre(Votante v){
        for (int i = 0; i < padron.size();i++){
            if (padron.get(i).getDni() == v.getDni()){
                return true;
            }
        }
        return false;
    }

    public void votar(Votante v, Voto voto){
        if (loEncontre(v)){
            agregarVoto(voto);
        } else System.out.println("Usted no se encuentra en este padron.");
    }

    public void agregarVoto(Voto v){
        votos.add(v);
    }



    public double calcularPorcentajeVotosCandidato(Candidato candidato) {
        int totalVotos = 0;
        int votosCandidato = 0;

        for (int i = 0; i < votos.size(); i++) {
            totalVotos++;
            if (votos.get(i).getCandidato() != null && votos.get(i).getCandidato().equals(candidato)) {
                votosCandidato++;
            }
        }
        if (totalVotos == 0) {
            return 0.0; // Evitar división por cero si no hay votos en la mesa.
        }
        return (double) votosCandidato / totalVotos * 100.0;
    }


    @Override
    public String toString() {
        return "Mesa{" +
                "padron=" + padron +
                ", votos=" + votos +
                ", establecimientoEducativo='" + establecimientoEducativo + '\'' +
                '}';
    }

    public ArrayList<Votante> getPadron() {
        return padron;
    }

    public void setPadron(ArrayList<Votante> padron) {
        this.padron = padron;
    }

    public String getEstablecimientoEducativo() {
        return establecimientoEducativo;
    }

    public void setEstablecimientoEducativo(String establecimientoEducativo) {
        this.establecimientoEducativo = establecimientoEducativo;
    }

    public ArrayList<Voto> getVotos() {
        return votos;
    }
}
