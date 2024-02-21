package Final2024;

import java.util.ArrayList;

public class Kiko {

    private static Kiko instanciaRobot; // <-------- SINGLETON
    private int maxBateria;
    int nivelBateria = 100;
    private ArrayList<ComandoAB> instrucciones;

    /*public Kiko(int maxBateria, int nivelBateria) {
        this.maxBateria = maxBateria;
        this.nivelBateria = nivelBateria;
        this.instrucciones = new ArrayList<>();
    }*/

    private Kiko(){
        instrucciones = new ArrayList<ComandoAB>();
    }

    public static Kiko getInstance(){ // <-------- SINGLETON
        if(instanciaRobot == null){
            instanciaRobot = new Kiko();
        }
        return instanciaRobot;
    }

    private void consumirBateria(int cantidad){
        this.nivelBateria = this.nivelBateria - cantidad;
    }

    private int getPorcentajeBateria(){
        return this.nivelBateria / this.maxBateria * 100;
    }

    public void ejecutar(){
        for(ComandoAB instruccion : instrucciones){
            this.consumirBateria(instruccion.getConsumo());
           // instruccion.ejecutar();
        }
    }
    public ArrayList<Comando> ejecutarComandos(){
       return new ArrayList<Comando>();
    }

    public void addComando(ComandoAB com){

    }

    public int getMaxBateria() {
        return maxBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setMaxBateria(int maxBateria) {
        this.maxBateria = maxBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}
