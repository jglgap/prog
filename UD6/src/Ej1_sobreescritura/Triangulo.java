package Ej1_sobreescritura;

public class Triangulo extends Figura{

	public Triangulo(double a, double b) {
		super(a, b);
		
	}
@Override
double calcularArea() {
	System.out.println("el area es:");
	return (dim1*dim2)/2;
}
}
