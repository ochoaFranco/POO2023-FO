package TP_1.ejerc_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jugador J1 = new Jugador("Homero");
        Jugador J2 = new Jugador("Apu");
        Diccionario dic = new Diccionario();
        Scanner sc = new Scanner(System.in);
        // Se agregan las palabras.
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la palabra: ");
            String p = sc.nextLine();
            dic.agregarPalabras(p);
        }
        // Se muestran las palabras.
        ArrayList<Palabra> palabras = dic.getPalabrasDiccionario();
        for (Palabra p : palabras) {
            System.out.println(p.getPalabra());
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la palabra para el jugador 1: ");
            String p = sc.nextLine();
            Palabra j1Palabra = new Palabra(p);
            J1.agregarPalabras(j1Palabra, dic);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la palabra para el jugador 2: ");
            String p = sc.nextLine();
            Palabra j2Palabra = new Palabra(p);
            J2.agregarPalabras(j2Palabra, dic);
        }

        Juego nuevoJuego = new Juego(J1, J2);
        nuevoJuego.calcularGanador();
    }
}
