package tp6;

public class Persona {

	private String nombre;
	private int edad;
	private String email;
	
	public Persona(String nombre) {
        this.nombre = nombre;
    }
	
	public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

	public Persona(String nombre, int edad, String email) {
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean sosMayor() {
	    if (edad >= 18) {
	        System.out.println("\n" + nombre + " es mayor de edad.");
	        return true;
	    } else {
	        System.out.println("\n" + nombre + " no es mayor de edad.");
	        return false;
	    }
	}

	public int repeticionesDeLetras(char letra) {
		int contador = 0;
		for (int i = 0; i < this.nombre.length(); i++) {
			if (this.nombre.charAt(i) == letra) {
				contador++;
			}
		}
		 System.out.println("\nLa letra '" + letra + "' se repite veces en el nombre:");
		    return contador;
	}

	public String toString() {
		return "\nNombre:" + nombre + "\nEdad=" + edad + "\nEmail=" + email;
	}
}
