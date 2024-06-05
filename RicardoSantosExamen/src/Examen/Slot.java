package Examen;


public class Slot {
	private int idSlot;
	private String dia;
	private int franja;
	private int idGrupo;

	public Slot(int idSlot, String dia, int franja, int idGrupo) {
		super();
		this.idSlot = idSlot;
		this.dia = dia;
		this.franja = franja;
		this.idGrupo = idGrupo;
	}

	public Slot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdSlot() {
		return idSlot;
	}

	public void setIdSlot(int idSlot) {
		this.idSlot = idSlot;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getFranja() {
		return franja;
	}

	public void setFranja(int franja) {
		this.franja = franja;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Override
	public String toString() {
		return "Slot [idSlot=" + idSlot + ", dia=" + dia + ", franja=" + franja + ", idGrupo=" + idGrupo + "]";
	}

}
