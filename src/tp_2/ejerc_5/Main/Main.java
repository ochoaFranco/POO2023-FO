package tp_2.ejerc_5.Main;

import tp_2.ejerc_5.Cliente;
import tp_2.ejerc_5.CuentaCredito;
import tp_2.ejerc_5.CuentaNormal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaNormal cuenta = new CuentaNormal();
        CuentaCredito cuentaCredito = new CuentaCredito();
        Cliente c1 = new Cliente("Franco", cuenta, cuentaCredito);
        Scanner sc = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese el monto que desea agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);

        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("limite sobregiro: " + c1.getLimiteGiroEnDescubierto());

        System.out.println("Ingrese el monto que desea invertir a su billetera normal: ");
        monto = sc.nextDouble();
        System.out.println("Ahora ingrese la cantidad de dias: ");
        int dias = sc.nextInt();
        if (c1.invertirSaldo(monto, dias)) {
            System.out.println("El dinero que usted invirtio es: " + c1.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete, debe esperar.");
        }

        System.out.println("Ingrese el monto a gastar: ");
        monto = sc.nextDouble();
        c1.gastar(monto, true);
        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("Giro en descubierto utilizado: " + c1.getDeudaGiroDescubierto());
        System.out.println("Ingrese el monto que desea agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);
        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("Giro en descubierto utilizado: " + c1.getDeudaGiroDescubierto());
        System.out.println("Ingrese el monto que desea invertir a su billetera normal: ");
        monto = sc.nextDouble();
        System.out.println("Ahora ingrese la cantidad de dias: ");
        dias = sc.nextInt();
        if (c1.invertirSaldo(monto, dias)) {
            System.out.println("El dinero que usted invirtio es: " + c1.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete, debe esperar.");
        }
        // intento depositar nuevamente.
        if (!c1.invertirSaldo(monto, dias)) {
            System.out.println("No puede invertir nuevamenete, debe esperar.");
        }

        // CUENTA CREDITO.
        System.out.println("Monto disponible para compras a credito: "  + c1.getMontoCompraCredito());
        System.out.println("Saldo deudor: "  + c1.getSaldoDeudor());
        System.out.println("Ingrese el monto que desea usar de su  billetera a credito: ");
        monto = sc.nextDouble();
        c1.compraCredito(monto);
        System.out.println("Saldo deudor: "  + c1.getSaldoDeudor());
        System.out.println("Monto disponible para compras a credito: "  + c1.getMontoCompraCredito());
        System.out.println("Ingrese el monto que desea pagar: ");
        monto = sc.nextDouble();
        c1.pagarCredito(monto);
        System.out.println("Saldo deudor: "  + c1.getSaldoDeudor());
    }

}
