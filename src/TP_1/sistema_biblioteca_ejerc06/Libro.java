package TP_1.sistema_biblioteca_ejerc06;

public class Libro {
    private final String titulo, autor;
    private final int ISBN;
    private int ejemplares, numPaginas, ejemplaresPrestados;

    public Libro(String titulo, String autor, int ISBN, int ejemplares, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ejemplares = ejemplares;
        this.numPaginas = numPaginas;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public boolean prestarLibro() {
        if (ejemplares > 1) {
            ejemplares -= 1;
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }
    public boolean devolverLibro() {
        if (ejemplaresPrestados > 0) {
            ejemplares++;
            ejemplaresPrestados -= 1;
            return true;
        }
        return false;
    }
    public String descripcion() {
        return "El libro " + "'" + titulo + "'" + " de " + autor + " tiene " + numPaginas + " paginas y quedan: " + ejemplares + " ejemplares ya que se prestaron " + ejemplaresPrestados + " libros";
    }
}
