package tp_2.ejerc_6_7;

public class Venta {
    private int idPlayero;
    private int idCliente;
    private Combustible tipo;
    private double totalVenta;
    public Venta(int idPlayero, int idCliente, Combustible tipo, double totalVenta) {
        this.idCliente = idCliente;
        this.idPlayero = idPlayero;
        this.tipo = tipo;
        this.totalVenta = totalVenta;
    }

    public int getIdPlayero() {
        return idPlayero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Combustible getTipo() {
        return tipo;
    }

    public double getTotalVenta() {
        return totalVenta;
    }
}
