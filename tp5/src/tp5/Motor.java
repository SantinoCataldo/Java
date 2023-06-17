package tp5;

public class Motor {
	protected String nSerie;
	protected double cilindrada;
	protected String tipoCombustible;
	
	public Motor(String nSerie, double cilindrada, String tipoCombustible) {
		this.nSerie = nSerie;
		this.cilindrada = cilindrada;
		this.tipoCombustible = tipoCombustible;
	}
	public String getnSerie() {
		return nSerie;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	
	
	
}
