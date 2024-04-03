package ejercicios_basicos2;
import java.util.Scanner;
public class ejercicio_basico2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			 System.out.println("entrada");
			double Celcius = sc.nextDouble();
		    double x= Celcius*1.8+32;
		    System.out.println("salida:");
		    System.out.println(Celcius+"ºC "+" son "+ x +"ºF" );
			
			
		
		
		}	
}
}