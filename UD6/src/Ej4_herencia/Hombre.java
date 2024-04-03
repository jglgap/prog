package Ej4_herencia;

public class Hombre extends Persona {
	public Hombre(int edad, boolean hizoMili) {
		super(edad);
		this.hizoMili = hizoMili;
		// TODO Auto-generated constructor stub
	}

	private boolean hizoMili;

	public boolean isHizoMili() {
		return hizoMili;
	}

	public void setHizoMili(boolean hizoMili) {
		this.hizoMili = hizoMili;
	}

}
