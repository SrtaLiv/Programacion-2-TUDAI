package EjerciciosTipoParcial.src.Prefinal2021;

import java.util.ArrayList;
import java.util.Collections;

public class Video extends AB implements Comparable<Video> {
    Usuario user;
    String duracion;
    int visualizacion;
    int mg;
    int nomg;
    int anio;
    ArrayList<String> palabrasClave;

    public Video(Usuario user, String duracion, int visualizacion,
                 int mg, int nomg, int anio, ArrayList<String> palabrasClave) {
        this.user = user;
        this.duracion = duracion;
        this.visualizacion = visualizacion;
        this.mg = mg;
        this.nomg = nomg;
        this.anio = anio;
        this.palabrasClave = new ArrayList<>();
    }


    public ArrayList<Video> buscar(Filtro ff){
        ArrayList<Video> result = new ArrayList<>();
        if (ff.cumple(this)){
            result.add(this);
        }
        return result;
    }
    public int compareTo(Video o){
        return user.compareTo(o.getUser());
    }

    public void addPalabrasClave(String s){
        if (!palabrasClave.contains(s)){
            palabrasClave.add(s);
        }
    }

    public boolean tienePalabraClave(String s){
         return palabrasClave.contains(s);
    }

    public ArrayList<String> getPalabrasClave(){
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public AB copiaRestringida(Condicion ff) {
        if (ff.cumple(this)){
            //Video copia = new Video();
           // return copia;
        }
        return null;
    }

    @Override
    public int cantVideos() {
        return 1;
    }



    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getVisualizacion() {
        return visualizacion;
    }

    public void setVisualizacion(int visualizacion) {
        this.visualizacion = visualizacion;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }

    public int getNomg() {
        return nomg;
    }

    public void setNomg(int nomg) {
        this.nomg = nomg;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
