package herencia;

public class Portatiles extends Ordenador{

	private int peso;
	
	public Portatiles() {
		System.out.println("soy portatil");
	}
	public Portatiles(String procesador2, int ram2) {
		super(procesador2, ram2);
	
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
