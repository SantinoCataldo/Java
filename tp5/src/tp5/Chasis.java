package tp5;

public class Chasis {
	
	protected String nChasis;
	protected double peso;
	
	public Chasis(String nChasis, double peso) {
		super();
		this.nChasis = nChasis;
		this.peso = peso;
	}
	
	public String getnChasis() {
		return nChasis;
	}
	public double getPeso() {
		return peso;
	}
}
