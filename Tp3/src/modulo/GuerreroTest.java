package modulo;

public class GuerreroTest {
    public static void main(String[] args) {
        Guerrero miGuerrero = new Guerrero();
        miGuerrero.setNombre("Merlin");
        miGuerrero.setVitalidad(80);
        miGuerrero.setArmadura(30);
        miGuerrero.setX(5);
        miGuerrero.setY(10);
        System.out.println("El nombre del guerrero es: " + miGuerrero.getNombre() + "\nSu vitalidad es de: " + miGuerrero.getVitalidad() + "\nSu armadura es de: " + miGuerrero.getArmadura() + "\nX: " + miGuerrero.getX() + ", Y:" + miGuerrero.getY());
        miGuerrero.mover(2, 3);
        System.out.println("X: " + miGuerrero.getX() + ", Y:" + miGuerrero.getY());
        miGuerrero.recibeDano(100);
        System.out.println("Su armadura despues del ataque es de: " + miGuerrero.getArmadura() + ", Su vitalidad despues del ataque es de: " + miGuerrero.getVitalidad());
    }
}