package tp6;

public class PruebaGuerrero {
    public static void main(String[] args) {
    	Guerrero guerrero1 = new Guerrero("Luis");
        Guerrero guerrero2 = new Guerrero("Medoya");
        guerrero1.recibeDano(400); 
        guerrero2.mover(2, 3);
        
        System.out.println(guerrero1.toString());
        System.out.println(guerrero2.toString());
        
    }
}