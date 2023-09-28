package tp_2.ejerc_8;

import java.util.ArrayList;

public class Libro extends Publicacion {

    private ArrayList<String> autores = new ArrayList<>();
    private final int ISBN;
    private int ejemplares, ejemplaresPrestados;

    public Libro(String nombre, String editor, String telContacto, int cantPaginas, int ANIOPUBLICACION, String autor, int ISBN, int cantEjemplares) {
        super(nombre, editor, telContacto, cantPaginas, ANIOPUBLICACION);
        this.autores.add(autor);
        this.ISBN = ISBN;
        ejemplares = cantEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void mostrarAutores() {
        System.out.println("Autores.");
        for (String a: autores) {
            System.out.print(a + " ");
        }
    }

    public void agregarAutor(String autor) {
        this.autores.add(autor);
    }
    public ArrayList<String> getAutores() {
        return autores;
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
    public void descripcion() {
        System.out.println("El libro " + "'" + getNombre() + "'" +  "tiene " + getCantPaginas() + " paginas y quedan: " + ejemplares + " ejemplares ya que se prestaron " + ejemplaresPrestados + " libros");
        mostrarAutores();

    }

}
