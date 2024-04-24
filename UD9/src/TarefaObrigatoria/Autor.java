package TarefaObrigatoria;

import java.sql.SQLException;

import javax.sql.RowSet;

public class Autor {

	private int idAutor;
	private String dni;
	private String apellidos;
	private String Nombre;

	public Autor(int idAutor, String dni, String apellidos, String nombre) {

		this.idAutor = idAutor;
		this.dni = dni;
		this.apellidos = apellidos;
		this.Nombre = nombre;
	}

	public Autor() {
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String varchar) {
		this.dni = varchar;
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

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", dni=" + dni + ", apellidos=" + apellidos + ", Nombre=" + Nombre + "]";
	}

	
	
}
