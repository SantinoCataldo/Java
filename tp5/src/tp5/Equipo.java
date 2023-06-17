package tp5;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int anioCreacion;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, int anioCreacion) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombre() {
        return nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void quitarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public int getCantidadJugadores() {
        return jugadores.size();
    }

    public double getPromedioEdadGeneral() {
        int totalEdad = 0;
        double resultado;
        for (Jugador jugador : jugadores) {
            totalEdad += jugador.getEdad();
        }
        resultado = totalEdad / jugadores.size();
        return resultado;
    }

    public double getPromedioEdadMayores() {
        double cantidadMayores = 0;
        double totalEdad = 0;
        double resultado;
        for (Jugador jugador : jugadores) {
            if (jugador.getEdad() >= 18) {
                cantidadMayores++;
                totalEdad += jugador.getEdad();
            }
        }
        resultado = cantidadMayores > 0 ?totalEdad/cantidadMayores : 0;
        return resultado;
    }

    public double getPromedioEdadMenores() {
        double cantidadMenores = 0;
        double totalEdad = 0;
        double resultado;
        for (Jugador jugador : jugadores) {
            if (jugador.getEdad() < 18) {
                cantidadMenores++;
                totalEdad += jugador.getEdad();
            }
        }
        resultado = cantidadMenores > 0 ? totalEdad/cantidadMenores: 0;
        return resultado;
    }

    public double getEfectividadEquipo() {
        double efectividadTotal = 0;
        double resultado;
        for (Jugador jugador : jugadores) {
            efectividadTotal += jugador.getEfectividad();
        }
        resultado = efectividadTotal/jugadores.size();
        return resultado;
    }
    
    @Override
	public String toString() {
		return "Equipo: " + nombre + " || Anio Creacion: " + anioCreacion + " || Cantidad Jugadores: " + getCantidadJugadores() + " || Promedio Edad: " + getPromedioEdadGeneral() + " || Promedio Edad Mayores: " + getPromedioEdadMayores() + " || Promedio Edad Menores: " + getPromedioEdadMenores() + " || Efectividad Equipo: " + getEfectividadEquipo();
	}
}