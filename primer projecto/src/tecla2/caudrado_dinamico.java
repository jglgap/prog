package tecla2;

import java.util.Scanner;

public class caudrado_dinamico {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("valor del lado:");
			double lado = sc.nextDouble();
			double area= lado*lado;

			System.out.println("valor del area:"+ area);
		}
	}

	

}
