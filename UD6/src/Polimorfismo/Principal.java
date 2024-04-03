package Polimorfismo;

public class Principal {
	public static void main(String[] args) {
		MiInterface tri = new Triangulo();
		MiInterface cua = new Cuadrado();
		tri.calcularArea();
		cua.calcularArea();
	}

}
