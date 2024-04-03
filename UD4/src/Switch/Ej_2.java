package Switch;
import java.util.Scanner;
public class Ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sMes;
		sMes= sc.nextLine();
		int mes=0;
	
		switch(sMes) {
			
			case "Enero":
				mes=1;
				break;
				
			case "Febrero":
				mes=2;
				break;
			case "Marzo":
				mes=3;
				break;
			case "Abril":
				mes=4;
				break;
			case "Mayo":
				 mes=5;
				break;
			case "Junio":
				mes=6;
				break;
			case "Julio":
				mes=7;
				break;
			case "Agosto":
				mes=8;
				break;
			case "Septiembre":
				mes=9;
				break;
			case "Octubre":
				mes=10;
				break;
			case "Noviembre":
				 mes=11;
				break;
			case "Diciembre":
				mes=12;
				break;
			default:
				 System.out.println("Warning: not real");
				break;
		}
		
		System.out.println("Mes: "+ mes);
			
		}
	}


