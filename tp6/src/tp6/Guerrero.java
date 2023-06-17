package tp6;

public class Guerrero {

	private String nombre;
	private double vitalidad;
	private double armadura;
	private double x;
	private double y;

	public Guerrero(String nombre) {
		this.nombre = nombre;
		this.vitalidad = 500;
		this.armadura = 800;
	}

	public String getNombre() {
		return nombre;
	}

	public double getVitalidad() {
		return vitalidad;
	}

	public double getArmadura() {
		return armadura;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void mover(double inc_x, double inc_y) {
		x += inc_x;
		y += inc_y;
	}

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

	public String toString() {
		return "\nNombre: " + nombre + "\nX: " + x + "\nY: " + y + "\nVida: " + vitalidad + "\nArmadura: " + armadura;
	}
}
