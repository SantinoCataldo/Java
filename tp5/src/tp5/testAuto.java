package tp5;

public class testAuto {

	public static void main(String[] args) {
		
		Motor m1 = new Motor("Toyota100" , 1.2, "Nafta");
		Chasis c1 = new Chasis("Si", 5.5);
		
		Automovil a1 = new Automovil("Toyota", 2005, m1, c1);
		
		System.out.println(a1);

	}

}
