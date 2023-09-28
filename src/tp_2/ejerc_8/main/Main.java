package tp_2.ejerc_8.main;

import tp_2.ejerc_8.Biblioteca;
import tp_2.ejerc_8.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Fictions", "luis", "1231231", 863, 2006, "Jorge Luis Borges", 203321);
        Libro libro2 = new Libro("Things we lost in the fire", "jose", "123123", 208, 2003, "Mariana Enriquez", 978045);

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregar(libro1);
        biblioteca1.agregar(libro2);
        libro1.descripcion();
        libro2.descripcion();
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
