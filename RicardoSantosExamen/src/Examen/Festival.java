package Examen;

public class Festival {
	private int idFest;
	private String nombre;
	private int aforo;
	private byte tipo;
	private float presupuesto;

	public int getIdFest() {
		return idFest;
	}

	public void setIdFest(int idFest) {
		this.idFest = idFest;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public byte getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}

	public float getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Festival(int idFest, String nombre, int aforo,byte tipo ,float presupuesto) {
		super();
		this.idFest = idFest;
		this.nombre = nombre;
		this.aforo = aforo;
		this.tipo = tipo;
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Festival [idFest=" + idFest + ", nombre=" + nombre + ", aforo=" + aforo + ", tipo=" + tipo
				+ ", presupuesto=" + presupuesto + "]";
	}

}
