package TP_1.linkedList_ejerc01_02;

import TP_1.nodo.NodoListaDoble;

public class ListaDoblementeEnlazada {
    private NodoListaDoble inicio = null;
    public void agregar(Object dato) {
        NodoListaDoble nuevoNodo = new NodoListaDoble();
        nuevoNodo.setDato(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoListaDoble aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(aux);
        }
    }

    public void insertar(Object dato, int pos) {
        if (pos < 1 || pos > longitud() + 1) {
            return;
        }
        if (pos == longitud() + 1) {
            agregar(dato);
        } else {
            NodoListaDoble nuevoNodo = new NodoListaDoble();
            nuevoNodo.setDato(dato);
            if (pos == 1) {
                inicio.setAnterior(nuevoNodo);
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                NodoListaDoble aux = inicio;
                for (int i = 0; i < pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                nuevoNodo.setSiguiente(aux); // seteo el siguiente
                nuevoNodo.setAnterior(aux.getAnterior()); // seteo el anterior.
                aux.getAnterior().setSiguiente(nuevoNodo); // hago el puente.
                aux.setAnterior(nuevoNodo); // actualizo el anterior.
            }
        }
    }

    public void eliminar(int pos) {
        if (inicio == null || pos < 1 || pos > longitud())
            return;
        NodoListaDoble aux = inicio;
        if (pos == 1) {
            inicio = inicio.getSiguiente();
        } else {
            for (int i = 0; i < pos -1; i++) {
                aux = aux.getSiguiente();
            }
            NodoListaDoble siguiente = aux.getSiguiente();
            aux.getAnterior().setSiguiente(siguiente);
        }
    }
    public int longitud() {
        int i = 0;
        NodoListaDoble nodo = inicio;
        while (nodo != null) {
            i++;
            nodo = nodo.getSiguiente();
        }
        return i;
    }

    // Mostrar lista
    public String toString() {
        String acumulador = "";
        NodoListaDoble aux = inicio;
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
    public Object recuperar(int pos) {
        if (pos < 1 || pos > longitud())
            return null;
        if (inicio == null)
            return null;
        NodoListaDoble aux = inicio;
        for (int i = 0; i < pos - 1; i++)
            aux = aux.getSiguiente();
        return aux.getDato();
    }
}
