package Ejercicio_UD4;

public class Validador {
	public String validaorDNI(String DNI){
		
		do{if(DNI.length()==9 && DNI.matches(".*[A-Z]")) {
			System.out.println("DNI correcto");
		}else {
			System.out.println("DNI incorrecto");
		}
		
		}while(DNI.length()!=9);
		return DNI;
	}
}
