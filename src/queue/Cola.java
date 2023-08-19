package queue;

import nodo.Nodo;

public class Cola {
    private Nodo primero = null;
    private Nodo ultimo = null;
    /**
    @param dato valor a encolar.
    */
    public void encolar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
        }
        ultimo = nuevoNodo;
    }

    public void desencolar() {
        if (primero == null) {
            return;
        }
        primero = primero.getSiguiente();
    }
    /**
    * @return true, si es vacio, falso caso contrario.
    */
    public boolean esVacia() {
        return primero == null;
    }
    /**
     * @return Longitud de la cola.
     */
    public int longitud() {
        int i = 0;
        Nodo aux = primero;
        while (aux != null) {
            aux = aux.getSiguiente();
            i++;
        }
        return i;
    }
    // Mostrar lista
    public String toString() {
        String acumulador = "";
        Nodo aux = primero;
        if (primero == null) {
            acumulador = "Cola vacia.";
        } else {
            while (aux != null) {
                acumulador += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return acumulador;
    }
    /**
     * @return Frente de la cola.
     */
    public Object recuperar() {
        if (primero == null)
            return "Cola vacia";
        return primero.getDato();
    }
}
