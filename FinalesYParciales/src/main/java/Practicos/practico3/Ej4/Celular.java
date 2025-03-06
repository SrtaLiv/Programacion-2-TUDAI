package Ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Celular {
    ArrayList<Contacto> contactos;
    String duenio;

    public Celular(String duenio) {
        this.contactos = new ArrayList<>();
        this.duenio = duenio;
    }

    public void agregarContacto(){
        Scanner contactoNuevo = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo contacto");
        String nombre = contactoNuevo.nextLine();

        System.out.println("Ingrese el apellido del nuevo contacto");
        String apellido = contactoNuevo.nextLine();

        System.out.println("Ingrese la edad del nuevo contacto");
        int edad = contactoNuevo.nextInt();

        System.out.println("Ingrese el numero de telefono del nuevo contacto");
        int numeroTel = contactoNuevo.nextInt();

        System.out.println("Ingrese el nombre de la ciudad nuevo contacto");
        String ciudad2 = contactoNuevo.nextLine();


        System.out.println("---------------------------");

        Contacto c1 = new Contacto(nombre, apellido, edad, numeroTel, ciudad2);
        agregarContactoManualmente(c1);
    }

    public void agregarContactoManualmente(Contacto nuevoContacto){
        contactos.add(nuevoContacto);
    }

    public void recorrerContactos(){
        for (int i=0; i<contactos.size();i++){
            System.out.println(contactos.get(i));
        }
    }

    public void menuDeOpciones() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1: Mostrar información de un contacto");
        System.out.println("2: Mostrar información de TODOS los contactos");
        System.out.println("3: Agregar contacto");
        System.out.println("4: Eliminar contacto");
        System.out.println("---------------------------");

    }
    public void opcionesCelular() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            menuDeOpciones();
            System.out.println("INGRESE UN NUMERO PARA OPERAR:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: buscarInformacionDeUnContacto(); break;
                case 2: mostrarInformacionDeTodosLosContactos(); break;
                case 3: agregarContacto(); break;
                case 4: removerContacto(); break;
                default:
                    System.out.println("Error, esa opción no es válida.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }

    public void removerContacto(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que numero de contacto desea eliminar?");
        int num = entrada.nextInt();
        contactos.remove(num);
    }

    public void buscarInformacionDeUnContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del contacto: ");
        String nombreBuscado = scanner.nextLine();

        for (Contacto contacto : contactos) {
            if (nombreBuscado.equals(contacto.getNombre())){
            System.out.println("INFORMACION DEL CONTACTO" +
                    "\nNOMBRE: " + contacto.getNombre() +
                    "\nAPELLIDO: " + contacto.getApellido() +
                    "\nEDAD: " + contacto.getEdad() +
                    "\nNUMERO TELEFONICO: " + contacto.getNumeroTel() +
                    "\nCIUDAD: " + contacto.getCiudad());
                System.out.println("---------------------------");
            }
            else System.out.println("NO EXISTE ESE NOMBRE!");
            return;
        }
    }

    public void mostrarInformacionDeTodosLosContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            System.out.println("---------------------------");
            System.out.println("INFORMACION DE TODOS LOS CONTACTOS");
            for (Contacto contacto : contactos) {
                System.out.println("NOMBRE: " + contacto.getNombre());
                System.out.println("APELLIDO: " + contacto.getApellido());
                System.out.println("EDAD: " + contacto.getEdad());
                System.out.println("NUMERO TELEFONICO: " + contacto.getNumeroTel());
                System.out.println("CIUDAD: " + contacto.getCiudad());
                System.out.println("---------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Celular c1 = new Celular("Olivia");
        Contacto bard = new Contacto("Bardo", "Lol", 3, 3234, "Runaterra");
        Contacto udyr = new Contacto("Udyr", "Lol", 32, 123123, "Freljord");

        //Tambien se puede agregar contacots

        c1.agregarContactoManualmente(bard);
        c1.agregarContactoManualmente(udyr);
        c1.recorrerContactos();
       // c1.opcionesCelular();

    }
}
