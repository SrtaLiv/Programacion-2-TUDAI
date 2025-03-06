package Practicos.practico4.Sueldos;

public class Empleado {
    int salario;
    int horas;
    int cantidadVentas;
    String nombre;

    public static final int SALARIO_FIJO = 1000;

    public Empleado(){
    }
    public Empleado(int horas, int cantidadVentas) {
        this.horas = 0;
        this.cantidadVentas = cantidadVentas;
        this.salario = SALARIO_FIJO; //por defecto
    }

    public int getSalarioPorComision(){
        return this.salario * getHoras() + getCantidadVentas();
    }
    public int getSalario(){
        return this.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

