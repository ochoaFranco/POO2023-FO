package tp_2.Ejerc3;

import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private ArrayList<Comision> comisiones = new ArrayList<Comision>();
    public Disciplina(String nombre) {
        this.nombre = nombre;
    }
    public void agregarComision(Comision c) {
        comisiones.add(c);
    }
    public void mostrarComisiones() {
        for (Comision c : comisiones) {
            System.out.println("Nombre: " + c.getNombre() + " dia: " + c.getDia() + " horario: " + c.getHorario() + " profesor: " + c.getProfesor().getNombre() + " nivel: " + c.getNivel());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
