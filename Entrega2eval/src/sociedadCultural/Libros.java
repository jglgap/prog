package sociedadCultural;

import java.util.Objects;
import java.util.Scanner;


public class Libros extends Materiales {

	int num_paginas;
	@Override
	public int hashCode() {
		return Objects.hash(num_paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return (num_paginas == other.num_paginas && titulo.equals(other.titulo)) ;
	}

	String localizacion;
	Scanner sc = new Scanner(System.in);

	@Override
	public void darAltaMaterial() {
		System.out.println("Introduzca codigo identificativo");
		this.cod_identificativo = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca titulo del libro: ");
		this.titulo = sc.nextLine();
		System.out.println("Introduzca autor del Libro: ");
		this.autor = sc.nextLine();
		System.out.println("Numero de paginas del libro: ");
		this.num_paginas = Integer.parseInt(sc.nextLine());
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
		return " ID del libro: " + this.cod_identificativo + " Numero de paginas del libro: " + this.num_paginas + "\n"
				+ " Titulo del libro: " + this.titulo + " Autor del libro: " + this.autor + " Localizacion del libro: "
				+ this.localizacion;
	}
}
