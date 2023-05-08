package modulo;

public class PersonaTest {

	public static void main(String[] args) {
		Persona persona1= new Persona();
		persona1.setNombre("Susana");
		persona1.setEdad(27);
		char letra='a';
		System.out.println("Edad: "+ persona1.getEdad() + "\nEs Mayor: " + persona1.sosMayor() + "\nLa cantidad de veces que aparece la letra " + letra + " en " + persona1.getNombre() + " es: " + persona1.repeticionesDeLetras(letra));
	}

}