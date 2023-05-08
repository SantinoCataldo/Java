package modulo;

public class CuentaBancaria {

	private String titular;
	private double saldo;
	private int cantidadDepositos;
	private int cantidadExtracciones;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
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
        System.out.println("Deposito de $" + cantidad + " realizado con exito.");
	}

	public boolean extraer(double cantidad) {
		 if (cantidad > saldo) {
	            System.out.println("Extraccion de $" + cantidad + " fallida. Fondos insuficientes.");
	            return false;
	        } else {
	            saldo -= cantidad;
	            cantidadExtracciones++;
	            System.out.println("Extraccion de $" + cantidad + " realizada con exito.");
	            return true;
	        }
	}
}
