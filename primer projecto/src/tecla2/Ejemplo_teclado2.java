package tecla2;

import java.util.Scanner;

public class Ejemplo_teclado2 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer valor:");
		double x = sc.nextDouble();
		System.out.println("segundo valor:");
		double y = sc.nextDouble ();
		double resultado= y+x;
		System.out.println("el resultado de la suma es:" + resultado);
		double z = y*x;
		System.out.println("de la multiplicacion es:"+ z);
	}


		
	}
  

