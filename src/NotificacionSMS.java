public class NotificacionSMS extends Notificacion
{

    public NotificacionSMS(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje)
    {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" por SMS a: " + receptorNotificacion);

    }
}
