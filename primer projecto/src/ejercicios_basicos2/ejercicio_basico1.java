package ejercicios_basicos2;

import java.util.Scanner;

public class ejercicio_basico1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enrada:");
			int dia = sc.nextInt();
			int hora = sc.nextInt();
			int minuto = sc.nextInt();
			int segundo = sc.nextInt();
			int total= (dia*86400)+(hora*3600)+(minuto*60)+ segundo; 
			System.out.println(dia+ " dias "+ hora+ " horas "+ minuto+ " minutos "+ segundo+ " segundos "+ "son "+total+ " segundos" );
			
			
		}

	}

}
