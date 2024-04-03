package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej2 {
public static void main(String[] args) {
	

	Scanner teclado= new Scanner(System.in);
	   int n=0; 
   
    
	
    int factorial=n;
    String salida=n+"! = "+n;
for(int i=n-1;i>0;i--){
        salida+="*"+i;
        factorial*=i;
    }

	
    salida+=" = "+factorial;
    System.out.println(salida);
}
}
