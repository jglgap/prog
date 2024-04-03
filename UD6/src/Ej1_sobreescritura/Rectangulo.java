package Ej1_sobreescritura;

public class Rectangulo extends Figura{

	public Rectangulo(double a, double b) {
		super(a, b);
		
	}

	double calcularArea () {
		System.out.println("El area es:"  );
		return dim1*dim2;
		
	}
}
