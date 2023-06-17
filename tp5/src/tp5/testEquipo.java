package tp5;

public class testEquipo {

	public static void main(String[] args) {
		
        Jugador j1 = new Jugador("Jorge Trompeta", 25, "Delantero", 8.5);
        Jugador j2 = new Jugador("Sebastian Stuffano", 30, "Defensa", 7.2);
        Jugador j3 = new Jugador("Santino Cataldo", 17, "Mediocampista", 9.0);
        Jugador j4 = new Jugador("Jeferson Soteldo", 16, "Mediocampista", 6.2);

        Equipo e1 = new Equipo("Florentina", 1926);

        e1.agregarJugador(j1);
        e1.agregarJugador(j2);
        e1.agregarJugador(j3);
        e1.agregarJugador(j4);

        System.out.println(e1);

        System.out.println("\nJugadores del equipo " + e1.getNombre() + ": ");
        for (Jugador jugador : e1.getJugadores()) {
            System.out.println(jugador);
        }

	}

}
