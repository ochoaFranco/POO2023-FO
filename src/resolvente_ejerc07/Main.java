package resolvente_ejerc07;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Caso 1.
        System.out.println("CASO 1");
        Resolvente ec1 = new Resolvente(-1, -2, -3);
        ArrayList<Double> raices = ec1.resolver();
        ec1.mostrarRaices();
        System.out.println("Ecuacion evaluada en 3: "+ ec1.calcularY(3));
        ;
        // Caso 2
        System.out.println("CASO 2");
        Resolvente ec2 = new Resolvente(1, 5, -7);
        raices = ec2.resolver();
        ec2.mostrarRaices();
        System.out.println("Ecuacion evaluada en 3: "+ ec2.calcularY(3));
        // caso3
        System.out.println("CASO 3");
        Resolvente ec3 = new Resolvente(1, -4, 4);
        raices = ec3.resolver();
        ec3.mostrarRaices();
        System.out.println("Ecuacion evaluada en 3: "+ ec3.calcularY(3));
    }
}


