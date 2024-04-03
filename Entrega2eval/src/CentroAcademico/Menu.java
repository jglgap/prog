package CentroAcademico;

import java.util.Date;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CentroAcademico CA = new CentroAcademico();
		int option = 0;
		while (option != 9) {
			System.out.println("◆".repeat(60));
			System.out.println("Elige la opcion deseada:");
			System.out.println("1-Crear un alumno\t 2-Crear una asignatura \t3-Matricular\n"
					+ "4-Mostrar asignatura\t 5-Mostrar alumno\t 6-Mostrar alumnos\n " + "7-Añadir calificacion\n"
					+ "8-Comparar alumnos\t 9-Salir");
			System.out.println("◆".repeat(60));
			option = sc.nextInt();
			switch (option) {
				case 1:
					CA.crearAlumno("12345678N", "Jose Martinez");
					CA.crearAlumno("87654321T", "Antonio Bermudez");
					CA.crearAlumno("33333333n", "Manuel Perez");
					// CA.mostrarAlumno();
					break;

				case 2:
					CA.crearAsignatura("A-111", "Matematicas", "51");
					CA.crearAsignatura("B-222", "Dibujo tecnico", "2");
					CA.crearAsignatura("c-653", "Fisica", "4");
					CA.crearAsignatura("C-367", "Fisica", "8");
					// CA.mostraAsignatura();
					break;
				case 3:
					CA.matricular("12345678N", "A-111");
					CA.matricular("87654321T", "A-111");
					CA.matricular("12345678N", "B-222");
					CA.matricular("87654321T", "B-222");
				case 4:
					try {
						CA.imprimirAsignatura("C-367");
					} catch (CentroAcaException ex) {
						System.out.println(ex);
					}

					try {
						CA.imprimirAsignatura("A-111");
					} catch (CentroAcaException ex) {
						System.out.println(ex);
					}

					break;
				case 5:
					CA.imprimirAlumno("12345678N");

					break;
				case 6:

					CA.imprimirAlumnos();
					break;

				case 7:
					CA.agreagarCalificacion("12345678N", "A-111", 2.5);
					CA.agreagarCalificacion("12345678N", "B-222", 5);
					CA.agreagarCalificacion("87654321T", "A-111", 7);
					CA.agreagarCalificacion("87654321T", "B-222", 3);
					CA.imprimirAlumno("12345678N");
					CA.imprimirAlumno("87654321T");
					break;
				case 8:
					CA.compararAlumno("12345678N", "87654321T");
					break;
				case 9:
					System.out.println("chao chao chao");
					break;
					
			}

		}

	}
}
