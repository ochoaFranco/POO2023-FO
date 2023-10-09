package tp_2.ejerc_10.empleado;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String tel;
    protected String CUIT;
    protected float sueldo;
    protected LocalDate fechaCumpleanios;
    protected final int valorDiaCumpleanios = 2000;
    protected Empleado() {
    }
    protected Empleado(String nombre, String apellido, String tel, String CUIT, float sueldo, LocalDate fechaCumpleanios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.CUIT = CUIT;
        this.sueldo = sueldo;
        this.fechaCumpleanios = fechaCumpleanios;
    }
    public abstract void calcularSueldo();

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
