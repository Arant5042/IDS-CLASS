public class CuentaBancaria
{
    private final String id;

    private int saldo;


    public CuentaBancaria(String id, int saldoInicial)
    {
        this.id = id;
        this.saldo = saldoInicial;
    }

    public String getId()
    {
        return id;
    }

    public int getSaldo()
    {
        return saldo;
    }
}
