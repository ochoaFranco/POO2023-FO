package tp_2.ejerc_8;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Revista> revistas;
    private ArrayList<Tesis> tesis;
    private ArrayList<Diario> diarios;
    public Biblioteca() {
        libros = new ArrayList<Libro>();
        revistas = new ArrayList<Revista>();
    }
    public ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<Libro>();
        for (Libro l : libros) {
            if (l.getNombre().equalsIgnoreCase(titulo)) {
                resultados.add(l);
            }
        }
        return resultados;
    }
    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<Libro>();
        for (Libro l : libros) {
            if (l.getAutores().contains(autor.toLowerCase())) {
                resultados.add(l);
            }
        }
        return resultados;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void agregarRevista(Revista revista) {
        revistas.add(revista);
    }

    public int cantidadPrestamos() {
        int total = 0;
        for (Libro l : libros) {
            total += l.getEjemplaresPrestados();
        }
        for (Revista r : revistas) {
            total += r.getEjemplaresPrestados();
        }
        return total;
    }
}
