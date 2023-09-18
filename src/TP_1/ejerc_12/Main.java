package TP_1.ejerc_12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TareaAdmin tarea1 = new TareaAdmin("Tarea1");
        ArrayList<TareaAdmin> tareas = new ArrayList<TareaAdmin>();
        tareas = tarea1.crearListaTareas();

        tareas = tarea1.ordenar(tareas);
        for (TareaAdmin t : tareas) {
            System.out.println(t.getDescripcion() + " " + t.getPrioridad() + " " + t.getFechaLimite());
        }
    }
}
