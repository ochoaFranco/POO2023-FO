import java.util.ArrayList;

public class Jugador {
    private ArrayList<Palabra> palabras;
    private int puntajeTotal;
    
    public ArrayList<String> mostrarPalabras() {
	    for (Palabra i : palabras)
			system.out.println(i.getPalabra());
	}
	
	public void agregarPalabras(Palabra p) {
		ArrayList<Palabra> diccionario = getPalabras();
		boolean encontrada = false;
		for (Palabra pa : diccionario) {
		    if (pa.getPalabra().equals(p.getPalabra())) {
			    palabras.add(p);
			    encontrada = true;
			    break;
			}
		}
		if (!encontrada)
		    system.out.println("La palabra no se encuentra en el diccionario.");	
	}
	
	
	public void calcularPuntajeTotal() {
	    for (Palabra p : palabras) {
		    puntajeTotal += p.getPuntaje();
		}
	}
	
	public int getPuntaje() {
	    return puntajeTotal;
	}
	
	public ArrayList<Palabra> getPalabras() {
	    return palabras;
	}

}
