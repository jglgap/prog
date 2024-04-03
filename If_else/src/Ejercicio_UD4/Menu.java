package Ejercicio_UD4;

import java.util.Scanner;

import Ejercicio_UD4.Empleado;

public class Menu {

	

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in) ;
		
		Empresa emp= new Empresa();
		Empleado trbj = new Empleado();
		
		System.out.println("CIF: ");
		emp.setCIF(teclado.nextLine());
		System.out.println("Nombre de la empresa: ");
		emp.setNombre(teclado.nextLine());
		System.out.println("Direccion: ");
		emp.setDireccion(teclado.nextLine());
		System.out.println("Numero de empleados: ");
		emp.setEmplNum(teclado.nextInt());
		teclado.nextLine();
		System.out.println(emp);
		System.out.println("========================================================================================");
		
	
		
		
		System.out.println("DNI del Trabajador: ");
		trbj.setDNI(teclado.nextLine());
		trbj.validaorDNI(trbj.getDNI());
		System.out.println("Nombre del trabajador: ");
		trbj.setNombre(teclado.nextLine());
		System.out.println("Apellidos del tabajador: ");
		trbj.setApes(teclado.nextLine());
		System.out.println("Lugar de nacimiento: ");
		trbj.setLugNac(teclado.nextLine());
		System.out.println("Edad del trabajador: ");
		trbj.setEdad(teclado.nextInt());
		trbj.validadorEdad(trbj.getEdad());
		
		System.out.println(trbj);
		System.out.println("========================================================================================");
	}

	

}
