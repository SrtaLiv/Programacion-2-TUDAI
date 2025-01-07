package FINALES.Final2024;

public class BloqueIterativo extends Bloque{
    int cantIterar;

    public BloqueIterativo(int cantIterar) {
        super();
        this.cantIterar = cantIterar;
    }

    @Override
    public double getGastoBateria() {
        return super.getGastoBateria()*cantIterar;
    }


    @Override
    public int getCantTiempo() {
        return super.getCantTiempo()*cantIterar;
    }

   /* public int calcularExtra(Kiko robot){
        return robot.bateriaDisponible();
    }*/
}
