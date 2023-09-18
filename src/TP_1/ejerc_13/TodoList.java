package TP_1.ejerc_13;

import TP_1.fecha_ejerc09.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TodoList {
    private String descripcion;
    private String colaborador;
    private String realizadaPor;
    private ArrayList<TodoList> tareas = new ArrayList<TodoList>();
    private enum Prioridades {
        ALTA, MEDIA, BAJA
    }
    private Prioridades prioridad = Prioridades.MEDIA;
    private boolean completa = false;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaFinalizacion;
    private boolean vencida;

    public TodoList(String descripcion, String colaborador) {
        this.descripcion = descripcion;
        this.colaborador = colaborador;
    }
    public TodoList(LocalDate reco, LocalDate limite, String descripcion, String colaborador) {
        this.fechaRecordatorio = reco;
        this.fechaLimite = limite;
        this.descripcion = descripcion;
        this.colaborador = colaborador;
        if (LocalDate.now().isAfter(getFechaRecordatorio())|| LocalDate.now().isEqual(getFechaRecordatorio()))
            prioridad = Prioridades.ALTA;
    }

    public String getDescripcion() {
        if (completa)
            return " |Vencida|" + descripcion;

        if (getFechaRecordatorio().isAfter(LocalDate.now()) || getFechaRecordatorio().equals(LocalDate.now()))
            return "|Por vencer|" + descripcion;

        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        switch(prioridad) {
            case ALTA:
                return "alta";
            case BAJA:
                return "baja";
            case MEDIA:
                return "media";
        }
        return null;
    }

    public void setPrioridad(String prioridad) {
        if (prioridad.equalsIgnoreCase("alta"))
            this.prioridad = Prioridades.ALTA;

        else if (prioridad.equalsIgnoreCase("baja"))
            this.prioridad = Prioridades.BAJA;

        else if (prioridad.equalsIgnoreCase("media"))
            this.prioridad = Prioridades.MEDIA;

        else
            System.out.println("prioridad incorrecta");
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public boolean getCompleta() {
        return completa;
    }
    public void setCompleta(boolean completa, String colabo, LocalDate fecha) {
        this.completa = completa;
        realizadaPor = colabo;
        fechaFinalizacion = fecha;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }
    public void modificarDescripcion(String nuevaDesc) {
        descripcion = nuevaDesc;
    }

    public String getRealizadaPor() {
        return realizadaPor;
    }

    public boolean isCompleta() {
        return completa;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public boolean isVencida() {
        return vencida;
    }

    public boolean vencida() {
        LocalDate actual = LocalDate.now();
        return actual.isAfter(fechaLimite);
    }
    public ArrayList<TodoList> crearListaTareas() {
        while (true) {
            System.out.println("Creando tarea..");
            Fecha miFecha1 = new Fecha();
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la descripcion de la tarea: ");
            String descrip = sc.nextLine();
            System.out.print("Ingrese el nombre del colaborador: ");
            String colaborador = sc.nextLine();
            System.out.print("Ingrese la fecha limite (dd-MM-yyyy) : ");
            String fecha = sc.nextLine();
            LocalDate fechaFormato = miFecha1.formatoFecha(fecha, "dd-MM-yyyy");
            System.out.print("Ingrese la fecha de recordatorio (dd-MM-yyyy) : ");
            String fechaReco = sc.nextLine();
            LocalDate fechaFormatoReco = miFecha1.formatoFecha(fechaReco, "dd-MM-yyyy");
            TodoList tarea = new TodoList(fechaFormatoReco, fechaFormato, descrip, colaborador);
            System.out.println("Se encuentra completa? S-N");
            String completa = sc.nextLine();
            if (completa.equalsIgnoreCase("s")) {
                System.out.println("Ingrese fecha de finalizacion (dd-MM-yyyy) :");
                String fechaFinalizacion = sc.nextLine();
                LocalDate fechaFormato2 = miFecha1.formatoFecha(fechaFinalizacion, "dd-MM-yyyy");
                tarea.setCompleta(true, colaborador, fechaFormato);
            }
            tareas.add(tarea);
            int n;
            System.out.println("Desea continuar agregando tareas? (1)- continuar otro numero para salir");
            n = sc.nextInt();
            if (n != 1) {
                System.out.println("Lista creada de manera exitosa!");
                return tareas;
            }
        }
    }

    public void mostrarToDoList() {
        for (TodoList t: tareas) {
            boolean terminada = t.getCompleta();
            String estado;
            if (terminada)
                estado = "Terminada";
            else
                estado = "Incompleta";
            System.out.println("Descripcion : " + descripcion + " fecha limite: " + t.getFechaLimite() + " recordatorio: " + t.getFechaRecordatorio() + " colaborador: " + t.getColaborador() + " estado " + estado);
        }
    }

    public String getColaborador() {
        return colaborador;
    }

    public TodoList buscarTarea(String descripcion) {
        for (TodoList t : tareas) {
            if (t.getDescripcion().contains(descripcion)) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<TodoList> ordenar(ArrayList<TodoList> tarea) {
        // comparador de prioridad.
        Comparator<TodoList> comparadorPrioridad = new Comparator<TodoList>() {
            @Override
            public int compare(TodoList tarea1, TodoList tarea2) {
                return tarea1.getPrioridad().compareTo(tarea2.getPrioridad());
            }
        };
        // ordeno por prioridad.
        Collections.sort(tareas, comparadorPrioridad);

        // lo mismo pero con fechas de venc.
        Collections.sort(tareas, new Comparator<TodoList>() {
            @Override
            public int compare(TodoList tarea1, TodoList tarea2) {
                int cmp = tarea1.getPrioridad().compareTo(tarea2.getPrioridad());
                if (cmp != 0) {
                    return cmp;
                }
                return tarea1.getFechaLimite().compareTo(tarea2.getFechaLimite());
            }
        });
        return tareas;
    }

    public ArrayList<TodoList> obtenerListadoTareasPorColaborador(String colaborador) {
        ArrayList<TodoList> tareasColaborador = new ArrayList<TodoList>();
        for (TodoList t : tareas) {
            if (t.getColaborador().equalsIgnoreCase(colaborador)) {
                tareasColaborador.add(t);
            }
        }
        return tareasColaborador;
    }
}
