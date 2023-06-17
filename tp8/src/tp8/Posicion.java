package tp8;

public class Posicion {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(Posicion otra) {

		double difX = this.getX() - otra.getX();
		double difY = this.getY() - otra.getY();
		double aux = difX * difX + difY + difY;
		aux= Math.sqrt(aux);
		return aux;
	}
	
	@Override
	public String toString() {
		return "X: " + x + " Y: " + y;
	}
	
}
