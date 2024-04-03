package recursividad;

import java.util.Scanner;

public class Ej_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Teclea numero entero para calcular factorial");
	int entero= sc.nextInt();
	int factorial=1;
	
	while(entero>0) {
		factorial=factorial*entero;
		entero--;
	}
	System.out.println("Su factorial es:"+ factorial);
	
}
}
