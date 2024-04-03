package pokemon;

import java.util.Scanner;

public class Entrenador {
	Scanner sc = new Scanner(System.in);
	private String nombre;
	Pokemon[] equipo = new Pokemon[5];


	// metodos

	public void crearEquipo() {
		
		for (int y = 0; y < 5; y++) {
			System.out.println("introduzca nombre del pokemon: "+ (y+1));
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
			equipo[puesto-1].tipo="unknown";
			equipo[puesto-1].vidaMaxima=0;
			equipo[puesto-1].setNombre("null");
		}
	}

	public void eliminarXnombre() {
		System.out.println("introduzca nombre del pokemon que desea eliminar: ");
		String nombre = sc.nextLine();
		for (int x = 0; x < equipo.length; x++) {
			if (equipo[x].getNombre()!="null"&& equipo[x].getNombre().equals(nombre)) {
				equipo[x].nivel = 0;
				equipo[x].tipo="unknown";
				equipo[x].vidaMaxima=0;
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
	public void tabla(Pokemon[][] lista) {
		int[][] contador = new int[5][4];
		int contadorSquirtle = 0;
		int contadorBulbasur = 0;
		int contadorCharmander = 0;
		int contadorPikachu = 0;

		for (int x = 0; x < lista.length; x++) {
			for (int i = 0; i < lista[x].length; i++) {
				if (lista[x][i].tipo.equals("Squirtle")) {
					contadorSquirtle++;
				} else if (lista[x][i].tipo.equals("Bulbasur")) {
					contadorBulbasur++;
				} else if (lista[x][i].tipo.equals("Charmander")) {
					contadorCharmander++;
				} else if (lista[x][i].tipo.equals("Pikachu")) {
					contadorPikachu++;
				}
				contador[i][0] = contadorSquirtle;
				contador[i][1] = contadorBulbasur;
				contador[i][2] = contadorCharmander;
				contador[i][3] = contadorPikachu;
				contadorSquirtle = 0;
				contadorBulbasur = 0;
				contadorCharmander = 0;
				contadorPikachu = 0;
			}

			System.out.println("\t\t Squirtle\t Bulbasaur\tCharmander\t Pikachu");
			for (int i = 0; i < contador.length; i++) {

				for (int j = 0; j < contador[i].length; j++) {
					System.out.print("\t\t" + contador[i][j]);
				}
				System.out.println();
			}
			System.out.println();
	}
	}
	public void curarConPocion() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for(int x=0;x<equipo.length;x++) {
		if(equipo[x].getNombre().equals("null")) {
			System.out.println("No existe, no se puede modificar");
			return;
		}else{
			if (posicion > 5 || posicion < 0) {
				System.out.println("El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
			} else {
				equipo[posicion - 1].tomarPocion(0);
			}
			}
		}
	
	}

	public void reduccionVida() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for(int x=0;x<equipo.length;x++) {
			if(equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			}else {
				if (posicion > 5 || posicion < 0) {
					System.out.println("El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
				} else {
					equipo[posicion - 1].reducirVida(0);
				}
			}
		}
	}

	public void curacionCalculada() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for(int x=0;x<equipo.length;x++) {
			if(equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			}else {
		if (posicion > 5 || posicion < 0) {
			System.out.println("El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
		} else {
			equipo[posicion - 1].tomarPocion(0);
		}
			}
		}
	}

	public void sanado() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for(int x=0;x<equipo.length;x++) {
			if(equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			}else {
		if (posicion > 5 || posicion < 0) {
			System.out.println("El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
		} else {
			equipo[posicion - 1].sanarTotalmente();
		}
			}
		}
	}

	public void asgiPokemonFusion() {
		System.out.println("Elige la posicion en la que se encuentra el pokemon");
		int posicion = sc.nextInt();
		sc.nextLine();
		for(int x=0;x<equipo.length;x++) {
			if(equipo[x].getNombre().equals("null")) {
				System.out.println("No existe, no se puede modificar");
				return;
			}else {
		if (posicion > 5 || posicion < 0) {
			System.out.println("El valor introducido no se encuentra entre los puestos posible, intente de nuevo");
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
