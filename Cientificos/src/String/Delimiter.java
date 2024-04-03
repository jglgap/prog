package String;
import java.util.Scanner;
public class Delimiter {
	public static void main(String args[]){
		
			 String s="HOLA,ADIOS,CHAO";
			 Scanner sc = new Scanner(s);
			 sc.useDelimiter(",");
			 System.out.println(sc.next() + " "+ sc.next()+ " "+sc.next());
			
			 
			 //ej2
			 

			  Scanner teclado = new Scanner(System.in);
			  System.out.println("introduce un numero con parte entera, coma y parte decimal ej.-2,78");
			  String entradaTeclado= teclado.next();
			  Scanner sc1= new Scanner(entradaTeclado);
			  sc1.useDelimiter(",");
			  System.out.println("Parte entera: "+ sc1.next()+ " parte decimal: "+sc1.next());
			  
			  //ej2.2
			  
			  Scanner teclado1 = new Scanner(System.in);
			  System.out.println("introduce un numero con parte entera, coma y parte decimal ej.-2,78\n");
			  String s1 = teclado1.next();
			  System.out.println("Parte entera: "+ s1.substring(0,s1.length()-1)+ " parte decimal: "
					  + s1.substring(s1.length()-1,s1.length()));
			  
		}
}

