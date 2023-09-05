package ejerc_10;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Comprar pan");
        LocalDate hoy = LocalDate.now();
        tarea1.setFechaLimite(hoy.plusDays(30));
        LocalDate fechaReco = hoy.plusDays(10);
        tarea1.setFechaRecordatorio(fechaReco);
        System.out.println("La fecha de recordatorio es: " + tarea1.getFechaRecordatorio());
        System.out.println(tarea1.getDescripcion());
        System.out.println(tarea1.getPrioridad());
    }
}
