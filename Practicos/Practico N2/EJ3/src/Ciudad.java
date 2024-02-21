import java.util.Random;

public class Ciudad{
    String nombre;
    double imp1;
    double imp2;
    double imp3;
    double imp4;
    double imp5;
    int gastos;

    //CONSTRUCTORES
    public Ciudad(String nombre) {
        Random random = new Random();
        this.nombre = nombre;
        this.imp1 = random.nextDouble() * 100;
        this.imp2 = random.nextDouble() * 100;
        this.imp3 = random.nextDouble() * 100;
        this.imp4 = random.nextDouble() * 100;
        this.imp5 = random.nextDouble() * 100;
        this.gastos = random.nextInt() * 150;
    }


    //METODOS ----------------------------------------------------

    //RECAUDA EL MONTO POR IMPUESTOS
    public int getGastos() {
        return gastos;
    }
    public double recaudarMonto(){
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public double getDeficit(){
        return recaudarMonto() - gastos;
    }
    public boolean ciudadDeficit(){
        return getDeficit() < 0;
    }

    //-----------------------------------------------------------
    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImp1() {
        return imp1;
    }

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }


    public void setGastos(int gastos) {
        this.gastos = gastos;
    }
}
