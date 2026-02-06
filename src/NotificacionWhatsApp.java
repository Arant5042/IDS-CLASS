public class NotificacionWhatsApp extends Notificacion{

    public NotificacionWhatsApp(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje)
    {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" por correo a: " + receptorNotificacion);

    }

}
