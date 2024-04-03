package Random;
import java.util.Random;
public class Ej1 {
	public static void main(String[] args) {
		Random dado= new Random();
		int tirada1 = dado.nextInt(6)+1;
		int tirada2 = dado.nextInt(6)+1;
		int tirada3 = dado.nextInt(6)+1;
		int tirada4 = dado.nextInt(6)+1;
		int tirada5 = dado.nextInt(6)+1;
		int tirada6 = dado.nextInt(6)+1;
		System.out.println(tirada1+","+tirada2+","+tirada3+","+tirada4+","+tirada5+","+tirada6);
	}
}
