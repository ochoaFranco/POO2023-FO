package tp_2.Ejerc2;

import java.util.ArrayList;

public class GuiaTurismo {
    private String nombre;
    private ArrayList<String> excursiones = new ArrayList<String>();
    public GuiaTurismo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarExcursion(String excursion) {
        excursiones.add(excursion);
    }
    public void mostrarExcursiones() {
        for (String s : excursiones) {
            System.out.println("Excursion: " + s);
        }
    }
    public ArrayList<String> getExcursiones() {
        return excursiones;
    }
}
