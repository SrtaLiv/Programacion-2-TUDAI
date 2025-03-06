package Practicos.practico5.Ej5_facturacionEmpleados;

public class FacturacionMain {

    public static void main(String[] args) {
        Empresa riot = new Empresa();

        Empleado emp1 = new Empleado("Juan", "Hernandez", 27832123, 17.000, new SueldoFijo());
        EmpleadoConVentas emp2 = new EmpleadoConVentas("Carlos", "Edu", 23123, 150.000, 100, new SueldoExtra());
        Empleado emp3 = new Empleado("Mario", "Bro", 10, 100.000, new SueldoFijo());

        riot.addEmpleados(emp1);
        riot.addEmpleados(emp2);
        riot.addEmpleados(emp3);

        riot.mostrarEmpleados();
        System.out.println(riot.sumarSueldos());


    }
}
