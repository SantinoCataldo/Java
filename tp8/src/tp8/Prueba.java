package tp8;

public class Prueba {

	public static void main(String[] args) {
		
		Caballero c1 = new Caballero("Esteban", new Posicion (12,5));
		Guerrero g1 = new Guerrero("Raul", new Posicion (16,5));
		Arquero a1 = new Arquero("Masi", new Posicion (40,7));
		
		System.out.print(c1);
		System.out.print(g1);
		System.out.print(a1);
		
		a1.ataca(c1);
		g1.ataca(c1);
		c1.ataca(g1);
		
		System.out.print(c1);
		System.out.print(g1);
		System.out.print(a1);
				
	}

}
