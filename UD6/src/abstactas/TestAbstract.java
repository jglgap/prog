package abstactas;

public class TestAbstract {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula();
        Libro libro = new Libro();
        System.out.println(pelicula.esAlquilable());
        System.out.println(libro.getPrecio());

	}

}
