package Examen;

public class Grupo {
	private int idGrupo;
	private String nombre;
	private float cache;
	private String tipo;

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCache() {
		return cache;
	}

	public void setCache(float cache) {
		this.cache = cache;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Grupo(int idGrupo, String nombre, float cache, String tipo) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.cache = cache;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", nombre=" + nombre + ", cache=" + cache + ", tipo=" + tipo + "]";
	}

}
