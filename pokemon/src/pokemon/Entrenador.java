package pokemon;

import java.util.Scanner;
//ESTE ESTA BIEN
public class Entrenador {
	Scanner sc = new Scanner(System.in);
	private String nombre;
	Pokemon[] equipo = new Pokemon[5];

	// metodos

	public void crearEquipo() {

		for (int y = 0; y < 5; y++) {
			System.out.println("introduzca nombre del pokemon: " + (y + 1));
			Pokemon temp = new Pokemon();
			temp.generar();
			equipo[y] = temp;
		}
	}

	public void agregarPokemon() {
		Pokemon pok = new Pokemon();
		pok.generar();
		System.out.println("Elige la posicion en la que deseas colocar el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		if (posicion > 5 || posicion < 0) {
			System.out.println("Los valores tienen que ser entre 1 y 5 (incluidos) intente de nuevo ");
		} else {
			equipo[posicion - 1] = pok;
		}

	}

	public void eliminarPokemon() {
		System.out.println("Eliga la poscion en la que se encuentra el\n" + " pokemon que desea eliminar");
		int puesto = sc.nextInt();
		sc.nextLine();

		if (puesto > 5 || puesto < 0) {
			System.out.println("Los valores deben estar entre 1 y 5 (incluidos), intente de nuevo");
		} else {
			equipo[puesto - 1].nivel = 0;
			equipo[puesto - 1].tipo = "unknown";
			equipo[puesto - 1].vidaMaxima = 0;
			equipo[puesto - 1].setNombre("null");
		}
	}

	public void eliminarXnombre() {
		System.out.println("introduzca nombre del pokemon que desea eliminar: ");
		String nombre = sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre() != "null" && equipo[x].getNombre().equals(nombre)) {
				equipo[x].nivel = 0;
				equipo[x].tipo = "unknown";
				equipo[x].vidaMaxima = 0;
				equipo[x].setNombre("null");
			}
		}

	}

	public void mostrarEquipo() {
		System.out.println("/" + nombre + "\\");
		for (int x = 0; x < equipo.length; x++) {
			System.out.println(equipo[x]);
		}
	}



	public void curarConPocion() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			} else {
				if (posicion > 5 || posicion < 0) {
					System.out.println(
							"El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
				} else {
					equipo[posicion - 1].tomarPocion(0);
				}
			}
			break;
		}

	}

	public void reduccionVida() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			} else {
				if (posicion > 5 || posicion < 0) {
					System.out.println(
							"El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
				} else {
					equipo[posicion - 1].reducirVida(35);
				}
			}
			break;
		}
	}

	public void curacionCalculada() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			} else {
				if (posicion > 5 || posicion < 0) {
					System.out.println(
							"El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
				} else {
					equipo[posicion - 1].tomarPocion(0);
				}
			}
			break;
		}
	}

	public void sanado() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			} else {
				if (posicion > 5 || posicion < 0) {
					System.out.println(
							"El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
				} else {
					equipo[posicion - 1].sanarTotalmente();
				}
			}
			break;
		}
	}

	public void asgiPokemonFusion() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			} else {
				if (posicion > 5 || posicion < 0) {
					System.out.println(
							"El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
				} else {
					equipo[posicion - 1].asignarPokemonfusion();
				}
			}
		}

	}

	// getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
