package Ej5_SistemaDeNotificaciones;

public interface Notificador {
    boolean enviarNotificacion(String s); //Envía una notificación
    String getNotificacion(); // Recupera una notificación
}
