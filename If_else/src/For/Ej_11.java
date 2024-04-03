package For;
import java.util.Random;

public class Ej_11 {

	public static void main(String[] args) {
		
		Random dado = new Random();
		int tirada;
		for(int contadorTiradas=1;contadorTiradas<=20;contadorTiradas++) {
			tirada=dado.nextInt(6)+1;
			System.out.print(tirada+" ");
			if(contadorTiradas%5==0)
				System.out.println();
		}
	

	}

}
