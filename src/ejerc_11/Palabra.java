package ejerc_11;

public class Palabra {
    private String palabra;
    private int puntaje;

    public Palabra(String palabra) {
	    this.palabra = palabra.toLowerCase();
	    calcularPuntaje();
	}

	private void calcularPuntaje() {
	    if (palabra.contains("k") || palabra.contains("z") || palabra.contains("x") || palabra.contains("y") || palabra.contains("w") || palabra.contains("q")) {
			puntaje = 11;
		}
		if (palabra.length() > 5)
		    puntaje += 3;
		else
		    puntaje = 10;
	}

	public String getPalabra() {
	    return palabra;
	}

	public int getPuntaje() {
	    return puntaje;
	}
}
