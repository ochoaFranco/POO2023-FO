package TP_1.stack_ejerc03;
import TP_1.nodo.Nodo;

public class Pila {
    private Nodo tope = null;
    public void apilar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }
    public boolean esVacia() {
        return tope == null;
    }

    public void desapilar() {
        if (tope == null)
            return;
        Nodo aux = tope;
        tope = aux.getSiguiente();
    }
    // Mostrar pila
    public String toString() {
        String acumulador = "";
        Nodo aux = tope;
        if (tope == null) {
            acumulador = "Pila vacia.";
        } else {
            while (aux != null) {
                acumulador += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return acumulador;
    }
    public Object tope() {
        return tope.getDato();
    }

}
