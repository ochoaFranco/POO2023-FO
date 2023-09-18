package TP_1.ejerc_12;

import TP_1.fecha_ejerc09.Fecha;

import java.time.LocalDate;
import java.util.*;
import java.util.Comparator;
public class TareaAdmin {
    private String descripcion;
    private ArrayList<TareaAdmin> tareas = new ArrayList<TareaAdmin>();
    private enum Prioridades {
        ALTA, MEDIA, BAJA
    }
    private Prioridades prioridad = Prioridades.MEDIA;
    private boolean completa = false;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private boolean vencida;

    public TareaAdmin(String descripcion) {
        this.descripcion = descripcion;
    }
    public TareaAdmin(LocalDate reco, LocalDate limite, String descripcion) {
        this.fechaRecordatorio = reco;
        this.fechaLimite = limite;
        this.descripcion = descripcion;
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
    public void setCompleta(boolean completa) {
        this.completa = completa;
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

    public boolean vencida() {
        LocalDate actual = LocalDate.now();
        return actual.isAfter(fechaLimite);
    }
    public ArrayList<TareaAdmin> crearListaTareas() {
        while (true) {
            System.out.println("Creando tarea..");
            Fecha miFecha1 = new Fecha();
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la descripcion de la tarea: ");
            String descrip = sc.nextLine();
            System.out.print("Ingrese la fecha limite (dd-MM-yyyy) : ");
            String fecha = sc.nextLine();
            LocalDate fechaFormato = miFecha1.formatoFecha(fecha, "dd-MM-yyyy");
            System.out.print("Ingrese la fecha de recordatorio (dd-MM-yyyy) : ");
            String fechaReco = sc.nextLine();
            LocalDate fechaFormatoReco = miFecha1.formatoFecha(fechaReco, "dd-MM-yyyy");
            TareaAdmin tarea = new TareaAdmin(fechaFormatoReco, fechaFormato, descrip);
            System.out.println("Se encuentra completa? S-N");
            String completa = sc.nextLine();
            if (completa.equalsIgnoreCase("s"))
                tarea.setCompleta(true);
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

    public TareaAdmin buscarTarea(String descripcion) {
        for (TareaAdmin t : tareas) {
            if (t.getDescripcion().contains(descripcion)) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<TareaAdmin> ordenar(ArrayList<TareaAdmin> tarea) {
        // comparador de prioridad.
        Comparator<TareaAdmin> comparadorPrioridad = new Comparator<TareaAdmin>() {
            @Override
            public int compare(TareaAdmin tarea1, TareaAdmin tarea2) {
                return tarea1.getPrioridad().compareTo(tarea2.getPrioridad());
            }
        };
        // ordeno por prioridad.
        Collections.sort(tareas, comparadorPrioridad);

        // lo mismo pero con fechas de venc.
        Collections.sort(tareas, new Comparator<TareaAdmin>() {
            @Override
            public int compare(TareaAdmin tarea1, TareaAdmin tarea2) {
                int cmp = tarea1.getPrioridad().compareTo(tarea2.getPrioridad());
                if (cmp != 0) {
                    return cmp;
                }
                return tarea1.getFechaLimite().compareTo(tarea2.getFechaLimite());
            }
        });
        return tareas;
    }
















}
