package sociedadCultural;

import java.util.Scanner;

public class Discos extends Materiales {
	Scanner sc = new Scanner(System.in);
	String localizacion;
	private String discografia;
	Scanner entrada = new Scanner(System.in);

	@Override
	public void darAltaMaterial() {
		System.out.println("Introduzca codigo identificativo: ");
		this.cod_identificativo = Integer.parseInt(entrada.nextLine());
		System.out.println("Introduzca titulo del disco: ");
		this.titulo = entrada.nextLine();
		System.out.println("Introduzca autor del disco: ");
		this.autor = entrada.nextLine();
		System.out.println("Nombre de la discografia que hizao el disco: ");
		this.discografia = entrada.nextLine();
		System.out.println("Introduzca localizacion del libro");
		System.out.println("Inroduzca altura");
		String pos = sc.nextLine();
		System.out.println("Introduzca estanteria");
		String pos2 = sc.nextLine();
		this.estanteria = pos;
		this.altura = pos2;
		this.localizacion = this.getEstanteria() + "-" + this.getAltura();
	}

	@Override
	public String toString() {
		return "ID del disco: " + this.cod_identificativo + " Nombre de la discografia:" + this.discografia + "\n"
				+ " Titulo del disco: " + this.titulo + " Autor del disco: " + this.autor + " Localizacion del disco:"
				+ this.localizacion;
	}

}
