package tp_2.Ejerc3.Main;

import tp_2.Ejerc3.*;

public class Main {
    public static void main(String[] args) {
        Disciplina disc1 = new Disciplina("Tango");
        // PROFESORES.
        Profesor prof1 = new Profesor("Perez");
        Profesor prof2 = new Profesor("Jose");
        Profesor prof3 = new Profesor("Miguel");
        // ALUMNOS
        Alumno alu1 = new Alumno("Enrique");
        Alumno alu2 = new Alumno("Pepe");
        Alumno alu3 = new Alumno("Manuel");
        Alumno alu4 = new Alumno("Thiago");
        Alumno alu5 = new Alumno("Gustavo");
        Alumno alu6 = new Alumno("Walter");
        // COMISIONES
        Comision com1 = new Comision("Comision 1", "Lunes", "10:50", "INICIAL", disc1, prof1);
        Comision com2 = new Comision("Comision 2", "miercoles", "17:50", "INTERMEDIO", disc1, prof2);
        Comision com3 = new Comision("Comision 3", "viernes", "19:50", "AVANZADO", disc1, prof3);
        System.out.println(com1.getNombre() + " " + com1.getProfesor().getNombre() + " " + com1.getDia() + " " + com1.getHorario() + " " + com1.getDisciplina().getNombre() + " " + com1.getNivel());
        // SE AGREGAN TODAS LAS COMISIONES
        GestorAcademia.agregarComisiones(com1);
        GestorAcademia.agregarComisiones(com2);
        GestorAcademia.agregarComisiones(com3);
        // SE AGREGAN LAS COMISIONES A LA DISCIPLINA
        disc1.agregarComision(com1);
        disc1.agregarComision(com2);
        disc1.agregarComision(com3);
        // SE AGREGAN LOS ALUMNOS.
        GestorAcademia.inscribirALumno(alu1, com1);
        GestorAcademia.inscribirALumno(alu2, com1);
        GestorAcademia.inscribirALumno(alu3, com1);
        GestorAcademia.inscribirALumno(alu4, com2);
        GestorAcademia.inscribirALumno(alu5, com2);
        GestorAcademia.inscribirALumno(alu6, com3);
        // SE MUESTRAN LOS ALUMNOS.
        com1.mostrarAlumnos();
        com2.mostrarAlumnos();
        com3.mostrarAlumnos();
        // SE MUESTRAN LAS COMISIONES
        disc1.mostrarComisiones();
        // LOS ALUMNOS ASISTEN A CLASES.
//        for (int i = 0; i < 10; i++) {
//            if (i <= 2)
//                GestorAcademia.tomarAsistencia(alu1);
//            else if (i == 3)
//                GestorAcademia.tomarAsistencia(alu2);
//            else if (i > 4 && i <= 6)
//                GestorAcademia.tomarAsistencia(alu3);
//            else {
//                GestorAcademia.tomarAsistencia(alu4);
//                GestorAcademia.tomarAsistencia(alu5);
//                GestorAcademia.tomarAsistencia(alu6);
//            }
//        }
        GestorAcademia.tomarAsistencia(alu1);
        GestorAcademia.tomarAsistencia(alu1);
        GestorAcademia.tomarAsistencia(alu1);
        GestorAcademia.tomarAsistencia(alu1);
        GestorAcademia.tomarAsistencia(alu1);
        GestorAcademia.tomarAsistencia(alu2);
        GestorAcademia.tomarAsistencia(alu2);
        GestorAcademia.tomarAsistencia(alu2);
        GestorAcademia.tomarAsistencia(alu3);
        GestorAcademia.tomarAsistencia(alu3);
        GestorAcademia.tomarAsistencia(alu3);
        GestorAcademia.tomarAsistencia(alu4);
        GestorAcademia.tomarAsistencia(alu5);
        GestorAcademia.tomarAsistencia(alu6);
        // SE LE PAGA EL SUELDO A LOS PROFESORES.
        GestorAcademia.calcularSueldo();
        // SE GENERA EL REPORTE PARA SABER CUAL ES LA DISCIPLINA CON MAYOR REMUNERACION
        GestorAcademia.calcularDisciplinaMayorRemuneracion();

        System.out.println("EL sueldo del profe 1 es: " + prof1.getSueldo());
        System.out.println("EL sueldo del profe 2 es: " + prof2.getSueldo());
        System.out.println("EL sueldo del profe 3 es: " + prof3.getSueldo());
    }
}
