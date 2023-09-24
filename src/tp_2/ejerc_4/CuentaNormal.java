package tp_2.ejerc_4;

import java.time.LocalDate;

public class CuentaNormal {
    private double saldo;
    private double limiteGiroEnDescubierto = 100;
    private double montoTotal = saldo + limiteGiroEnDescubierto;
    private LocalDate fechaPlazoFijoInicio, fechaPlazoFijoFinal;
    void agregarSaldo (double saldo) {
        this.saldo += saldo;
    }
    double getSaldo() {
        return saldo;
    }
    double getMontoTotal() {
        return montoTotal;
    }
    boolean activarPlazoFijo(double saldo, int dias) {
        if (!(fechaPlazoFijoFinal != null) && !LocalDate.now().isAfter(fechaPlazoFijoFinal))
            return false;
        this.fechaPlazoFijoInicio = LocalDate.now();
        this.fechaPlazoFijoFinal = this.fechaPlazoFijoInicio.plusDays(dias);
        return true;
    }
}
