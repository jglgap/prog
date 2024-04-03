package Random;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cara o Cruz?");
		String stringEleccionUsuario = teclado.next();
		int intEleccionUsuario = stringEleccionUsuario.equals("Cara") ? 0 : 1;
		Random moneda = new Random();
		int jugada = moneda.nextInt(2);
		System.out.println(jugada == intEleccionUsuario ? "Acierto" : "Fracaso");
	}
}
