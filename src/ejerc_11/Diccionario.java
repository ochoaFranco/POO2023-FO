import java.util.ArrayList;

Public class Diccionario {

    private ArrayList<Palabra> palabras;
    
    public void mostrarPalabras() {
		for (Palabra p : palabras) 
		    system.out.println(p.getPalabra());
	}
	
	public void agregarPalabras(String p) {
	    palabras.add(New Palabra(p));
	}
	
	public ArrayList<Palabra> getPalabras() {
	    return palabras;
	}
}
