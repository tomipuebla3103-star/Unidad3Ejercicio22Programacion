//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PagoTarjetaCredito tarjeta = new PagoTarjetaCredito(50000);
    PagoCriptomoneda cripto = new PagoCriptomoneda(80000);
    PagoBilleteraVirtual billetera = new PagoBilleteraVirtual(30000);

    ModuloCompra compras = new ModuloCompra(tarjeta);

    compras.realizarCompra(10000);

    compras.cambiarProcesador(cripto);
    compras.realizarCompra(20000);

    compras.cambiarProcesador(billetera);
    compras.realizarCompra(40000);
}
