package comparacion;

public class Articulo {
	String codArticulo;
	String descripcion;
	int cantidad;

	Articulo(String codArticulo, String descripcion, int cantidad) {
		this.codArticulo = codArticulo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;

	}

	public String getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(String codArticulo) {
		this.codArticulo = codArticulo;
	}

	public static void main(String[] args) {

	}
}
