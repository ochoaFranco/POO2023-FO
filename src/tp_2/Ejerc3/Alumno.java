package tp_2.Ejerc3;

public class Alumno {
    private String nombre;
    private int tel;
    private boolean asistencia;
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

    public boolean isAsistencia() {
        return asistencia;
    }

    public void asistirAClase() {
        this.asistencia = true;
    }
}
