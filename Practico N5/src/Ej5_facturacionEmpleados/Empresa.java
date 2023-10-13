package Ej5_facturacionEmpleados;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void addEmpleados(Empleado emp){
        empleados.add(emp);
    }

    public double sumarSueldos(){
        int resultado = 0;
        for (Empleado empleado : empleados) {
            resultado += empleado.getSueldoMensual();
        }
        return resultado;
    }

    public void mostrarEmpleados(){
        if (empleados.isEmpty()){
            System.out.println("NO HAY EMPLEADOS");
        } else for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

}
