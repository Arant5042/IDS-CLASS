public class Main{
    static void main(String[] args)
    {
        CuentaBancaria cuenta1 = new CuentaBancaria ("1", 100);
        cuenta1.retirar( 100);
        cuenta1.consignar(200);
        System.out.println("El saldo de la cuenta es:" + cuenta1.getSaldo());

        Notificacion[] notificaciones = new Notificacion[2];
        notificaciones [0] = new NotificacionCorreo("Sebas");
        notificaciones [1] = new NotificacionSMS("Juan");

        notificaciones[0].enviarMensaje("Hola mi amigo");
        notificaciones[1].enviarMensaje("Hola bro");
    }
}
