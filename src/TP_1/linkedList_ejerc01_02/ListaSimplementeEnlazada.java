package TP_1.linkedList_ejerc01_02;

import TP_1.nodo.Nodo;

public class ListaSimplementeEnlazada {
    private Nodo inicio = null;
    // Agreaar elementos a la lista.
    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        //nuevoNodo.setSiguiente(null);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo p = inicio;
            while (p.getSiguiente() != null) {
                p = p.getSiguiente();
            }
            p.setSiguiente(nuevoNodo);
        }
    }
    // Mostrar lista
    public String toString() {
        String acumulador = "";
        Nodo aux = inicio;
        if (inicio == null) {
            acumulador = "Lista vacia.";
        } else {
            while (aux != null) {
                acumulador += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return acumulador;
    }
    public boolean esVacia() {
        return inicio == null;
    }

    public int longitud() {
        int i = 0;
        Nodo aux = inicio;
        while (aux != null) {
            i++;
            aux = aux.getSiguiente();
        }
        return i;
    }

    public void eliminar(int pos) {
        if (pos < 1 || pos > longitud())
            return;
        if (inicio == null) {
            return;
        }
        Nodo aux = inicio;
        if (pos == 1)
            inicio = inicio.getSiguiente();
        else {
            for (int i = 0; i < pos - 2; i++)
                aux = aux.getSiguiente();
            Nodo p = aux.getSiguiente();
            aux.setSiguiente(p.getSiguiente());
        }
    }
    public Object recuperar(int pos) {
        if (pos < 1 || pos > longitud())
            return null;
        if (inicio == null)
            return null;
        Nodo aux = inicio;
        for (int i = 0; i < pos - 1; i++)
            aux = aux.getSiguiente();
        return aux.getDato();
    }

    public void insertar(Object dato, int pos) {
        if (pos < 1 || pos > longitud() + 1)
            return;
        if (inicio == null)
            agregar(dato);
        else {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setDato(dato);
            if (pos == 1) {
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo aux = inicio;
                for (int i = 0; i < pos -2; i++)
                    aux = aux.getSiguiente();
                nuevoNodo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevoNodo);
            }
        }
    }
}
