package WHile;
import java.util.Scanner;
public class Ej_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String palabra;
		String listaPalabras ="";
		System.out.println("Palabras: ");
		palabra=sc.next();
		
		while(!palabra.equals("fin")){
		listaPalabras+=""+palabra;
		System.out.println("palabra: ");
		palabra=sc.next();
		}
		System.out.println("Lista de palabras:"+ listaPalabras);
	}

}
