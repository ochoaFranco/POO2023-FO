package tp_2.Ejerc3;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int tel;
    private boolean asistencia = false;
    private int credencial;

    public int getCredencial() {
        return credencial;
    }

    public void setCredencial(int credencial) {
        this.credencial = credencial;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    public Alumno(String nombre, int tel) {
        this.nombre = nombre;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

}
