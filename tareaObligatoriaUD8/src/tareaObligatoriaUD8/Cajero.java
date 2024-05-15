package tareaObligatoriaUD8;

import java.util.ArrayList;

public class Cajero {
	private ArrayList<Cesta> ces;

	
	public Cajero() {
		this.ces = new ArrayList<>();

	}

	public void añadirCesta(Cesta c) {
		ces.add(c);

	}

	public void eliminarCesta(int pos) {
		ces.remove(pos);
	}

	@Override
	public String toString() {
		return "Cajero [ces=" + ces + "]";
	}
	
}
