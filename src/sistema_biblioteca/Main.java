package sistema_biblioteca;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Fictions", "Jorge Luis Borges", 863, 10, 203);
        Libro libro2 = new Libro("Things we lost in the fire", "Mariana Enriquez",978045, 1, 208);
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregar(libro1);
        biblioteca1.agregar(libro2);
        System.out.println(libro1.descripcion());
        System.out.println(libro2.descripcion());
        Main obj = new Main();
        obj.cantidadPaginas(libro1, libro2);
        System.out.println();
        obj.prestar(libro1);
        obj.prestar(libro2);
        System.out.println("Cantidad total de prestamos: " + biblioteca1.cantidadPrestamos());
    }

    public void prestar(Libro l) {
        System.out.println("cantidad de ejemplares del libro :" + l.getTitulo() + " " + l.getEjemplares());
        if (l.prestarLibro()) {
            System.out.println("El libro se ha prestado satisfactoriamente.");
            System.out.println("Cantidad de ejemplares luego del prestamo: " + l.getEjemplares());
        } else {
            System.out.println("Solo hay un ejemplar por lo tanto no se pudo realizar el prestamo.");
        }
    }

    public void cantidadPaginas(Libro libro1, Libro libro2) {
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println(libro1.getTitulo() + " tiene mas paginas que " + libro2.getTitulo());
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println(libro2.getTitulo() + " tiene mas paginas que " + libro1.getTitulo());
        } else {
            System.out.println(libro1.getTitulo() + " tiene la misma cantidad de paginas que " + libro2.getTitulo());
        }
    }
}
