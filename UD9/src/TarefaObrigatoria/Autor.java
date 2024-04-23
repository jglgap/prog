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
		this.dni = this.validarDni(dni);
		this.apellidos = apellidos;
		Nombre = nombre;
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
	
	public String validarDni(String dni) {
		if(dni.length()!=9 || !dni.matches(".*[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L]")){
			return "DNI incorrecto";
		}else {
			System.out.println("DNI correcto");
			return dni;
		}
		
	}
}
