package hotelPerrruno;

public class Hotel {

	private String nombre;
	Perro[] perros = new Perro[5];
	PerroRaro[] perrete = new PerroRaro[5];

	// metodos para introducir perro en los arrays
	public void recibirPerroRaro(PerroRaro temp) {
		temp.registrar();
		for (int x = 0; x < perrete.length; x++) {
			if (perrete[x] == null) {
				perrete[x] = temp;
				break;
			}
		}
	}

	public void recibirPerros(Perro temp2) {
		temp2.registrar();
		for (int i = 0; i < perros.length; i++) {
			if (perros[i] == null) {
				perros[i] = temp2;
				break;
			}
		}

	}

	// metodos para mostrar los arrays
	public void verAlojados() {
		System.out.println("Perros alojados: ");
		for (int i = 0; i < perros.length; i++) {
			System.out.println((i + 1) + "-" + perros[i]);
			
		}
	}

	public void verPRalojados() {
		System.out.println("Perro especiales alojados");
		for (int x = 0; x < perrete.length; x++) {
			System.out.println((x + 1) + "-" + perrete[x]);
		}
	}
	//metodo para alimentar perros
	public void alimentarTodos() {
		for(int i=0; i<perros.length; i++) {
			perros[i].alimentar();
		}
	}
	public void alimentarTodosRaros() {
		for(int x=0; x<perrete.length;x++) {
			perrete[x].alimentar();
		}
	}
	
	//metodo para pasear perros
	public void pasearTodos() {
		for(int i=0; i<perros.length; i++) {
			perros[i].pasear();
		}
	}
	public void pasearTodosRaros() {
		for(int x=0; x<perrete.length;x++) {
			perrete[x].pasear();
		}
	}
	
}
