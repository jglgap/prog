package herencia;

public class Sobremesa extends Ordenador {

	 private String tipoCaja;

	 public Sobremesa() {
		System.out.println("Soy sobremesa");
	}
	public Sobremesa(String procesador2, int ram2) {
		super(procesador2, ram2);
		System.out.println("soy sobremesa");
	}
	 	
	
}
