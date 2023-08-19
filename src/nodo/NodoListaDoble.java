package nodo;

public class NodoListaDoble {
    private Object dato;
    private NodoListaDoble siguiente = null;
    private NodoListaDoble anterior = null;
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble nodo) {
        siguiente = nodo;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }
}
