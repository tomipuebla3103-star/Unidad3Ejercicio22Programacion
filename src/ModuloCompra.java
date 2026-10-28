public class ModuloCompra {
    private ProcesadorPago procesador;

    public ModuloCompra(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void cambiarProcesador(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void realizarCompra(double monto) {
        if (procesador.procesarPago(monto)) {
            System.out.println("Pago aprobado. Comprobante: $" + monto);
        } else {
            System.out.println("Pago rechazado.");
        }
    }
}
