package numeros;
import java.util.Scanner;
public class DemoNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Complejo comp = new Complejo();
	Complejo comp1 = new Complejo(sc.nextDouble(),sc.nextDouble());
	System.out.println(comp);
	
	comp1.sumar(comp);
	System.out.println(comp1);
}
}
