package tp_2.ejerc_10.empleado;

import java.time.LocalDate;
import java.util.Date;

public class Pasante extends Empleado{
    public Pasante() {
    }

    public Pasante(String nombre, String apellido, String tel, String CUIT, float sueldo, LocalDate fechaCumpleanios) {
        super(nombre, apellido, tel, CUIT, sueldo, fechaCumpleanios);
    }

    @Override
    public void calcularSueldo() {
        sueldo = 0;
    }
}
