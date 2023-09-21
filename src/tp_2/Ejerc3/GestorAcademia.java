package tp_2.Ejerc3;

import java.util.ArrayList;
import java.util.Random;

public class GestorAcademia {
    private static ArrayList<Comision> comisiones;
    private static void inscribirALumno(Alumno alu, Comision com) {
        com.agregarAlumno(alu);
        Random random = new Random();
        int credencial = random.nextInt(100);
        alu.setCredencial(credencial);
    }

    public static void agregarComisiones(Comision com) {
        comisiones.add(com);
    }
    public static void mostrarComisiones() {
        for (Comision c : comisiones) {
            System.out.println(c.);
        }
    }

}
