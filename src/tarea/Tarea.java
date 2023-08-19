package tarea;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean completa = false;
    private LocalDate fechaLimite;
    private boolean vencida;
    public String getDescripcion() {
        if (completa)
            return " |Vencida|" + descripcion;
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
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
    public void modificarDescripcion(String nuevaDesc) {
        descripcion = nuevaDesc;
    }
    public void cambiarPrioridad(String nuevaPrioridad) {
        prioridad = nuevaPrioridad;
    }
    public boolean vencida() {
        LocalDate actual = LocalDate.now();
        return actual.isAfter(fechaLimite);
    }
}
