package tp_2.ejerc_8.main;

import tp_2.ejerc_8.Biblioteca;
import tp_2.ejerc_8.Libro;
import tp_2.ejerc_8.Revista;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Fictions", "luis", "1231231", 863, 2006, "Jorge Luis Borges", 203321, 30);
        Libro libro2 = new Libro("Things we lost in the fire", "jose", "123123", 208, 2003, "Mariana Enriquez", 978045, 45);
        Revista revista1 = new Revista("nature", "NatGeo", "13123", 231, 1999, 123123, 2, 200);
        Revista revista2 = new Revista("nature2", "NatGeo2", "13123", 233, 2000, 123321, 4, 250);



        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.agregarRevista(revista1);
        biblioteca1.agregarRevista(revista2);

        libro1.descripcion();
        libro2.descripcion();
        revista1.descripcion();
        revista2.descripcion();
        Main obj = new Main();
        obj.cantidadPaginas(libro1, libro2);
        obj.cantidadPaginasRevista(revista1, revista2);
        System.out.println();
        obj.prestar(libro1);
        obj.prestar(libro2);
        System.out.println();
        obj.prestarRevista(revista1);
        obj.prestarRevista(revista2);
        System.out.println("Cantidad total de prestamos: " + biblioteca1.cantidadPrestamos());
    }
    public void prestar(Libro l) {
        System.out.println("cantidad de ejemplares del libro :" + l.getNombre() + " " + l.getEjemplares());
        if (l.prestarLibro()) {
            System.out.println("El libro se ha prestado satisfactoriamente.");
            System.out.println("Cantidad de ejemplares luego del prestamo: " + l.getEjemplares());
        } else {
            System.out.println("Solo hay un ejemplar por lo tanto no se pudo realizar el prestamo.");
        }
    }
    public void prestarRevista(Revista r) {
        System.out.println("cantidad de ejemplares de la revista :" + r.getNombre() + " " + r.getEjemplares());
        if (r.prestarRevista()) {
            System.out.println("La revista se ha prestado satisfactoriamente.");
            System.out.println("Cantidad de ejemplares luego del prestamo: " + r.getEjemplares());
        } else {
            System.out.println("Solo hay un ejemplar por lo tanto no se pudo realizar el prestamo.");
        }
    }

    public void cantidadPaginas(Libro libro1, Libro libro2) {
        if (libro1.getCantPaginas() > libro2.getCantPaginas()) {
            System.out.println(libro1.getNombre() + " tiene mas paginas que " + libro2.getNombre());
        } else if (libro1.getCantPaginas() < libro2.getCantPaginas()) {
            System.out.println(libro2.getNombre() + " tiene mas paginas que " + libro1.getNombre());
        } else {
            System.out.println(libro1.getNombre() + " tiene la misma cantidad de paginas que " + libro2.getNombre());
        }
    }
    public void cantidadPaginasRevista(Revista revista1, Revista revista2) {
        if (revista1.getCantPaginas() > revista2.getCantPaginas()) {
            System.out.println(revista1.getNombre() + " tiene mas paginas que " + revista2.getNombre());
        } else if (revista1.getCantPaginas() < revista2.getCantPaginas()) {
            System.out.println(revista2.getNombre() + " tiene mas paginas que " + revista1.getNombre());
        } else {
            System.out.println(revista1.getNombre() + " tiene la misma cantidad de paginas que " + revista2.getNombre());
        }
    }
}
