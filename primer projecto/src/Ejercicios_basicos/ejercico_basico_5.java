package Ejercicios_basicos;

import java.util.Scanner;

public class ejercico_basico_5 {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner (System.in)) {
		
		System.out.println("peso:");
			double peso = sc.nextDouble();
			
		System.out.println("altura:");
			double altura = sc.nextDouble();
			
			
			 double IMC= peso/(altura*altura);
		System.out.println("IMC:"+ IMC);
		
		
		
		
		System.out.println("Tabla IMC");
		System.out.println("Delgado: <18.5");
		System.out.println("Normal  entre 18.5 y 24.9");
		System.out.println("Sobrepeso entre 25 y 29.9");
		System.out.println("Obeso 30 o mas");
	}
 }
}
