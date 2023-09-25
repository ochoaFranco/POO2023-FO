package tp_2.ejerc_6;

public class Combustible {
    private enum Tipo{GASOIL, NAFTA, KEROSENE};
    private Tipo tipo;
    private double precioVenta;

    public Combustible(String tipo, double precioVenta) {
        tipo = tipo.toLowerCase();
        switch (tipo) {
            case "nafta":
                this.tipo = Tipo.NAFTA;
            case "kerosene":
                this.tipo = Tipo.KEROSENE;
            case "gasoil":
                this.tipo = Tipo.GASOIL;
        }
        this.precioVenta = precioVenta;
    }

    public String getTipo() {
        switch (tipo) {
            case NAFTA:
                return "nafta";
            case GASOIL:
                return "gasoil";
            case KEROSENE:
                return "kerosene";
        }
        return null;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
