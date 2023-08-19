package tarea;
import java.util.Date;

public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean completa;
    private Date fechaLimite;

    public String getDescripcion() {
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

    public Date getFechaLimite() {
        return fechaLimite;
    }
    public boolean getCompleta() {
        return completa;
    }
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public void modificarDescripcion(String nuevaDesc) {
        descripcion = nuevaDesc;
    }
    public void cambiarPrioridad(String nuevaPrioridad) {
        prioridad = nuevaPrioridad;
    }
}
