package tp_2.ejerc_4.main;

import tp_2.ejerc_4.Cliente;
import tp_2.ejerc_4.CuentaNormal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaNormal cuenta = new CuentaNormal();
        Cliente c1 = new Cliente("Franco", cuenta);
        Scanner sc = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese el monto que desea agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);
        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("limite sobregiro: " + c1.getLimiteGiroEnDescubierto());
        System.out.println("Ingrese el monto a gastar: ");
        monto = sc.nextDouble();
        c1.gastar(monto);
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
        int dias = sc.nextInt();
        if (c1.invertirSaldo(monto, dias)) {
            System.out.println("El dinero que usted invirtio es: " + c1.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete, debe esperar.");
        }
        // intento depositar nuevamente.
        if (!c1.invertirSaldo(monto, dias)) {
            System.out.println("No puede invertir nuevamenete, debe esperar.");
        }
    }

}
