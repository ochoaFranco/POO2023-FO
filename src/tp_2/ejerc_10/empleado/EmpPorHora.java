package tp_2.ejerc_10.empleado;

import java.time.LocalDate;
import java.util.Date;

public class EmpPorHora extends Empleado {
    private int cantHorasMes;
    private float precioPorHora;
    public EmpPorHora() {
    }

    public EmpPorHora(String nombre, String apellido, String tel, String CUIT, float sueldo, int cantHorasMes, int precioPorHora, LocalDate fechaCumpleanios) {
        super(nombre, apellido, tel, CUIT, sueldo, fechaCumpleanios);
         this.cantHorasMes = cantHorasMes;
        this.precioPorHora = precioPorHora;
    }

    @Override
    public void calcularSueldo() {
        sueldo = cantHorasMes * precioPorHora;
        if (cantHorasMes >= 40) {
            sueldo *= (float) 20 / 100;
        }
        LocalDate ahora = LocalDate.now();
        if (ahora.isEqual(fechaCumpleanios)) {
            sueldo +=  valorDiaCumpleanios;
        }

    }
}
