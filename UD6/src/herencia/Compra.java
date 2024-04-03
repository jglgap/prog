package herencia;

public class Compra {
	public static void main(String[] args) {
		// Ordenador ord= new Ordenador();
		Portatiles port = new Portatiles();
		port.setProcesador("Intel i5");
		port.setRAM(16);
		port.setPeso(1);
		System.out.println(port.getPeso());
		System.out.println(port.getProcesador());
	}
}
