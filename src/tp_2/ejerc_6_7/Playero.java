package tp_2.ejerc_6_7;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

public class Playero {
    private static int id = 100;
    private int playeroId = id;
    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
    private String telefono;
    private double montoTotal = 0;
    private boolean permiteHacerDescuento;

    public Playero(String nombre, String apellido, String dni, String domicilio, String telefono) {
        id += 1;
        this.playeroId = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    public Playero(String nombre, String apellido) {
        id += 1;
        this.playeroId = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void setPermiteHacerDescuento(boolean permiteHacerDescuento) {
        this.permiteHacerDescuento = permiteHacerDescuento;
    }

    void realizarDescuentoCliente(int cantLitrosCarga, Expendedor expendedor) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = InformeVentas.getClientes();
        Cliente cliente = null;
        for (Cliente c: clientes) {
            System.out.println("Nombre: " + c.getNombre() + " ID: " + c.getIdCliente());
        }
        System.out.println("Ingrese el ID del cliente a realizar el descuento");
        int clienteid = sc.nextInt();
        for (Cliente c: clientes) {
            if (c.getIdCliente() == clienteid) {
                cliente = c;
            }
        }
        atenderCliente(cliente, cantLitrosCarga, expendedor, true);


    }
    public void atenderCliente(Cliente cliente, int cantLitrosCarga, Expendedor expendedor, boolean descuento10) {
        Combustible combustible = expendedor.getTipo();
        ArrayList<Integer> topCliente = InformeVentas.getClientesTop10();
        double totalVenta = combustible.getPrecioVenta() * cantLitrosCarga;
        if (topCliente.contains(cliente.getIdCliente())) {
            double descuento = 0.05 * totalVenta;
            totalVenta -= descuento;
        }
        if (descuento10) {
            double descuento10Porc = 0.10 * totalVenta;
            totalVenta -= descuento10Porc;
            System.out.println("Descuento realizado con exito.");
        }
        expendedor.setCantLitrosExpendidos(expendedor.getCantLitrosExpendidos() + cantLitrosCarga);
        Venta venta = new Venta(playeroId, cliente.getIdCliente(), combustible, totalVenta);
        montoTotal += totalVenta;
        expendedor.setCantVentas(expendedor.getCantVentas() + 1);
        InformeVentas.agregarVentas(venta);
        InformeVentas.agregarExpendedores(expendedor);
        cliente.setMontoTotalCompra(cliente.getMontoTotalCompra() + totalVenta);
        InformeVentas.agregarClientes(cliente);
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public int getPlayeroId() {
        return playeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
