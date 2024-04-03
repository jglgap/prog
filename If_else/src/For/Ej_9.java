package For;

public class Ej_9 {
	public static void main(String[] args) {
		//For
		System.out.println("for");
		for(int i=50;i>=0;i-=2) {
			
			System.out.print(i+" ");
		}
		//DoWhile
		int x=50;
		System.out.println("\n"+"DoWhile");
		do {	
			
			System.out.print(x+" ");
			x-=2;
		}while(x>=0);
		//While
		System.out.println("\n"+ "While");
		int j=50;
		while (j>-1) {
		System.out.print(j+" ");
			j-=2;
		
			
		}
	}
	
}
