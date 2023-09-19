package tp_2.Ejerc2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class GestorExcursiones {
    private static ArrayList<PaqueteTurismo> paqueteTurismos = new ArrayList<PaqueteTurismo>();
    private static ArrayList<PaqueteTurismo> ventasRealizadas = new ArrayList<PaqueteTurismo>();


    public static void agregarPaquete(PaqueteTurismo paquete) {
        paqueteTurismos.add(paquete);
        System.out.println("Paquete agregado con exito");
    }

    public static ArrayList<PaqueteTurismo> getPaquetes() {
        return paqueteTurismos;
    }

    public static void informeVentas() {
        Collections.sort(ventasRealizadas, new Comparator<PaqueteTurismo>() {
            @Override
            public int compare(PaqueteTurismo paqueteT1, PaqueteTurismo paqueteT2) {
                return  paqueteT1.getDestino().compareTo(paqueteT2.getDestino());
            }
        });
        System.out.println("Paquetes vendidos.");
        for (PaqueteTurismo p : ventasRealizadas) {
            p.mostrarPaquete();
            System.out.println();
        }
    }



}
