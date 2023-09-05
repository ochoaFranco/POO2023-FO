package ejerc_11;

import java.util.ArrayList;

public class Diccionario {

    private ArrayList<Palabra> palabras = new ArrayList<Palabra>();

    public void mostrarPalabras() {
		for (Palabra p : palabras)
		    System.out.println(p.getPalabra());
	}

	public void agregarPalabras(String p) {
		Palabra pa = new Palabra(p);
	    palabras.add(pa);
	}

	public ArrayList<Palabra> getPalabrasDiccionario() {
	    return palabras;
	}
}
