package herencia;

public class Ordenador {
	private String procesador;
	private int RAM;

	public Ordenador() {
		System.out.println("");
	}

	public Ordenador(String procesador2, int ram2) {
		this.setProcesador(procesador2);
		this.setRAM(ram2);
	}

	// getters&setters
	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

}
