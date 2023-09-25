package tp_2.ejerc_6;

public class Cliente {
    private String nombre;
    private String patenteAuto;

    public Cliente(String nombre, String patenteAuto) {
        this.nombre = nombre;
        this.patenteAuto = patenteAuto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatenteAuto() {
        return patenteAuto;
    }

    public void setPatenteAuto(String patenteAuto) {
        this.patenteAuto = patenteAuto;
    }
}
