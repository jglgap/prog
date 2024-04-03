package tryCatch;

public class ej1 {
	public static void main(String[] args){
		int[] x= {0,1,2,3,4};
		try {
			x[5]=5;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No es posible meter nada en x[5]");
		}
		System.out.println("El programa se recupera de la excepción y continua");
		}
}
