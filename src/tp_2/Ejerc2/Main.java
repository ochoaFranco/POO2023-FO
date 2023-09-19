package tp_2.Ejerc2;

public class Main {
    public static void main(String[] args) {
        // Creando proveedor y guia.
        Proveedor p1 = new Proveedor("Josefo");
        Proveedor p2 = new Proveedor("Miguel");
        p1.setProveedorTransporte("terrestres");
        p2.setProveedorTransporte("maritimas");
        GestorAgencia.agregarProveedores(p1);
        GestorAgencia.agregarProveedores(p2);
        GestorAgencia.mostrarProveedores();

        GuiaTurismo guia = new GuiaTurismo("Pepe");
        GuiaTurismo guia2 = new GuiaTurismo("Pedro");
        System.out.println("nombre del guia 1 " + guia.getNombre());
        System.out.println("nombre del guia 2 " + guia2.getNombre());
        System.out.println();
        System.out.println("Excursiones guia 1:");
        // agrego excursiones y las muestro.
        guia.agregarExcursion("visitar el lago");
        guia.agregarExcursion("salir a correr en grupo");
        guia.agregarExcursion("ir a pescar");
        guia.mostrarExcursiones();
        System.out.println();
        System.out.println("Excursiones guia 2:");
        // agrego excursiones y las muestro.
        guia2.agregarExcursion("ir a la plaza");
        guia2.agregarExcursion("ir al muelle");
        guia2.agregarExcursion("ir a la playa");
        guia2.mostrarExcursiones();
        System.out.println();
        // armo el paquete de excursiones.
        PaqueteTurismo paquete1 = new PaqueteTurismo("low-cost", "Cordoba", guia);
        PaqueteTurismo paquete2 = new PaqueteTurismo("promo costera", "San bernardo", guia2);
        // Agrego excursiones para gestionarlas.
        GestorAgencia.agregarPaquete(paquete1);
        GestorAgencia.agregarPaquete(paquete2);
        GestorAgencia.mostrarTodosLosPaquetes();

        // Creo el cliente y elijo los paquetes.
        Cliente c1 = new Cliente("Franco");
        Cliente c2 = new Cliente("Po");
        c1.setDestinoFavorito("La paz");
        c2.setDestinoFavorito("Japon");
        GestorAgencia.agregarClientes(c1);
        GestorAgencia.agregarClientes(c2);
        System.out.println("\n para el cliente 1");
        c1.seleccionarPaquete();
        System.out.println("\n para el cliente 2");
        c2.seleccionarPaquete();
        GestorAgencia.mostrarClientes();
        System.out.println();

        // Muestro todas las ventas realizadas.

        GestorAgencia.informeVentas();
        GestorAgencia.clientesDestinosFavoritos();
    }
}
