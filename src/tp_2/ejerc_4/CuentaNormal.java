package tp_2.ejerc_4;

import java.time.LocalDate;

public class CuentaNormal {
    private double saldo;
    private final double limiteGiroEnDescubierto = 100;
    private double giroEnDescubierto = 0;
    private double montoTotal = saldo + limiteGiroEnDescubierto;
    private LocalDate fechaPlazoFijoInicio, fechaPlazoFijoFinal;
    private double montoInvertido = 0;
    void agregarSaldo (double saldo) {
        giroEnDescubierto -= saldo;
        if (giroEnDescubierto < 0 ) {
            this.saldo = giroEnDescubierto * -1;
            giroEnDescubierto = 0;
        }
    }
    double getSaldo() {
        return saldo;
    }
    double getMontoTotal() {
        return montoTotal;
    }
    boolean activarPlazoFijo(double saldo, int dias) {
        if (fechaPlazoFijoFinal == null) {
            this.fechaPlazoFijoInicio = LocalDate.now(); // setear el nuevo plazo fijo.
            this.fechaPlazoFijoFinal = this.fechaPlazoFijoInicio.plusDays(dias);
            this.montoInvertido = saldo;
            return true;
        }
        if (LocalDate.now().isAfter(fechaPlazoFijoFinal)) {
            montoInvertido += montoInvertido * 0.4;
            saldo += montoInvertido; // cobrar el interes del plazo fijo.
            this.fechaPlazoFijoInicio = LocalDate.now(); // setear el nuevo plazo fijo.
            this.fechaPlazoFijoFinal = this.fechaPlazoFijoInicio.plusDays(dias);
            montoInvertido = saldo;
            return true;
        }
        return false;
    }

    void descontarSaldo(double saldo) {
        if (this.saldo - saldo >= 0) {
            this.saldo -= saldo;
        }
        else if ((this.saldo + limiteGiroEnDescubierto) - saldo < 0) {
            System.out.println("No tiene saldo sufiente.");
            return;
        }
        else {
            System.out.println("Se usara el giro en descubierto");
            double montoTotal = this.saldo + limiteGiroEnDescubierto;
            giroEnDescubierto = (this.saldo - saldo) * -1;
            this.saldo = 0;
        }
    }

    double deudaGiroEnDescubierto() {
        return giroEnDescubierto;
    }

    double getLimiteGiroEnDescubierto() {
        return limiteGiroEnDescubierto;
    }

    LocalDate getFechaPlazoFijoInicio() {
        return fechaPlazoFijoInicio;
    }

    LocalDate getFechaPlazoFijoFinal() {
        return fechaPlazoFijoFinal;
    }

    double getMontoInvertido() {
        return  montoInvertido;
    }
}
