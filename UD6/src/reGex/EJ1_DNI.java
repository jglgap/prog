package reGex;

public class EJ1_DNI {
public static void main(String[] args) {
	String dni= "46097647N";
	String dni2="57108758X";
	String dni3="4455Z4432";
	System.out.println("Valido o no: ");
	System.out.println("dni 1: "+dni.matches("([0-9]{1,8})([A-Za-z])"));
	System.out.println("dni 2: "+dni2.matches("([0-9]{1,8})([A-Za-z])"));
	System.out.println("dni 3: "+dni3.matches("([0-9]{1,8})([A-Za-z])"));
}
}
