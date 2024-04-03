package array_multidimensionales;
import java.util.Random;
public class Ej4 {

	public static void main(String[] args) {
		Random numero = new Random();
		int [][] matriz = new int [4][4];
		System.out.println("primera matriz");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz [i][j]= numero.nextInt(100);
				System.out.print(matriz [i][j] +" ");
			}
			
		System.out.print("\n");
		}
	
}
}