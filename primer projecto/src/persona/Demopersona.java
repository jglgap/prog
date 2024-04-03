package persona;

public class Demopersona {

	public static void main(String[] args) {
		//ejercicio 1 variables referencia
		Persona p1 = new Persona();
		p1.nombre=" Ana";
		p1.edad= 3;
		

		Persona p2 = new Persona();
		p2.nombre= "David";
		p2.edad=5;
		
		
		System.out.println("persona asociada a p1"+p1);
		System.out.println("persona asociada a p2"+p2);
		
		// ejercicio 2
		
		Persona temp;

		temp=p1;
		p1=p2;
		p2=temp;
		
		System.out.println("persona asociada a p1:\t"+p1);
		System.out.println("persona asociada a p2:\t"+p2);
	}

}
