package password_ejerc08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la password.");
        int n = sc.nextInt();
        Password miPassword1 = new Password(n);
        Password miPassword2 = new Password();
        System.out.println("Tu password es: " + miPassword1.getPassword() + " " + miPassword1.getLongitud() + " caracteres.");
        if (miPassword1.isFuerte()) {
            System.out.println("Su password es fuerte.");
        } else {
            System.out.println("Su password no es fuerte.");
            System.out.println("Regenerando password..");
            miPassword1.regenerar();
            miPassword1.getPassword();
            if (miPassword1.isFuerte()) {
                System.out.print("Ahora su password es fuerte: ");
                System.out.println(miPassword1.getPassword());
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Tu password es: " + miPassword2.getPassword() + " " + miPassword2.getLongitud() + " caracteres.");
        if (miPassword2.isFuerte()) {
            System.out.println("Su password es fuerte.");

        } else {
            System.out.println("Su password no es fuerte.");
            System.out.println("Regenerando password..");
            miPassword2.regenerar();
            miPassword2.getPassword();
            if (miPassword2.isFuerte()) {
                System.out.print("Ahora su password es fuerte: ");
                System.out.println(miPassword2.getPassword());
            }
        }
    }
}
