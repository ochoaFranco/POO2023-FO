package tp_2.Ejerc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestorAgencia {
    private static ArrayList<PaqueteTurismo> paqueteTurismos = new ArrayList<PaqueteTurismo>();
    private static ArrayList<PaqueteTurismo> ventasRealizadas = new ArrayList<PaqueteTurismo>();
    private static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();


    public static void agregarPaquete(PaqueteTurismo paquete) {
        paqueteTurismos.add(paquete);
        System.out.println("Paquete agregado con exito");
    }

    public static void mostrarTodosLosPaquetes() {
        System.out.println("\n Paquetes..");
        for (PaqueteTurismo p : paqueteTurismos) {
            p.mostrarPaquete();
            System.out.println();
        }
    }
    public static ArrayList<PaqueteTurismo> getPaquetes() {
        return paqueteTurismos;
    }

    public static void agregarProveedores(Proveedor p) {
        proveedores.add(p);
    }
    public static void mostrarProveedores() {
        System.out.println("\nProveedores:");
        for (Proveedor p: proveedores) {
            System.out.println(p.getProveedor());
        }
    }

    public static void agregarClientes(Cliente c) {
        clientes.add(c);
    }
    public static void mostrarClientes() {
        System.out.println("\nClientes:");
        for (Cliente c: clientes) {
            System.out.println(c.getNombre());
            c.mostrarComprasCliente();
        }
    }
    public static void informeVentas() {
        System.out.println("Informe de ventas");
        for (Cliente c : clientes) {
            ventasRealizadas.addAll(c.getCompras());
        }
        if (ventasRealizadas.isEmpty()) {
            System.out.println("No se realizaron ventas.");
            return;
        }

        Collections.sort(ventasRealizadas, new Comparator<PaqueteTurismo>() {
            @Override
            public int compare(PaqueteTurismo paqueteT1, PaqueteTurismo paqueteT2) {
                return  paqueteT1.getDestino().compareTo(paqueteT2.getDestino());
            }
        });
        System.out.println("Paquetes vendidos.");
        for (PaqueteTurismo p : ventasRealizadas) {
            p.mostrarPaquete();
            System.out.println();
        }
    }

    public static void clientesDestinosFavoritos() {
        System.out.println("\nDestino favorito de los clientes");
        for (Cliente c : clientes) {
            System.out.println(c.getDestinoFavorito());
        }
    }
}
