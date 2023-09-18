package tp_2.ejerc_1;

import java.util.ArrayList;

public class Gestor_Actividad {
    private static ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    private static ArrayList<Actividad> basicas = new ArrayList<Actividad>();
    private static ArrayList<Actividad> intermedias = new ArrayList<Actividad>();
    private static ArrayList<Actividad> destacadas = new ArrayList<Actividad>();

    public static void altaActividad(Actividad act) {
        actividades.add(act);
    }
    public static void generarListado() {
        System.out.println("\nListado de actividades");
        for (Actividad a : actividades) {
            if (a.getSuscripcion().equalsIgnoreCase("basica")) {
                basicas.add(a);
            } else if (a.getSuscripcion().equalsIgnoreCase("intermedia")) {
                intermedias.add(a);
            } else if (a.getSuscripcion().equalsIgnoreCase("destacada")) {
                destacadas.add(a);
            }
        }
        System.out.println("BASICAS");
        mostrarBasicas();
        System.out.println("INTERMEDIAS");
        mostrarIntermedias();
        System.out.println("DESTACADAS");
        mostrarDestacadas();
    }
    private static void mostrarBasicas() {
        for (Actividad a : basicas) {
            System.out.println(a.getDescripcion());
        }
    }
    private static void mostrarIntermedias() {
        for (Actividad a : intermedias) {
            System.out.println(a.getDescripcion());
        }
    }
    private static void mostrarDestacadas() {
        for (Actividad a : destacadas) {
            System.out.println(a.getDescripcion());
        }
    }
}
