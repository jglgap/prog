package sociedadCultural;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CentroCultural CC = new CentroCultural();
		int opcion = 0;
		while (opcion !=8) {

			System.out.println("Elija la opcion que desea realizar" + "\n1.Dar de alta Libro" + "\n2.Dar de alta Disco"
					+ "\n3.Dar de alta cliente" + "\n4.Mostrar info. Centro cultural"+"\n5.Realizar prestamo"+"\n6.Mostrar prestamos"+"\n7.Comparar libros" + "\n8. Salir del programa");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
				case 1:
					CC.añadirLibro();
					System.out.println("Libro añadido");
					break;
				case 2:
					CC.añadirDisco();
					System.out.println("Disco añadido");
					break;
				case 3:
					CC.añadirCliente();
					System.out.println("Cliente añadido");
					break;
				case 4:
					CC.mostrar();
					break;
				case 5:
					CC.rellenarPrestamo();
					break;
				case 6:
					CC.mostrarPrestamos();
					break;
				case 7:
					CC.compararLibros();
					break;
				case 8: 
					System.out.println("Chao Chao Chao");
					break;
			}
		}

	}

}
