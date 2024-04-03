package ordenador;

public class Memoria {
	private int capacidad;
	static final String tipo="DDr4";
	private int velocidad;

	public Memoria(int capacidad, String tipo ,int velocidad) {

		if (capacidad >= 2) {
			this.capacidad = capacidad;
		} else {
			this.capacidad = 2;
		}
	
		this.velocidad = velocidad;
	}

}
