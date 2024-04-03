package Polimorfismo;

public class Triangulo implements MiInterface {
	int base = 3;
	int altura = 5;

	@Override
	public void calcularArea() {
		System.out.println("area tri:" + base * altura);

	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub

	}

}
