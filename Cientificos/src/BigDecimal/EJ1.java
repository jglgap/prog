package BigDecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class EJ1 {
	public static void main(String[] args) {
		
	
	BigDecimal numero1 = new BigDecimal("10.7");
	BigDecimal numero2 = new BigDecimal("5.4");
	
	BigDecimal sumarnum1ynum2= numero1.add(numero2);
	BigDecimal restarnum1ynum2= numero1.subtract(numero2);
	BigDecimal multiplicarnum1ynum2= numero1.multiply(numero2);
	BigDecimal dividirnum1ynum2 = numero1.divide(numero2, 7, RoundingMode.DOWN);
	System.out.println("El BigDecimal 1: "+ numero1);
	System.out.println("El BigDecimal 2: "+ numero2+"\n");
	System.out.println("Numero1 + Numero2: "+sumarnum1ynum2);
	System.out.println("Numero1 - Numero2: "+ restarnum1ynum2);
	System.out.println("Numero1 * Numero2: "+ multiplicarnum1ynum2);
	System.out.println("Numero / Numero2: "+ dividirnum1ynum2);
	
}
}