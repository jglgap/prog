package composicionDeClases;

public class Principal {

	public static void main(String[] args) {

		Punto punto1 = new Punto(4, 5);
		Circulo circulo1 = new Circulo(punto1, 10);

		
		Circulo circulo2 = new Circulo(new Punto(20,20), 5);
		System.out.println(circulo1);
		System.out.println(circulo2);
	}

}
