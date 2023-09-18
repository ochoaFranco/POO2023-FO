package tp_2.ejerc_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {
    private final String nombre, apellido;
    private static int contador = 100;
    private final int nro_socio;
    private int telefono, edad;
    private String email, direccion;
    private ArrayList<Double> cuotas = new ArrayList<Double>();
    private LocalDate fecha_inscripcion;
    private enum tipo_suscripcion {
        BASICA,
        INTERMEDIA,
        DESTACADA
    };
    private tipo_suscripcion suscripcion;
    public Socio(String nombre, String apellido, int telefono, String email, String direccion, String suscripcion, int edad, LocalDate fecha_inscripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.nro_socio = contador;
        contador += 1;
        this.email = email;
        this.direccion = direccion;
        this.fecha_inscripcion = fecha_inscripcion;
        if (suscripcion.equalsIgnoreCase("basica")) {
            this.suscripcion = tipo_suscripcion.BASICA;
        } else if (suscripcion.equalsIgnoreCase("intermedia")) {
            this.suscripcion = tipo_suscripcion.INTERMEDIA;
        } else if (suscripcion.equalsIgnoreCase("destacada")) {
            this.suscripcion = tipo_suscripcion.DESTACADA;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getSuscripcion() {
        switch (suscripcion) {
            case BASICA -> {
                return "BASICA";
            } case INTERMEDIA -> {
                return "INTERMEDIA";
            }case DESTACADA -> {
                return "DESTACADA";
            }
        }
        return null;
    }

    public void abonarCuota() {
        if (getSuscripcion().equalsIgnoreCase("basica")) {
            cuotas.add(500.560);
        } else if (getSuscripcion().equalsIgnoreCase("intermedia")) {
            cuotas.add(1500.452);
        } else {
            cuotas.add(1900.434);
        }
    }
    public LocalDate getFechaInscripcion() {
        return fecha_inscripcion;
    }

    public int getEdad() {
        return edad;
    }

    public int getNro_socio() {
        return nro_socio;
    }
}
