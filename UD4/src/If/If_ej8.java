package If;

import java.util.Scanner;

public class If_ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		char mayorIgual;
		System.out.println("NUM x:");
		x = sc.nextInt();
		System.out.println("NUM y: ");
		y=sc.nextInt();
		System.out.println("NUM Z: ");
		z=sc.nextInt();
		
		if (x>=y) {
			
			mayorIgual='x';
	}else {
		mayorIgual='z';
	}
		if  (y>=z) {
			mayorIgual='y';
		}else {
			mayorIgual='z';
		}
		 System.out.println("Es mayor o igual: "+ mayorIgual);
	}
}
