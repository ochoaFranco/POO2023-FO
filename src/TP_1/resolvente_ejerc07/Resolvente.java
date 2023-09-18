package TP_1.resolvente_ejerc07;

import java.util.ArrayList;

public class Resolvente {
    private final int a;
    private final int b;
    private final int c;
    private int x1, x2;
    private ArrayList<Double> raices = new ArrayList<Double>();


    public Resolvente(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public ArrayList<Double> resolver() {
        double  resultado;
        boolean operacion = true;
        int multiplicacion = ((b * b) - (4 * a * c));
        int discriminante = b * (-1);
        // compruebo raices positivas.
        if (multiplicacion > 0 ) {
            double raiz = (int) Math.sqrt(multiplicacion);
            resultado = (discriminante + raiz) / (2 * a);
            raices.add(resultado);
            resultado = (discriminante - raiz) / (2 * a);
            raices.add(resultado);
        } else if (multiplicacion == 0) { // no tiene raices.
            resultado =(double)(discriminante / (2 * a));
            raices.add(resultado);
        } else {
            operacion = false;
        }
        
        return raices;
    }

    public void mostrarRaices() {
        int j = 0;
        if (raices.isEmpty()) {
            System.out.println("No existen raices reales.");
        } else {
            if (raices.size() == 1)
                System.out.println("La ecuacion tiene una sola raiz.");
            for (Double i : raices) {
                System.out.println("x" + j +": " + i);
                j++;
            }
        }
    }

    public int calcularY(int x) {
        return ((a * (x * x)) + (b * x) + c);
    }

}
