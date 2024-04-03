package ejercicios_basicos2;
import java.util.Scanner;
public class ejercicio_basico4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){ 
		System.out.println("Entrada"+" resultado");
		double C = sc.nextDouble();
		double x = sc.nextDouble();
		double n = sc.nextDouble();
		System.out.println("Capital inicial(€):"+ C);
		System.out.println("Interes anual(%): "+x);
		System.out.println("Años(a): "+ n);
		
		System.out.println("********************************\n");
		System.out.println("* Capital inicial:		"+ 	C+"€*");
		System.out.println("* Interes anual:		"+ x+"%*");
		System.out.println("* Periodo:			"+n+"a*");
		double formula= C* (double) Math.pow( (1+(x/100)),n);
		System.out.println("*Capital final: 		"+ formula+"€*" );
		double rend= formula-C;
		System.out.println("*Rendimiento:			"+rend+"€*");
		System.out.println("********************************");
		
		}
	}

}
