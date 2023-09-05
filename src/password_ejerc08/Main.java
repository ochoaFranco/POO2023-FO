package password_ejerc08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el la longitud de la coleccion: ");
        int n = sc.nextInt();
        Password coleccion[] = new Password[n];
        for (int i = 0; i < coleccion.length; i++) {
            coleccion[i] = new Password();
        }
        for (int i = 0; i < coleccion.length; i++) {
            if (coleccion[i].isFuerte())
                System.out.println("<" + coleccion[i].getPassword() + "> - Fuerte");
            else
                System.out.println("<" + coleccion[i].getPassword() + "> - Debil");
        }
    }
}
