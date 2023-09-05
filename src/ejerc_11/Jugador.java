package ejerc_11;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
    private ArrayList<Palabra> palabras = new ArrayList<Palabra>();
    private int puntajeTotal;
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mostrarPalabras() {
	    for (Palabra i : palabras)
			System.out.println(i.getPalabra());
	}

	public void agregarPalabras(Palabra p, Diccionario dic) {
		ArrayList<Palabra> diccionario = dic.getPalabrasDiccionario();
		boolean encontrada = false;
		for (Palabra pa : diccionario) {
		    if (pa.getPalabra().equals(p.getPalabra())) {
			    palabras.add(p);
			    encontrada = true;
			    break;
			}
		}
		if (!encontrada)
		    System.out.println("La palabra no se encuentra en el diccionario.");
	}


	private void calcularPuntajeTotal() {
	    for (Palabra p : palabras) {
		    puntajeTotal += p.getPuntaje();
		}
	}

	public int getPuntaje() {
		calcularPuntajeTotal();
	    return puntajeTotal;
	}

	public ArrayList<Palabra> getPalabras() {
	    return palabras;
	}

}
