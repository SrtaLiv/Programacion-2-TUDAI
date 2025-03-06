package Practicos.Practico8.Ej5_SistemaDeNotificaciones;

public class NotificadorSms implements Notificador {
    //implementa la interface Notificador basada en sms
    NotificadorSms(String numeroTelefono) {

    }

    @Override
    public boolean enviarNotificacion(String s) {

        return false;
    }

    @Override
    public String getNotificacion() {
        return null;
    }
}