package Tareas;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Empleado nuevoEmpleado = new Empleado();
		Scanner teclado = new Scanner(System.in);
		Empresa nuevoTrabajo = new Empresa();
		int caso;

		while (true) {

			System.out.println(
					"Bienvenido al menu de altas\n Seleccione la opcion que desea:\n Opcion 1:Alta\t Opcion 2:Datos del empleado\t opcion3: Cadena\t opcion4:Cerrar programa");
			caso = teclado.nextInt();
			teclado.nextLine();
			switch (caso) {

				case 1:

					nuevoEmpleado.nuevoTrabajador(teclado);
					System.out.println(nuevoEmpleado.toString());

					nuevoEmpleado.recogerEmpleado();
					break;

				case 2:
					System.out.println(nuevoEmpleado);
					break;

				case 3:
					System.out.println(
							"Introducir los datos de la siguiente manera:45666783L&Juan&Lopez&45&Ourense%A80192727&Los hermanos S.L.&Calle Principal 5, Lugo&22");
					String frase = teclado.nextLine();
					Scanner limit = new Scanner(frase);
					limit.useDelimiter("%");
					nuevoEmpleado.limitador(limit.next(), limit.next());

					System.out.println("Empleado: " + nuevoEmpleado);
					break;
				case 4:
					System.out.println("Programa cerrado");
					System.exit(0);
					break;
				default:
					break;
			}

		}

	}
}
