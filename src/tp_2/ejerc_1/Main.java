package tp_2.ejerc_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate ahora = LocalDate.now();
        Socio socio1 = new Socio("jose", "del toro", 12312321, "jose@gmail.com", "avenida siempre viva123", "intermedia", 21, ahora);
        Socio socio2 = new Socio("lucas", "rodriguez", 12312211, "lucas@gmail.com", "avenida siempre viva323", "destacada", 20, ahora.minusDays(600));
        Socio socio3 = new Socio("Juan", "Perez", 12312211, "perezJUan@gmail.com", "avenida siempre viva431", "basica", 25, ahora.minusDays(2));
        Gestor_Socio.agregarSocios(socio1);
        Gestor_Socio.agregarSocios(socio2);
        Gestor_Socio.agregarSocios(socio3);
        System.out.println("SOCIOS");
        Gestor_Socio.mostrarSocios();
        Gestor_Socio.generarReporte();
        Actividad act1 = new Actividad("ir a ver el partido a la cancha", "basica");
        Actividad act2 = new Actividad("ir a comprar entrada a la cancha", "basica");
        Actividad act3 = new Actividad("ir al palco", "intermedia");
        Actividad act4 = new Actividad("poder votar en las elecciones", "intermedia");
        Actividad act5 = new Actividad("comprar entrada por internet", "destacada");
        Actividad act6 = new Actividad("participar en las decisiones del club", "destacada");
        Gestor_Actividad.altaActividad(act1);
        Gestor_Actividad.altaActividad(act2);
        Gestor_Actividad.altaActividad(act3);
        Gestor_Actividad.altaActividad(act4);
        Gestor_Actividad.altaActividad(act5);
        Gestor_Actividad.altaActividad(act6);
        Gestor_Actividad.generarListado();
    }
}
