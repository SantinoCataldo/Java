package tp5;

public class Automovil {

	protected String marca;
	protected int modelo;
	protected Motor motor;
	protected Chasis chasis;
	protected double precio;
	
	public Automovil(String marca, int modelo, Motor motor, Chasis chasis) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.chasis = chasis;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getModelo() {
		return modelo;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public Chasis getChasis() {
		return chasis;
	}
	
	public String getTipoCombustible() {
		String resultado;
		resultado = this.motor.getTipoCombustible();
		return resultado;
	}
	
	public double getCilindrada() {
		double resultado;
		resultado = this.motor.getCilindrada();
		return resultado;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + "||Modelo: " + modelo + "||Motor: " + motor.getnSerie() + "||Chasis: " + chasis.getnChasis() + "||Precio: " + precio + "||Combustible: " +  getTipoCombustible() + "||Cilindrada: " + getCilindrada();
	}
	
	
	
}
