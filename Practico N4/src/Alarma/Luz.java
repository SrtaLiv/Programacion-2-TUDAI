package Alarma;

public class Luz extends AlarmaLuminosa{
    boolean encender;

    public Luz() {
        this.encender = true;
    }



    public void encender() {
        if (encender){
            System.out.println("LUZ PRENDIDA!");
        }
    }



}
