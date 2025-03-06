package Practicos.Practico8.Ej5_SistemaDeNotificaciones;

public class NotificadorEmail implements Notificador {
    String emailEnvio;
    String emailRecepcion;

    //implementa la interface Notificador basada en emails
    NotificadorEmail (String emailEnvio, String emailRecepcion) {
       this.emailEnvio = emailEnvio;
        this.emailRecepcion = emailRecepcion;
    }

    @Override
    public boolean enviarNotificacion(String s) {
        System.out.println("Email de:" + this.emailEnvio + s);
        return false;
    }

    @Override
    public String getNotificacion() {
        return this.emailRecepcion;
    }
}
