package tp_2.ejerc_1;

import java.time.LocalDate;
import java.util.ArrayList;

public final class Gestor_Socio {
    private static final ArrayList<Socio> socios = new ArrayList<>();
    public static void agregarSocios(Socio socio) {
        socios.add(socio);
    }
    public static void generarReporte() {
        System.out.println("\nReporte mensual de socios inscriptos");
        int mesActual = LocalDate.now().getMonthValue();
        for (Socio s : socios) {
            int mesInscripcion = s.getFechaInscripcion().getMonthValue();
            if (mesInscripcion == mesActual) {
                System.out.println(s.getNombre() + " " + s.getApellido() + " " + s.getFechaInscripcion() + " " + s.getNro_socio());
            }
        }
    }
    public static void mostrarSocios() {
        for (Socio s : socios) {
            System.out.println("Nombre: " + s.getNombre() + " \nApellido :" + s.getApellido() + "\nnro socio: " + s.getNro_socio() + " " + " \nedad: " + s.getEdad()  + " \nfecha de inscripcion: " + s.getFechaInscripcion() + " \nsuscripcion: " + s.getSuscripcion());
            System.out.println();
        }
    }
}
