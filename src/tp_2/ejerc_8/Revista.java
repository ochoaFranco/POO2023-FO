package tp_2.ejerc_8;

import java.time.LocalDate;

public class Revista extends Publicacion {
    private final int ISSN;
    private final int NROPUBLICACION;
    private int ejemplares, numPaginas, ejemplaresPrestados;

    public Revista(String nombre, String editor, String telContacto, int cantPaginas, int ANIOPUBLICACION, String titulo, int ISSN, int NROPUBLICACION, int ejemplares, int numPaginas, int ejemplaresPrestados) {
        super(nombre, editor, telContacto, cantPaginas, ANIOPUBLICACION);
        this.ISSN = ISSN;
        this.NROPUBLICACION = NROPUBLICACION;
        this.ejemplares = ejemplares;
        this.numPaginas = numPaginas;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
}
