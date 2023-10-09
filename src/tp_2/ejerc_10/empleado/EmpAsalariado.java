package tp_2.ejerc_10.empleado;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class EmpAsalariado extends Empleado {
    private float sumaFijaMensual = 0;

    public EmpAsalariado() {
    }

    public EmpAsalariado(String nombre, String apellido, String tel, String CUIT, float sueldo, float sumaFijaMensual, LocalDate fechaCumpleanios) {
        super(nombre, apellido, tel, CUIT, sueldo,fechaCumpleanios);
        this.sumaFijaMensual = sumaFijaMensual;
    }

    @Override
    public void calcularSueldo() {
        LocalDate ahora = LocalDate.now();
        sueldo = sumaFijaMensual;
        if (ahora.isEqual(fechaCumpleanios)) {
            sueldo += valorDiaCumpleanios + 1000;
        }
    }
}
