package Ej5;
import java.util.Random;
public class Cadena {

	public static void main(String[] args) {
		String str = " esto es un ejemplo de una cadena de ejemplo ";
		System.out.println(str.length());
		
		str =str.strip();
		System.out.println(str.length());
		
		String cola =str.substring(26,43);
		System.out.println(cola);
		
		cola =cola.replace("ejemplo", "muestra");
		System.out.println(cola);
		
		String prin =str.substring(0,26);
		System.out.println(prin);
		
		String frase =prin+cola;
		System.out.println(frase);
		
		frase = frase.substring(0,1).toUpperCase() + frase.substring(1);
		System.out.println(frase);
		
		Random random = new Random();
		int rand = random.nextInt(frase.length());
		System.out.println(frase.charAt(rand));
	}

}
