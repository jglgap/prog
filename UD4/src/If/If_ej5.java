package If;
import java.util.Scanner;
public class If_ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char vocal;
		System.out.println("Teclea una vocal:");
		vocal= sc.next().charAt(0);
		if (vocal=='a'||vocal=='A') 
			System.out.println("a de Alonso");
		else if (vocal=='o'||vocal=='O')
			System.out.println("o de osteoporosis ");
		else 
			System.out.println(" no es vocal");

	}

}
