public class NotificacionCorreo extends Notificacion
{

    public NotificacionCorreo(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje)
    {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" por correo a: " + receptorNotificacion);

    }
}
