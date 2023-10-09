package tp_2.ejerc_10.empleado;

import java.time.LocalDate;
import java.util.Date;

public class EmpComision extends Empleado {
    private int cantVentas;
    private int porcentajeVentas;
    private float brutoVentas;

    public EmpComision() {
    }

    public EmpComision(String nombre, String apellido, String tel, String CUIT, float sueldo, int cantVentas, int porcentajeVentas, LocalDate fechaCumpleanios) {
        super(nombre, apellido, tel, CUIT, sueldo, fechaCumpleanios);
        this.cantVentas = cantVentas;
        this.porcentajeVentas = porcentajeVentas;
    }

    @Override
    public void calcularSueldo() {
        LocalDate ahora = LocalDate.now();
        sueldo = brutoVentas * porcentajeVentas;
        if (ahora.isEqual(fechaCumpleanios)) {
            sueldo += (float) (valorDiaCumpleanios + (brutoVentas * 0.5));
        }
    }

    public void realizarVenta(int suma) {
        cantVentas += 1;
        brutoVentas += suma;
    }

}
