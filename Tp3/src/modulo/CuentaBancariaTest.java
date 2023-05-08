package modulo;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setTitular("Juan Perez");
		cuenta.depositar(1250);
		cuenta.extraer(500);
		System.out.println("Titular: " + cuenta.getTitular() + "\nSaldo: " + cuenta.getSaldo() + "\nCantidad de depositos: " + cuenta.getCantidadDepositos() + "\nCantidad de extracciones: " + cuenta.getCantidadExtracciones());
	}

}

/*import java.util.Scanner;

public class CuentaBancariaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        cuenta.setTitular(scanner.nextLine());

        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = scanner.nextDouble();
        cuenta.depositar(cantidadDeposito);

        System.out.print("Ingrese la cantidad a extraer: ");
        double cantidadExtraccion = scanner.nextDouble();
        cuenta.extraer(cantidadExtraccion);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Cantidad de depósitos: " + cuenta.getCantidadDepositos());
        System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());

        scanner.close();
    }
}
*/
