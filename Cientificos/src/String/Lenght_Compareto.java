package String;

public class Lenght_Compareto {

	public static void main(String args[]){
		 String str1= new String("hola");
		 String str2= "Adios";
		 System.out.println("la cadena " +str1 + " tiene una longitud: " + str1.length());
		 System.out.println("la cadena " +str2 + " tiene una longitud: " + str2.length());
		 if(str1.compareTo(str2)!=0)
		 System.out.println("la cadena " +str1 + " es diferente a " + str2);
		 }
}
