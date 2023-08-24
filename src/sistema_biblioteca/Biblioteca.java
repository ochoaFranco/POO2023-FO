package sistema_biblioteca;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;
    Biblioteca() {
        libros = new ArrayList<Libro>();
    }
   public ArrayList<Libro> buscarPorTitulo(Libro libro) {
       ArrayList<Libro> resultados = new ArrayList<Libro>();
       for (Libro l : libros) {
           if (l.getTitulo().toLowerCase().equals(libro.getTitulo().toLowerCase())) {
               resultados.add(l);
           }
       }
       return resultados;
   }
    public ArrayList<Libro> buscarPorAutor(Libro libro) {
        ArrayList<Libro> resultados = new ArrayList<Libro>();
        for (Libro l : libros) {
            if (l.getAutor().toLowerCase().equals(libro.getAutor().toLowerCase())) {
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
