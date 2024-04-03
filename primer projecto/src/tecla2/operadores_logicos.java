package tecla2;

public class operadores_logicos {
	 public static void main(String[] args) {
System.out.println("Tabla Operador AND\n");
System.out.println("x	y	resultado");
System.out.println("true true"+ (true&&true));
System.out.println("true false"+ (true&&false));
System.out.println("false true"+ (false&&true));
System.out.println("false false"+ (false&&false));




	boolean b;
	int A=5, B=3, C=12;
    
	System.out.println(b = A>3);
	System.out.println(b = B!=C  );
	System.out.println(b = A*B==3);
	System.out.println(b = C/B==-4 );
	System.out.println(b = (A+B==8) && (A-B ==2));
	System.out.println(b = (A+B ==8) || (A-B ==6));
	
	
	int x=4, y=3;
	String texto = (x>y)?"x es mayor que y": "x no es mayor que y";
	System.out.println("Fin del programa" + texto);
	
	
	
	
		 
	 }

}
