package parte3;

import java.util.Scanner;

public class ejercrcio_3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){ 
			System.out.println("Entrada"+" resultado");
			double C = sc.nextDouble();
			double x = sc.nextDouble();
			double n = sc.nextDouble();
			System.out.println("Capital inicial(€):"+ C);
			System.out.println("Interes anual(%): "+x);
			System.out.println("Años(a): "+ n);
			
			System.out.println("********************************");
			System.out.println("* Capital inicial:		"+ 	C+"€*");
			System.out.println("* Interes anual:		"+ x+"%*");
			System.out.println("* Periodo:			"+n+" a*");
			float formula= (float) (C* (float) Math.pow( (1+(x/100)),n));
			System.out.printf("*Capital final:\t\t\t%1$.2f		\n",(float)formula );
			float rend= (float) (formula-C);
			System.out.printf("*Rendimiento:\t\t\t%1$.2f	  \n",(float)rend);
			System.out.println("********************************");
	}
}
}
