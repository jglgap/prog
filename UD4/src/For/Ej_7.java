package For;

import java.util.Scanner;

public class Ej_7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Introducir numLimite: ");
	int numero=sc.nextInt();
	for(int i=1;i<numero;i++) {
		System.out.println(i);
	}
}
}
