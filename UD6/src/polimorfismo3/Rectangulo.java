package polimorfismo3;

public class Rectangulo extends Figura {
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	double base;
	double altura;

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public String toString() {
		return "base: " + base + " altura: " + altura + super.toString();
	}
}
