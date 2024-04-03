package If;
 import java.util.Scanner;
public class If_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int x,y;
		System.out.println("Teclea numero entero x");
		x=entrada.nextInt();
		System.out.println("Teclea numero entero y");
		y=entrada.nextInt();
		if(x==10) {
			System.out.println("x vale 10");
			System.out.println("x+y vale:"+ (x+y));
			
		}else {
			System.out.println(" x no vale 10");
			System.out.println("x-y"+ (x-y));
		}
		
	}

}
