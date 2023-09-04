
//package tarea_ejerc05;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private enum Prioridades {
	    ALTA, MEDIA, BAJA
	}
    private Prioridades prioridad = Prioridades.MEDIA;
    private boolean completa = false;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private boolean vencida;
    
    public Tarea(){}
    public Tarea(LocalDate reco, LocalDate limite) {
			this.fechaRecordatorio = reco;
			this.fechaLimite = limite;
			
			if (getFechaRecordatorio().isAfter(LocalDate.now()) || getFechaRecordatorio().equals(LocalDate.now))
				prioridad = Prioridades.ALTA;
	}
    
    
    public String getDescripcion() {
        if (completa)
            return " |Vencida|" + descripcion;
        
        if (getFechaRecordatorio().isAfter(LocalDate.now()) || getFechaRecordatorio().equals(LocalDate.now))
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
    }

    public void setPrioridad(String prioridad) {
        if (prioridad.equalsIgnoreCase("alta"))
			this.prioridad = Prioridades.ALTA;
		
		else if (prioridad.equalsIgnoreCase("baja"))
			this.prioridad = Prioridades.BAJA;
		
		else if (prioridad.equalsIgnoreCase("media"))
			this.prioridad = Prioridades.MEDIA;
		
		else
			system.out.println("prioridad incorrecta");
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
}
