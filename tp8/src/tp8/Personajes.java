package tp8;

public class Personajes {

	protected String nombre;
	protected double alcanceAtaque;
	protected double vitalidad;
	protected Posicion posicion;
	protected double dano;
	
	public Personajes(String nombre, Posicion posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(double vitalidad) {
		this.vitalidad = vitalidad;
	}

	public double getAlcanceAtaque() {
		return alcanceAtaque;
	}

	public void setAlcanceAtaque(double alcanceAtaque) {
		this.alcanceAtaque = alcanceAtaque;
	}

	public double distancia(Personajes otro) {
		return this.posicion.distancia(otro.getPosicion());
	}

	public boolean ataca(Personajes adversario) {
		if (this.distancia(adversario) <= alcanceAtaque) {
			adversario.recibeDano(this.dano);
			System.out.println("\n" + this.nombre + " ha atacado a " + adversario.getNombre() + " y le ha causado " + dano
					+ " puntos de danio.");
			return true;
		} else {
			System.out.println("\n" + this.nombre + " no puede atacar a " + adversario.getNombre() + " porque esta fuera de su alcance.");
			return false;
		}
	}

	public void recibeDano(double cantidad) {
		if (cantidad >= vitalidad) {
			vitalidad = 0;
		} else {
			vitalidad -= cantidad;
		}
	}

	public String toString() {
		return "Nombre: " + this.nombre + " || Posicion: " + getPosicion() + " || Vida: " + this.vitalidad
				+ " || Alcance Ataque: " + this.alcanceAtaque + " || Danio Ataque: " + this.dano;
	}

}