package Alarma;

public class AlarmaLuminosa extends Alarma{
    //ATRIBUTOS
    private Luz luz;

    public AlarmaLuminosa(){
        super();
        this.luz = new Luz();
    }

    public void encenderLuz(){
            super.comprobarPeligro();
            luz.encender();
        }
    }


