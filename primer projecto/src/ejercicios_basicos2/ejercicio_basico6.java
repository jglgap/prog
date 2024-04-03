package ejercicios_basicos2;
import java.util.Scanner;
public class ejercicio_basico6 {

	public static void main(String[] args) {
		try (Scanner sc= new Scanner(System.in)) {
			System.out.println("Entrada:");
			double primera= sc.nextDouble();
			System.out.println("primera evaluacion: "+primera);
			double segunda= sc.nextDouble();
			System.out.println("segunda evaluacion: "+segunda);
			double tercera= sc.nextDouble();
			System.out.println("trcera evaluacion:"+tercera);
			
			float media= (float)(primera+segunda+tercera)/3;
			System.out.println("Nota final: "+ media);
			System.out.printf("Nota final: %1$.2f%n5",(float)media);
			System.out.printf("Nota final: %1$.0f",(float)media );
			
		}
		
	}		

}
