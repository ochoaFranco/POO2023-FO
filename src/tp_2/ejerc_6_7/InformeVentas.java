package tp_2.ejerc_6_7;

import java.util.*;

public class InformeVentas {
    private static ArrayList<Venta> ventas = new ArrayList<Venta>();
    private static ArrayList<Expendedor> expendedores = new ArrayList<Expendedor>();
    private static ArrayList<Playero> playeros = new ArrayList<Playero>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList<Integer> clientesTop10 = new ArrayList<Integer>();
    private static ArrayList<Integer> playeroTop10 = new ArrayList<Integer>();



    static void agregarVentas(Venta venta) {
        ventas.add(venta);
    }

    static void agregarClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public static void agregarPlayeros(Playero playero) {
        playeros.add(playero);
    }

    static void agregarExpendedores(Expendedor expendedor) {
        expendedores.add(expendedor);
    }

    public static void mostrarVentas() {
        for (Venta v : ventas) {
            System.out.println("Playero ID: " + v.getIdPlayero() + " Total de venta: " + v.getTotalVenta() +
                    " al cliente: " + v.getIdCliente() + " del tipo de combustible: " + v.getTipo().getTipoCombustible());
        }
    }

    public static void expendedoresPorLitrosExpendidos() {
        System.out.println("\nLISTA DE EXPENDEDORES POR LITROS EXPENDIDOS");
        Collections.sort(expendedores, Comparator.comparingInt(Expendedor::getCantLitrosExpendidos).reversed());
        for (Expendedor e : expendedores) {
            System.out.println("Expendedor: " + e.getNroExpendedor() + " cant.Litros expendidos: " + e.getCantLitrosExpendidos());

        }
    }

    public static void empleadosPorMontoTotalDeVentas() {
        System.out.println("\nLISTA DE EMPLEADOS POR MONTO TOTAL DE VENTA.");
        Collections.sort(playeros, Comparator.comparingDouble(Playero::getMontoTotal).reversed());
        int i = 0;
        for (Playero p : playeros) {
            System.out.println("Playero: " + p.getNombre() + " ID: " + p.getPlayeroId() + " Monto total de venta: " + p.getMontoTotal());
            if (i < 10) {
                playeroTop10.add(p.getPlayeroId());
            }
        }
    }

    public static void surtidoresPorMontoTotalVenta() {
        System.out.println("\nLISTA DE SURTIDORES POR MONTO TOTAL DE VENTA.");
        Collections.sort(expendedores, Comparator.comparingInt(Expendedor::getCantVentas).reversed());
        for (Expendedor e : expendedores) {
            System.out.println("Expendedor: " + e.getNroExpendedor() + " MontoTotal de venta: " + e.getCantVentas() + " Tipo de combustible: " + e.getTipo().getTipoCombustible());
        }
    }


    public static void clienteSegunMontoTotal() {
        System.out.println("\nLISTA DE TOP 10 CLIENTES SEGUN MONTO TOTAL DE COMPRA");
        Collections.sort(clientes, Comparator.comparingDouble(Cliente::getMontoTotalCompra).reversed());

        Set<Integer> idEncontrados = new HashSet<>();
        int idUnico = 0;
        for (Cliente c : clientes) {
            if (!idEncontrados.contains(c.getIdCliente())) {
                System.out.println("Cliente: " + c.getNombre() + " ID: " + c.getIdCliente() + " Monto total de compra: " + c.getMontoTotalCompra());
                idEncontrados.add(c.getIdCliente());
                idUnico++;
                clientesTop10.add(c.getIdCliente());
            }
            if (idUnico == 10) {
                break;
            }
        }
    }

    static ArrayList<Integer> getClientesTop10() {
        return clientesTop10;
    }
    static ArrayList<Integer> getPlayeroTop10() {
        return playeroTop10;
    }

    public static void realizarDescuento(Playero p1,  int cantLitrosCarga, Expendedor expendedor) {
        if (playeroTop10.contains(p1.getPlayeroId())) {
            p1.realizarDescuentoCliente(cantLitrosCarga, expendedor);
        } else {
            System.out.println("El empleado no esta dentro del top 10");
        }

    }
    static ArrayList<Cliente> getClientes() {
        return clientes;
    }

}