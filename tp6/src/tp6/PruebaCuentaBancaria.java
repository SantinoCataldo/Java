package tp6;

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria("Jorge", 500);
		CuentaBancaria cuenta2 = new CuentaBancaria("Silvia", 200);
		CuentaBancaria cuenta3 = new CuentaBancaria("Susana", 1000);
		cuenta1.depositar(1250);
		cuenta3.extraer(500);

		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());

	}

}