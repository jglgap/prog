	package pokemon;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Entrenador blaine = new Entrenador();
		blaine.setNombre("Blaine");
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("♦".repeat(50));
		System.out.println("♦Bienvenido a pokemon, para empezar esta aventura♦\n"
				+ "♦   primero empieza creando tu equipo pokemon!   ♦");
		System.out.println("♦".repeat(50));
		blaine.crearEquipo();
		while (opcion != 11) {
			System.out.println("");
			System.out.println("##\tDebes saber que antes de poder añadir un nuevo pokemon a tu lista primero debes eliminar uno\t##");
			System.out.println("##\tEl rango del equipo esta entre 1-5\t##");
			System.out.println("");
			System.out.println("1.-Agregar pokemon a equipo\n"
					+ "2.-Eliminar pokemon de equipo\t 3.-Eiminar pokemon por su nombre\n"
					+ "4.-Mostrar equipo\t 5.-Curar pokemon con pocion\n"
					+ "6.-Reponer vida del pokemon\t 7.-Pocion de porcentaje\n"
					+ "8.-Reducir vida\t 9.-Fusion\t 10.-Ver tabla equipos\n11.Salir");
			System.out.println("");
			opcion = sc.nextInt();
	
			switch (opcion) {
				case 1:
					System.out.println("Introduzca nombre del pokemon");
					blaine.agregarPokemon();
					break;
				case 2:
					blaine.eliminarPokemon();
					break;
				case 3:
					blaine.eliminarXnombre();
					break;
				case 4:
					blaine.mostrarEquipo();

					break;
				case 5:
					blaine.curarConPocion();
					break;
				case 6:
					blaine.sanado();
					break;
				case 7:
					blaine.curacionCalculada();
					break;
				case 8:
					blaine.reduccionVida();
					break;
				case 9:
					blaine.asgiPokemonFusion();
					break;
				
				case 10:

					Pokemon[][] lista = new Pokemon[5][4];
					//FUNCIONA, PERO LAS TABLAS VAN A TENER SIEMPRE EL MISMO EQUIPO
					//PORQUE SOLO ESTOY CREANDO EL MISMO ENTRENADOR
					//PARA QUE LAS TABALAS FUERAN DISTINTAS, EN VEZ DE HACER UN FOR
					//TENDRIA QUE INICIAR EN EL LISTA[0] UN ENTRENADOR, EN LISTA[1] OTRO Y ASI CONSECUTIVAMENTE
					for(int x=0;x<5;x++) {	
					lista[x] = blaine.equipo;
					}
					
						int[][] contador = new int[5][4];
						int contadorSquirtle = 0;
						int contadorBulbasur = 0;
						int contadorCharmander = 0;
						int contadorPikachu = 0;

						for (int x1 = 0; x1 < lista.length; x1++) {
							for (int i = 0; i < lista[x1].length; i++) {
								if (lista[x1][i].tipo.equals("Squirtle")) {
									contadorSquirtle++;
								} else if (lista[x1][i].tipo.equals("Bulbasur")) {
									contadorBulbasur++;
								} else if (lista[x1][i].tipo.equals("Charmander")) {
									contadorCharmander++;
								} else if (lista[x1][i].tipo.equals("Pikachu")) {
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
					break;
				case 11:
					System.out.println("Nos vemos en la proxima aventura entrenador.");
					break;
		}
			
		}
	}
	}
