package TP_1.ejerc_13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TodoList lista = new TodoList("primera tarea", "colaborador1");
        ArrayList<TodoList> tareas = new ArrayList<TodoList>();
        ArrayList<TodoList> tareasColaborador = new ArrayList<TodoList>();
        tareas = lista.crearListaTareas();
        tareasColaborador = lista.obtenerListadoTareasPorColaborador("pepe");
        for (TodoList t : tareasColaborador) {
            System.out.println(t.getDescripcion());
        }
        lista.mostrarToDoList();
    }
}
