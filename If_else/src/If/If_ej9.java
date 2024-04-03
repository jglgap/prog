package If;

import java.util.Scanner;

public class If_ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int a,b,s=5;
		
		 System.out.println("a: ");
		 a=teclado.nextInt();
		 System.out.println("b: ");
		 b=teclado.nextInt();

		 if(a==0)
		 if(b!=0) {
		 s=s+b;
		 }else {
		 s=s+a;
		 }
		 System.out.println("s: "+s);


	}

}
