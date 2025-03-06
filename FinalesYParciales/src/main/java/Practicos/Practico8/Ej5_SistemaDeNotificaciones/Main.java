package Practicos.Practico8.Ej5_SistemaDeNotificaciones;

public class Main {
    public static void main(String[] args) {
        NotificadorEmail n1 = new NotificadorEmail("oli@gmail.com", "oliver@gmail.com");
        System.out.println(n1.enviarNotificacion("hola"));
    }
}
