package For;

import java.util.Random;
import java.util.Scanner;

public class Ej_13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	String stringSeleccion;
	int jugada;
	int seleccion;
	String seguirJugando;
	Random moneda= new Random();
	do {
		System.out.println("¿Cara o cruz?");
		stringSeleccion=teclado.next();
		if(stringSeleccion.equals("cara")) {
				seleccion=0;
		}else {
			seleccion=1;
		}
		jugada=moneda.nextInt(2);
		if(jugada==seleccion){
			System.out.println("Acierto");
		}else {
			System.out.println("Fracaso");
		}
		System.out.println("¿Quieres seguir juagando? (si/no)?:");
		seguirJugando=teclado.next();
	}while(seguirJugando.equals("si"));
	System.out.println("Chao");
	}

}
