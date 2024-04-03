package hotelPerrruno;

public class HotelTest {

	public static void main(String[] args) {

		Hotel h1 = new Hotel();

		// Crear perro comunes
		Perro p1 = new Perro("Cotton", 5.20, "Marron");
		Perro p2 = new Perro("Rocky", 3.20, "Negro y marron");
		Perro p3 = new Perro("Persi", 2.30, "Negro");
		Perro p4 = new Perro("Cuzz", 4.15, "Blaco");
		Perro p5 = new Perro("Atlas", 5.64, "Negro y blanFco");

		// Crear perros con alimentracion especial
		PerroRaro pr1 = new PerroRaro("Bobby", 3.5, "Negro");
		PerroRaro pr2 = new PerroRaro("Mars", 4.2, "Marron");
		PerroRaro pr3 = new PerroRaro("Kira", 2.5, "Blanca");
		PerroRaro pr4 = new PerroRaro("Ruby", 3.3, "Amarillo");
		PerroRaro pr5 = new PerroRaro("Poby", 5.7, "Amarillo y marron");

		// Meter los perros dentro del array
		h1.recibirPerros(p1);
		h1.recibirPerros(p2);
		h1.recibirPerros(p3);
		h1.recibirPerros(p4);
		h1.recibirPerros(p5);

		h1.recibirPerroRaro(pr1);
		h1.recibirPerroRaro(pr2);
		h1.recibirPerroRaro(pr3);
		h1.recibirPerroRaro(pr4);
		h1.recibirPerroRaro(pr5);

		// cambiar el peso segun lo que se desea hacer

		h1.alimentarTodos();
		h1.alimentarTodosRaros();
		h1.pasearTodos();
		h1.pasearTodosRaros();

		// mostar los perros que estan en el hotel
		h1.verAlojados();
		h1.verPRalojados();

	}

}
