public class PagoBilleteraVirtual implements ProcesadorPago{
    private double saldo;

    public PagoBilleteraVirtual(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }
}
