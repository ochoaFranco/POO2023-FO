package tp_2.ejerc_8;

import java.time.LocalDate;

public class Revista extends Publicacion {
    private final int ISSN;
    private final int NROPUBLICACION;
    private int ejemplares, ejemplaresPrestados;

    public Revista(String nombre, String editor, String telContacto, int cantPaginas, int ANIOPUBLICACION, int ISSN, int NROPUBLICACION, int ejemplares) {
        super(nombre, editor, telContacto, cantPaginas, ANIOPUBLICACION);
        this.ISSN = ISSN;
        this.NROPUBLICACION = NROPUBLICACION;
        this.ejemplares = ejemplares;
    }

    public int getISSN() {
        return ISSN;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    public boolean prestarRevista() {
        if (ejemplares > 1) {
            ejemplares -= 1;
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }
    public boolean devolverRevista() {
        if (ejemplaresPrestados > 0) {
            ejemplares++;
            ejemplaresPrestados -= 1;
            return true;
        }
        return false;
    }
    public void descripcion() {
        System.out.println("La revista " + "'" + getNombre() + "'" + " de " + " tiene " + getCantPaginas() + " paginas y quedan: " + ejemplares + " ejemplares ya que se prestaron " + ejemplaresPrestados + " libros");
    }
}
