package tp_2.ejerc_6_7;

public class Expendedor {
    private static int nro = 0;
    private int nroExpendedor = nro;
    private Combustible combustible;
    private int cantTotalLitros;
    private int cantLitrosExpendidos = 0;
    private int cantVentas;

    public Expendedor(Combustible combustible, int cantTotalLitros) {
        this.combustible = combustible;
        this.cantTotalLitros = cantTotalLitros;
        nro += 1;
        nroExpendedor = nro;
    }

    public int getNroExpendedor() {
        return nroExpendedor;
    }

    public Combustible getTipo() {
        return combustible;
    }

    public void setTipo(Combustible combustible) {
        this.combustible = combustible;
    }

    public int getCantTotalLitros() {
        return cantTotalLitros;
    }

    public void setCantTotalLitros(int cantTotalLitros) {
        this.cantTotalLitros = cantTotalLitros;
    }

    public int getCantLitrosExpendidos() {
        return cantLitrosExpendidos;
    }

    void setCantLitrosExpendidos(int cantLitrosExpendidos) {
        this.cantLitrosExpendidos = cantLitrosExpendidos;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
}
