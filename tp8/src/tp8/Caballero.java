package tp8;

public class Caballero extends Personajes {
	
	protected int armadura;
	
	public Caballero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 800;
		this.dano = 120;
		this.alcanceAtaque = 5;
		this.armadura = 500;		
	}
	
	@Override
	public void recibeDano(double cantidad) {
		double dano = cantidad - armadura;
		armadura -= cantidad;
		if(armadura <= 0) {
			armadura = 0;
		}
		if (dano > 0) {
			vitalidad -= dano;
		}
	}
	
	@Override
	public String toString() {
		return "\nCaballero |-| " + super.toString() + " || Armadura: " + this.armadura;
	}

}


