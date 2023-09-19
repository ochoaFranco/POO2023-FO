package tp_2.Ejerc2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String destinoFavorito;
    private ArrayList<PaqueteTurismo> compras = new ArrayList<>();
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void seleccionarPaquete() {
        ArrayList<PaqueteTurismo> paquetes = GestorAgencia.getPaquetes();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int opcion;
        PaqueteTurismo paquete;
        System.out.println("Se mostraran los paquetes disponibles para que puedan ser comprados.");
        System.out.println();
        while (i < paquetes.size()) {
            paquete = paquetes.get(i);
            paquete.mostrarPaquete();
            System.out.println("Desea comprar el paquete? 1 para confirmar o 2 para seguir mirando: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                i = paquetes.size();
                compras.add(paquete);
            }
            i++;
        }
    }

    public ArrayList<PaqueteTurismo> getCompras() {
        return compras;
    }
    public void mostrarComprasCliente() {
        if (compras.isEmpty()) {
            System.out.println("El cliente no ha realizado compras.");
            return;
        }
        System.out.println("\nPaquetes que compro el cliente: ");
        for (PaqueteTurismo p : compras) {
            p.mostrarPaquete();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setDestinoFavorito(String destinoFavorito) {
        this.destinoFavorito = destinoFavorito;
    }

    public String getDestinoFavorito() {
        return destinoFavorito;
    }
}
