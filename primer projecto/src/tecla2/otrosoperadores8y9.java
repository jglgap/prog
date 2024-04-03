package tecla2;

public class otrosoperadores8y9 {
	public static void main(String[] args) {
		int x=4, y=5;
		String xEnBinario=Integer.toBinaryString(x);
		System.out.println("Multiplicacion logica: " + Integer.toBinaryString(x)+ " and "
				+ Integer.toBinaryString(y)+ "=" + Integer.toBinaryString(x&y));
		System.out.println("Multiplicacon aritmetica" + Integer.toBinaryString(x)+ " * " + Integer.toBinaryString(y)+ "=" + Integer.toBinaryString(x*y));
		
		int i=10;
		System.out.println("Valor inicial de i: "+ i);
		i%=3;
		System.out.println("valor de i tras 1%=3 "+i);
		i>>=1;
		System.out.println("valor inical de i tras i>>=1 "+ i);
		i|=2;
		System.out.println("valor inical de i tras i|=2"+ i);
		
	}
}
