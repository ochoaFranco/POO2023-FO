package tp_2.ejerc_10.empleado;

import java.time.LocalDate;
import java.util.Date;

public class EmpComSalarioBase extends Empleado {
    private float montoFijo;
    private int cantVentas;
    private int porcentajeVentas;
    private float brutoVentas;

    public EmpComSalarioBase() {
    }

    public EmpComSalarioBase(String nombre, String apellido, String tel, String CUIT, float sueldo, float montoFijo, int cantVentas, int porcentajeVentas, LocalDate fechaCumpleanios) {
        super(nombre, apellido, tel, CUIT, sueldo, fechaCumpleanios);
        this.montoFijo = montoFijo;
        this.cantVentas = cantVentas;
        this.porcentajeVentas = porcentajeVentas;
    }

    @Override
    public void calcularSueldo() {
        LocalDate ahora = LocalDate.now();
        sueldo = (brutoVentas * porcentajeVentas) + montoFijo;
        if (ahora.isEqual(fechaCumpleanios)) {
            sueldo += (float) (valorDiaCumpleanios + 1000 + (brutoVentas * 0.5));
        }
    }
    public void realizarVenta(int suma) {
        cantVentas += 1;
        brutoVentas += suma;
    }
}
