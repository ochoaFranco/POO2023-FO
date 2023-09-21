package tp_2.Ejerc3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comision {
    private String nombre, dia, horario;
    private enum Nivel {INICIAL, INTERMEDIO, AVANZADO};
    private Nivel nivel;
    private Disciplina disciplina;
    private Profesor profesor;
    private ArrayList<Alumno> listadoAlumnos = new ArrayList<Alumno>();

    public Comision(String nombre, String dia, String horario, String nivel, Disciplina disciplina, Profesor profesor) {
        this.nombre = nombre;
        this.dia = dia;
        this.horario = horario;
        this.disciplina = disciplina;
        this.profesor = profesor;
        nivel = nivel.toUpperCase();
        switch (nivel) {
            case "INICIAL":
                this.nivel = Nivel.INICIAL;
                break;
            case "INTERMEDIO":
                this.nivel = Nivel.INTERMEDIO;
                break;
            case "AVANZADO":
                this.nivel = Nivel.AVANZADO;
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
