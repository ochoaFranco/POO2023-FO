package tp_2.ejerc_4;

public class Cliente {
    private String nombre;
    private CuentaNormal cuenta;
    CuentaCredito cuentaCredito;
    public Cliente(String nombre, CuentaNormal cuenta, CuentaCredito cuentaCredito) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.cuentaCredito = cuentaCredito;
    }

    public Cliente(String nombre, CuentaNormal cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void agregarSaldo(double saldo) {
        cuenta.agregarSaldo(saldo);
    }

    public boolean invertirSaldo(double saldo, int dias) {
        return cuenta.activarPlazoFijo(saldo, dias);
    }
    public void gastar(double saldo) {
        cuenta.descontarSaldo(saldo);
    }

    public double getSaldo() {
        return cuenta.getSaldo();
    }
    public double getLimiteGiroEnDescubierto() {
        return cuenta.getLimiteGiroEnDescubierto();
    }

    public double getDeudaGiroDescubierto() {
        return cuenta.deudaGiroEnDescubierto();
    }

    public double getMontoInvertido() {
        return cuenta.getMontoInvertido();
    }


}
