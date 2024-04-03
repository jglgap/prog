package Polimorfismo;

public class Cuadrado implements MiInterface {
	int lado = 4;

	@Override
	public void calcularArea() {
		System.out.println("area cuadrado:" + lado * lado);

	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub

	}

}
