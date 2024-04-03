package ejercicio1;

import java.util.Scanner;

public class PersonaDemo {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)){
			Persona  p1= new Persona();
			System.out.println("la primera persona es: "+ p1.getNombre()+ " tiene :"+p1.getEdad()+" de edad "+ "y mide "+ p1.getAltura()+ "centimetros");
			Persona p2 = new Persona(sc.nextLine(),sc.nextInt(),sc.nextFloat());
		System.out.println("la segunda persona es: "+ p2.getNombre()+ " tiene :"+p2.getEdad()+" de edad "+ "y mide "+ p2.getAltura()+ " centimetros");
	}
	}
}
