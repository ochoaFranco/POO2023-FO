package TP_1.ejerc_11;

public class Juego {
    private Jugador j1, j2;
    private int puntajeTotal;

    public Juego(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public void calcularGanador() {
        int j1Puntos = j1.getPuntaje();
        int j2Puntos = j2.getPuntaje();
        if (j1Puntos > j2Puntos) {
            System.out.println("EL jugador 1 gano el juego con: " + j1Puntos + " puntos");
        } else if (j1Puntos == j2Puntos) {
            System.out.println("EL jugador 1 empato el juego con: " + j1Puntos + " puntos al igual que el jugador 2 ");
        } else {
            System.out.println("EL jugador 2 gano el juego con:  " + j2Puntos + " puntos");
        }
    }
}
