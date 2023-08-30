package sistema_biblioteca_ejerc06;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;
    Biblioteca() {
        libros = new ArrayList<Libro>();
    }
   public ArrayList<Libro> buscarPorTitulo(String titulo) {
       ArrayList<Libro> resultados = new ArrayList<Libro>();
       for (Libro l : libros) {
           if (l.getTitulo().equalsIgnoreCase(titulo)) {
               resultados.add(l);
           }
       }
       return resultados;
   }
    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<Libro>();
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(l);
            }
        }
        return resultados;
    }

    public void agregar(Libro libro) {
        libros.add(libro);
    }

    public int cantidadPrestamos() {
        int total = 0;
        for (Libro l : libros) {
            total += l.getEjemplaresPrestados();
        }
        return total;
    }
}
