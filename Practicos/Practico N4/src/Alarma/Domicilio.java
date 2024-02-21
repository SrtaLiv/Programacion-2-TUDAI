package Alarma;

public class Domicilio {
    Alarma alarma;

    public Domicilio(Alarma alarma) {
        alarma.comprobarPeligro();
    }

    public void detectarZona(){

    }

    public static void main(String[] args) {
        Alarma alarma1 = new Alarma();
        Sensor s1 = new Sensor();

        alarma1.setVidrioRoto(true);
        alarma1.activarAlarma();

        s1.agregarZonaDetectada("Cocina");



    }


}
