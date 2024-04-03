package Ej_1_2_3_5_7;
import java.util.Scanner;
public class Ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
		 System.out.println("Introduzca parte numerica del DNI");
		String parteNumerica = sc.nextLine();
		if(parteNumerica.length()<=8) {
			System.out.println("Parte numerica del DNI es correcta");
		}else {
			System.out.println("Parte numerica del Dni es incorrecta");
		
	
	}
	int	numero=Integer.parseInt(parteNumerica);
	 int letra = numero % 23;
	 char letraDni=' ';
	 switch(letra) {
		 case 0:
			 letraDni='T';
			 break;
		 case 1:
			 letraDni='R';
			 break;
		 case 2:
			 letraDni='W';
			 break;
		 case 3:
			 letraDni='A';
			 break;
		 case 4:
			 letraDni='G';
			 break;
		 case 5:
			 letraDni='M';
			 break;
		 case 6:
			 letraDni='Y';
			 break;
		 case 7 :
			 letraDni='F';
			 break;
		 case 8:
			 letraDni='P';
			 break;
		 case 9:
			 letraDni='D';
			 break;
		 case 10:
			 letraDni='X';
			 break;
		 case 11:
			 letraDni='B';
			 break;
		 case 12:
			 letraDni='N';
			 break;
		 case 13:
			 letraDni='J';
			 break;
		 case 14:
			 letraDni='Z';
			 break;
		 case 15:
			 letraDni='S';
			 break;
		 case 16:
			 letraDni='Q';
			 break;
		 case 17:
			 letraDni='V';
			 break;
		 case 18:
			 letraDni='H';
			 break;
		 case 19:
			 letraDni='L';
			 break;
		 case 20:
			 letraDni='C';
			 break;
		 case 21:
			 letraDni='K';
			 break;
		 case 22:
			 letraDni='E';
			 break;
	 }
	  System.out.println(numero+""+letraDni);
}
}
