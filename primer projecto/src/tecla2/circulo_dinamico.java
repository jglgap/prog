package tecla2;

import java.util.Scanner;

public class circulo_dinamico {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		double area;
		
		System.out.println("tamaño el radio:");
		double radio = sc.nextDouble();
		area =  Math.PI + radio + radio;
		System.out.println("resultado del area:"+ area);
	}
	

}
}
