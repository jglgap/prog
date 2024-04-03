package tecla2;

import java.util.Scanner;

public class Ejemplo_teclado {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Como te llamas?");
		String name = sc.nextLine();
		System.out.println("Bienvenido:"+ name);
		System.out.println("Cunatos años tienes ?");
		int edad = sc.nextInt();
		System.out.println("Estos son tus años:"+ edad);
	}

}
