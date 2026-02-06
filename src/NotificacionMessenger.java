public class NotificacionMessenger extends Notificacion
{

    public NotificacionMessenger(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje)
    {
        System.out.println("Mensaje enviado por Messenger a:" + receptorNotificacion);

    }
}
