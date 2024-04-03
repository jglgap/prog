package parte2;
import java.util.Scanner;
public class ejercicio_basico3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Entrada:");
			double lado_mayor= sc.nextDouble();
			double lado_menor= sc.nextDouble();
			
			System.out.println("Salida\n"+ lado_mayor+ lado_menor);
			System.out.println("Longitud del primer lado: "+lado_menor);
			System.out.println("Logintud del segundo lado: "+lado_mayor+ "\n");
			
			System.out.println("====================\n");
			double area= lado_menor*lado_mayor;
			double perimetro= 2*(lado_menor+lado_mayor); 
			System.out.println("Perimetro:"+ perimetro+ " Area:"+area+"\n");
			System.out.println("====================");
			
		}
	}

}
