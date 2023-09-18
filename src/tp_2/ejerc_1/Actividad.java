package tp_2.ejerc_1;
public class Actividad {
    private String descripcion;
    private enum tipo_suscripcion {
        BASICA,
        INTERMEDIA,
        DESTACADA
    };
    private tipo_suscripcion suscripcion;

    public Actividad(String descripcion, String suscripcion) {
        this.descripcion = descripcion;
        if (suscripcion.equalsIgnoreCase("basica")) {
            this.suscripcion = tipo_suscripcion.BASICA;
        } else if (suscripcion.equalsIgnoreCase("intermedia")) {
            this.suscripcion = tipo_suscripcion.INTERMEDIA;
        } else if (suscripcion.equalsIgnoreCase("destacada")) {
            this.suscripcion = tipo_suscripcion.DESTACADA;
        }
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSuscripcion() {
        switch (suscripcion) {
            case BASICA -> {
                return "BASICA";
            } case INTERMEDIA -> {
                return "INTERMEDIA";
            } case DESTACADA -> {
                return "DESTACADA";
            }
        }
        return null;
    }

    public void altaActividad(String descripcion, String suscripcion) {
        this.descripcion = descripcion;
        if (suscripcion.equalsIgnoreCase("basica")) {
            this.suscripcion = tipo_suscripcion.BASICA;
        } else if (suscripcion.equalsIgnoreCase("intermedia")) {
            this.suscripcion = tipo_suscripcion.INTERMEDIA;
        } else if (suscripcion.equalsIgnoreCase("destacada")) {
            this.suscripcion = tipo_suscripcion.DESTACADA;
        }
    }
}
