package tp5;

public class Jugador {
	protected String nombre, posicion;
	protected int edad;
	protected double efectividad;
	
	public Jugador(String nombre, int edad, String posicion, double efectividad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.efectividad = efectividad;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public double getEfectividad() {
		return efectividad;
	}
	public void setEfectividad(double efectividad) {
		this.efectividad = efectividad;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
        return "Nombre: " + nombre + " || Edad: " + edad + " || Posicion: " + posicion + " || Efectividad: " + efectividad;
    }
}
