package tp_2.ejerc_6;

public class Playero {
    private static int id = 100;
    private int playeroId = id;
    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
    private String telefono;
    private double montoTotal = 0;

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

    public void atenderCliente(Cliente cliente, int cantLitrosCarga, Expendedor expendedor) {
        Combustible combustible = expendedor.getTipo();
        double totalVenta = combustible.getPrecioVenta() * cantLitrosCarga;
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
