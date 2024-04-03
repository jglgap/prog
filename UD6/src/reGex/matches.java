package reGex;

public class matches {
	
public static void main(String[] args) {
	

	 String str = new String("Welcome to Tutorialspoint.com");

     System.out.print("Return Value :" );
     System.out.println(str.matches("(.*)Tutorials(.*)"));

     System.out.print("Return Value :" );
     System.out.println(str.matches("Tutorials"));

     System.out.print("Return Value :" );
     System.out.println(str.matches("Welcome(.*)"));
     
     
}}