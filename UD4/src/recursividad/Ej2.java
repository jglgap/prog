package recursividad;

import java.util.Scanner;

public class Ej2 {
	
						
int cuenta=0;
int acumulador=0;
		
	static Scanner teclado= new Scanner(System.in);
	 public  void recursividad(int acumulador, int cuenta) {
		 System.out.printf("Ingrese el #%d", cuenta);
		 int num= teclado.nextInt();
	 
	 if(num==0) {
		 System.out.println("\nSe ingreso cero"
		 			+ "\nSuma Total"+acumulador+
		 			"\nFin");
	 } else {
			 num=acumulador+1;
		 }	 
	
	
	 
	}
}




