package tp6;

public class CuentaBancaria {

	private String titular;
	private double saldo;
	private int cantidadDepositos;
	private int cantidadExtracciones;
	
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getCantidadDepositos() {
		return cantidadDepositos;
	}

	public int getCantidadExtracciones() {
		return cantidadExtracciones;
	}

	public void depositar(double cantidad) {
		saldo += cantidad;
        cantidadDepositos++;
        System.out.println("Deposito de $" + cantidad + " realizado con exito a la cuenta de "+ this.titular);
	}

	public boolean extraer(double cantidad) {
		 if (cantidad > saldo) {
	            System.out.println("Extraccion de $" + cantidad + " fallida. Fondos insuficientes en la cuenta de "+ this.titular);
	            return false;
	        } else {
	            saldo -= cantidad;
	            cantidadExtracciones++;
	            System.out.println("Extraccion de $" + cantidad + " realizada con exito en la cuenta de "+ this.titular);
	            return true;
	        }
	}

	public String toString() {
		return "\nTitular: " + titular + "\nSaldo: " + saldo + "\nCantidadDepositos: " + cantidadDepositos
				+ "\nCantidadExtracciones: " + cantidadExtracciones ;
	}
}