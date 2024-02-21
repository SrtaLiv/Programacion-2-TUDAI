package CLASES.Abstractas.EjComputos;

public class Proceso extends ObjetoComparable{
    private int memoriaReq;

    public Proceso(int memoriaReq) {
        this.memoriaReq = memoriaReq;
    }

    public int getMemoriaReq() {
        return memoriaReq;
    }

    @Override
    public String toString() {
        return ""+memoriaReq;
    }

    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getMemoriaReq() < ((Proceso)otro).getMemoriaReq();
    }
}
