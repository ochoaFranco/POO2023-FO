package tp_2.ejerc_4;

public class CuentaCredito {
    private double limiteCompra = 500;
    private double saldoDeudor = 0;
    private double montoCompraDisponible = 500;

    boolean realizarCompra(double saldo) {
        if (saldo <= montoCompraDisponible) {
            saldoDeudor += saldo * 1.05;
            limiteCompra -= saldo;
            return true;
        }
        return false;
    }

    void pagarSaldoDeudor(double saldo) {
        if (saldoDeudor - saldo >= 0) {
            saldoDeudor -= saldo;
            limiteCompra += saldo;
        }
    }
    double getSaldoDeudor() {
        return saldoDeudor;
    }
    double getMontoCompraDisponible() {
        return montoCompraDisponible;
    }
}
