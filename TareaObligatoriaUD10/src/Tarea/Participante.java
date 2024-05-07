package Tarea;

public class Participante {
	private String nombre;
	private String apellidos;
	private String sexo;
	private int edad;
	private String categoria;

	public Participante(String nombre, String apellidos, String sexo, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		this.categoria = calcularCategoria(this.edad);
	}

	public Participante() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	private String calcularCategoria(int edad) {
		if (edad < 8) {
			setCategoria("Benjamin");
		} else if (edad >= 8 && edad <= 10) {
			return "Alevin";
		} else if (edad > 10 && edad <= 12) {
			return "Infantil";
		} else if (edad > 12 && edad <= 14) {
			return "Cadete";
		} else if (edad > 14 && edad <= 18) {
			return "Xuvenil";
		} else if (edad > 18 && edad <= 30) {
			return "Senior";
		}
		return null;

	}

}
