package Sueldos;

public class GestorSueldos {
    public void imprimir(Empleado emp, int ventas, int horas){
        System.out.println("Tipo de empleado: " + emp.getNombre() +
                "\nSalario Fijo: " + emp.getSalario() +
                "\nHoras extra: " + emp.getHoras() +
                "\nCantidad de ventas: " + emp.getCantidadVentas() +
                "\nSalario Total: " + emp.getSalarioPorComision() +
                "\nSalario Total por Cantidad de Ventas: ");
    }

    public static void main(String[] args) {
            GestorSueldos gestor = new GestorSueldos();

            Empleado empleado = new Empleado(2,4);

            Empleado emplCont = new EmpleadoContratado(2,3);
            Empleado emplHoras = new EmpleadoHoraExtra(3,4);
            Empleado empComision = new EmpleadoPorComision(3,4);

          // empleado = emplCont;
          //  empleado = emplHoras;
            empleado = empComision;
            gestor.imprimir(empleado, 3,4);
    }
}
