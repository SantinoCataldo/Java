package tp8;

public class Guerrero extends Personajes {

	public Guerrero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 500;
		this.dano = 200;
		this.alcanceAtaque = 10;
	}

	@Override
	public String toString() {
		return "\nGuerrero |-| " + super.toString();
	}
}
