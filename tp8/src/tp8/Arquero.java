package tp8;

public class Arquero extends Personajes {
	protected int cantidadFlechas;
	protected double alcanceAtaqueLargo;
	protected int danoLargo;
	
	public Arquero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 400;
		this.dano = 70;
		this.alcanceAtaque = 5;
		this.alcanceAtaqueLargo = 100;
		this.danoLargo = 100;
		this.cantidadFlechas = 20;
	}

	@Override
	public boolean ataca(Personajes adversario) {
		
		if (this.distancia(adversario) <= alcanceAtaqueLargo && this.cantidadFlechas > 0) {
	        adversario.recibeDano(this.danoLargo);
	        this.cantidadFlechas--;
	        System.out.println("\n" + this.nombre + " ha atacado a " + adversario.getNombre() + " y le ha causado " + danoLargo + " puntos de danio.");
	        return true;
	    } else {
	    	return super.ataca(adversario);
	    }
	}
	
	@Override
	public String toString() {
		return "\nArquero |-| " + super.toString() + " || Alcance A. Largo: " + this.alcanceAtaque + " || Danio A. Largo: " + this.danoLargo  + " || Cantidad de Flechas: " + this.cantidadFlechas;
	}
}
