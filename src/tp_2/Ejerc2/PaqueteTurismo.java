package tp_2.Ejerc2;

import java.util.ArrayList;
import java.util.Random;

public class PaqueteTurismo {
    private String nombre, destino, medioTransporte, hospedaje;
    private ArrayList<String> excursionesPaquete = new ArrayList<String>();

    public PaqueteTurismo(String nombre, String destino, GuiaTurismo guia) {
        this.nombre = nombre;
        this.destino = destino;
        armarExcursiones(guia);
    }

    private void armarExcursiones(GuiaTurismo guia) {
        Random random = new Random();
        int excursionRandom = random.nextInt(guia.getExcursiones().size()); // random index en el rango de la lista.
        ArrayList<String> excursiones = guia.getExcursiones();
        for (int i = 0; i < excursionRandom; i++ ) {
            int randomIndex = random.nextInt(guia.getExcursiones().size()); // obtengo un indice random.
            excursionesPaquete.add(excursiones.get(randomIndex));
        }
    }
    public void mostrarPaquete() {
        String descripcion = nombre + " " + destino;
        System.out.println(descripcion);
        System.out.println("Contiene las siguientes excursiones: ");
        for (String s : excursionesPaquete) {
            System.out.println(s);
        }
    }
    public String getDestino() {
        return destino;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public String getHospedaje() {
        return hospedaje;
    }
}
