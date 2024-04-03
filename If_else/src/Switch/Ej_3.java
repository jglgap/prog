package Switch;

import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("Teclea una vocal: ");
			char c;
			c=(sc.nextLine()).charAt(0);
			switch (c) {
				case 'a':
				case 'A':
					System.out.println("'a' de almendra");
					break;
				case 'e':
				case 'E':
					 System.out.println("'e' de extravangante");
					 break;
				case 'i':
				case'I':
					System.out.println("'i' de innovador");
					break;
				case 'o':
				case 'O':
					System.out.println("'o' ostras");
					break;
				case 'u':
				case'U':
					System.out.println("'u' de usar");
					break;
				default:
					 System.out.println("No es una vocal");
					 break;
					
			}
	}

}
