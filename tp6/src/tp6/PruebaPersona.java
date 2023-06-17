package tp6;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedrito", 20, "pedrito@gmail.com");
        Persona persona2 = new Persona("Pedro", 30, "pedro@gmail.com");
        Persona persona3 = new Persona("Pedra", 25);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        System.out.println(persona1.sosMayor()); 

        System.out.println(persona1.repeticionesDeLetras('o')); 

    }
}