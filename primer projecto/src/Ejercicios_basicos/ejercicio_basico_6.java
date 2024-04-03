package Ejercicios_basicos;

public class ejercicio_basico_6 {
	public static void main(String[] args) {
	
		boolean b1= true || true ;
		boolean b2= true || false;
		boolean b3= false || true;
		boolean b4= false || false;
		System.out.println("false	||	fasle= "+ b4);
		System.out.println("false	||	true= "+ b3);
		System.out.println("true	||	false=  "+ b2);
		System.out.println("true	||	true= "+ b1);
}
}
