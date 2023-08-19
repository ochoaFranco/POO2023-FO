import linkedList.ListaDoblementeEnlazada;
import linkedList.ListaSimplementeEnlazada;
import queue.Cola;
import stack.Pila;

import java.util.Scanner;

public class Main {
    static void agregar(ListaSimplementeEnlazada l1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Probando lista enlazada");
        // Agregando elementos.
        System.out.println("Agregue algunos elementos (0 para salir)");
        String userInput;
        do {
            userInput = sc.nextLine();
            if (!userInput.equals("0")) {
                l1.agregar(userInput);
            }
            System.out.println("Agregue algunos elementos (0 para salir)");
        } while (!userInput.equals("0"));
        System.out.println("Press enter to continue..");
        userInput = sc.nextLine();
        System.out.println("La lista que usted ingreso es la siguiente:");
        System.out.println(l1);
        System.out.println("La longitud de la lista enlazada ingresada es: " + l1.longitud());
    }

    static void eliminar(ListaSimplementeEnlazada l1) {
        System.out.println(l1);
        Scanner sc = new Scanner(System.in);
        int pos;
        String userInput;
        do {
            System.out.println("Ingrese la posicion de los elementos que desea eliminar: (0 para terminar)");
            pos = sc.nextInt();
            l1.eliminar(pos);
            System.out.println(l1);
        } while (pos != 0);
        System.out.println("Press enter to continue..");
        userInput = sc.nextLine();
        System.out.println("Lista con elementos eliminados:");
        System.out.println(l1);
    }

    static void insertar(ListaSimplementeEnlazada l1) {
        Scanner sc = new Scanner(System.in);
        int pos;
        String userInput;
        do {
            System.out.println("Ingrese el dato a insertar: (0 para salir)");
            userInput = sc.nextLine();
            if (!userInput.equals("0")) {
                System.out.println("Ingrese la posicion de los elementos que desea insertar: (0 para terminar)");
                pos = sc.nextInt();
                l1.insertar(userInput, pos);
                sc.nextLine(); // vaciando buffer.
                System.out.println(l1);
            }
        } while (!userInput.equals("0"));
    }
    static void encolar(Cola c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Probando Cola");
        System.out.println("Agregue algunos elementos (0 para salir)");
        String userInput;
        do {
            userInput = sc.nextLine();
            if (!userInput.equals("0")) {
                c.encolar(userInput);
            }
            System.out.println("Agregue algunos elementos (0 para salir)");
        } while (!userInput.equals("0"));
        System.out.println("Press enter to continue..");
        userInput = sc.nextLine();
        System.out.println("La cola que usted ingreso es la siguiente:");
        System.out.println(c);
        System.out.println("La longitud de la cola ingresada es: " + c.longitud());
    }
    static void desencolar(Cola c) {
        System.out.println(c);
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos desea desencolar?");
        int pos = sc.nextInt();
        for (int i = 0; i < pos; i++) {
            c.desencolar();
        }
        System.out.println("Cola con elementos eliminados:");
        System.out.println(c);
    }
    static void apilar(Pila p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Probando Pila");
        System.out.println("Agregue algunos elementos (0 para salir)");
        String userInput;
        do {
            userInput = sc.nextLine();
            if (!userInput.equals("0")) {
                p.apilar(userInput);
            }
            System.out.println("Agregue algunos elementos (0 para salir)");
        } while (!userInput.equals("0"));
        System.out.println("Press enter to continue..");
        userInput = sc.nextLine();
        System.out.println("La pila que usted ingreso es la siguiente:");
        System.out.println(p);
    }
    static void desapilar(Pila p) {
        System.out.println(p);
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos desea desapilar?");
        int pos = sc.nextInt();
        for (int i = 0; i < pos; i++) {
            p.desapilar();
        }
        System.out.println("Pila con elementos eliminados:");
        System.out.println(p);
    }

    public static void main(String[] args) {
        // -------Lista enlazada simple y doble----------
        ListaSimplementeEnlazada l1 = new ListaSimplementeEnlazada();
        ListaDoblementeEnlazada l2 = new ListaDoblementeEnlazada();
        //Debido a que los metodos son los mismos se puede reemplazar l1 por l2 para probar la lista doblemente enlazada.
        //agregar(l1);
        //eliminar(l1);
        //insertar(l1);
        // ----------Cola----------
        /*Cola c = new Cola();
        encolar(c);
        desencolar(c);
        System.out.println("Frente: " + c.recuperar());
        System.out.println("Longitud: " + c.longitud());
        // -------------Pila------------
        Pila p = new Pila();
        apilar(p);
        desapilar(p);
        System.out.println("Tope: " + p.tope());*/





    }
}