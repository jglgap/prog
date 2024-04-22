package TarefaObrigatoria;

public class Autor {
	
	private int idAutor;
	private String varchar;
	private String apellidos;
	private String Nombre;
	
	public Autor(int idAutor, String varchar, String apellidos, String nombre) {
		
		this.idAutor = idAutor;
		this.varchar = varchar;
		this.apellidos = apellidos;
		Nombre = nombre;
	}

	public Autor() {}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getVarchar() {
		return varchar;
	}

	public void setVarchar(String varchar) {
		this.varchar = varchar;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
}
