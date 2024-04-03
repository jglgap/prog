package polimorfismo3;

public class Triangulo extends Figura {
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;

	}

	double base;
	double altura;

	@Override
	public double area() {
		return (base * altura) / 2;
	}

	@Override
	public String toString() {
		return "base: " + base + " altura: " + altura + super.toString();
	}
}
