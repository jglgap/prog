package Switch;

import java.util.Scanner;

public class ej_4 {
public static void main(String[] args) {

	 Scanner sc= new Scanner(System.in);
	 int x = sc.nextInt();

	 switch (x){
	 case 1:
	 //(x=>1);
	 	break;
	 case 2:
	 System.out.println(2);
	 	break;
	 case 3:
	 System.out.println(3);
	 	break;
	 case 4:
		 System.out.println(4);
	 break;
	 case 5:
	 System.out.println(5);
	 	break;
		 
	 
	 default:
	 System.out.println("el número inicial no está entre uno y cinco" );
}
}
}