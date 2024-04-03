package For;
import java.util.Random;
public class Ej_12 {

	public static void main(String[] args) {
		
		Random dado= new Random();
		int tirada;
		int cara1=0, cara2=0, cara3=0, cara4=0, cara5=0, cara6=0;
		for(int tiradaTry=1;tiradaTry<=6000000;tiradaTry++) {
			switch(dado.nextInt(6)+1) {
				case 1: cara1++;
					break;
				case 2: cara2++;
					break;
				case 3: cara3++;
					break;
				case 4: cara4++;
					break;
				case 5: cara5++;
					break;
				case 6: cara6++;
				
			}
			
		}
System.out.println("cara 1:"+ cara1);	
System.out.println("cara 2:"+ cara2);
System.out.println("cara 3:"+ cara3);
System.out.println("cara 4:"+ cara4);
System.out.println("cara 5:"+ cara5);
System.out.println("cara 6:"+ cara6);
	}
	

}
