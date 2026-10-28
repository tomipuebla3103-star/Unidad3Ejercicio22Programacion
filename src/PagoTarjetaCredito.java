public class PagoTarjetaCredito implements ProcesadorPago {
    private double saldo;

    public PagoTarjetaCredito(double saldo) {
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
