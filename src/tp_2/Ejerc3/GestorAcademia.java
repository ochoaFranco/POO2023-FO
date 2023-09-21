package tp_2.Ejerc3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GestorAcademia {
    private static ArrayList<Comision> comisiones = new ArrayList<Comision>();
    private static ArrayList<Integer> asistencia = new ArrayList<>(Collections.nCopies(500, 0));
    private static int proxIdEstudiante = 100;
    public static void inscribirALumno(Alumno alu, Comision com) {
        com.agregarAlumno(alu);
        alu.setCredencial(proxIdEstudiante);
        proxIdEstudiante++;
    }

    public static void agregarComisiones(Comision com) {
        comisiones.add(com);
    }
    public static void calcularSueldo() {
        for (Comision s: comisiones) {
            for (Alumno a: s.getListadoAlumnos()) {
                double monto = 10 * asistencia.get(a.getCredencial() - 100);
                s.getProfesor().cobrarSueldo(monto);
            }
        }
    }

    public static void calcularDisciplinaMayorRemuneracion() {
        double mayorSueldo = -500;
        Comision mejorRemunerada = new Comision();
        for (Comision c : comisiones) {
            double temp = c.getProfesor().getSueldo();
            if (temp > mayorSueldo) {
                mayorSueldo = temp;
                mejorRemunerada = c;
            }
        }
        System.out.println("La comision mejor remunerada es: " + mejorRemunerada.getDisciplina().getNombre() + " " + mejorRemunerada.getNombre());
    }

    public static void tomarAsistencia(Alumno alu) {
        int credencial = alu.getCredencial();
        int valor = asistencia.get(credencial - 100);
        valor++;
        asistencia.set(credencial - 100, valor);
    }

}
