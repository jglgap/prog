package recursividad;

public class Factorial {
	int calcularFactorial(int entero) {
		if(entero==0)
			return 1;
		else
			return entero*calcularFactorial(entero-1);
		
	}
	
}
