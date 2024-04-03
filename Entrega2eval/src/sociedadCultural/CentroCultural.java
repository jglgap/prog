package sociedadCultural;

import java.util.Scanner;

public class CentroCultural {
	Discos[] disks = new Discos[15];
	Libros[] books = new Libros[15];
	Cliente[] client = new Cliente[5];

	public void añadirCliente() {// Añade un cliente al arrray
		Cliente temp = new Cliente();
		temp.altaCliente();
		for (int x = 0; x < client.length; x++) {
			if (client[x] == null) {
				client[x] = temp;
				break;
			}
		}
	}// final metodo

	public void añadirLibro() {// añade un libro al array
		Libros temp = new Libros();
		temp.darAltaMaterial();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = temp;
				break;
			}
		}
	}// final metodo

	public void añadirDisco() {
		Discos temp = new Discos();
		temp.darAltaMaterial();
		for (int d = 0; d < disks.length; d++) {
			if (disks[d] == null) {
				disks[d] = temp;
				break;
			}
		}
	}// final metodo

	public void revisarCliente() {
		for (int y = 0; y < client.length; y++) {
			System.out.println(client[y]);
		}
	}// final metodo

	public void mostrarLibros() {
		for (int t = 0; t < books.length; t++) {
			System.out.println(books[t]);
		}
	}// final metodo

	public void mostrarDiscos() {
		for (int k = 0; k < disks.length; k++) {
			System.out.println(disks[k]);
		}
	}// final metodo

	public void mostrar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.-Mostar cliente\t2.-Mostrar discos\t3.-Mostrar libros");
		int caso = Integer.parseInt(sc.nextLine());
		switch (caso) {
			case 1:
				this.revisarCliente();
				break;
			case 2:
				this.mostrarDiscos();
				break;
			case 3:
				this.mostrarLibros();
				break;
		}

	}// final metodo

	public Cliente buscarDni() {
		System.out.println("Introduzca dni");
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < client.length; x++) {
			if (client[x].dni.equals(sc.nextLine())) {
				System.out.println();
				return client[x];
			} 
		}
		return null;
	}// final metodo

	public Materiales buscaBook() {
		System.out.println("Introduzca codigo");
		Scanner sc = new Scanner(System.in);
		int temp=Integer.parseInt(sc.nextLine());
		for (int x = 0; x < books.length; x++) {
			if (books[x].cod_identificativo == temp) {
				return books[x];
			}
		}
		return null;
	}//final metodo

	public Materiales buscarDisk() {
		System.out.println("Introduzca codigo");
		Scanner sc = new Scanner(System.in);
		int temp=Integer.parseInt(sc.nextLine());
		for (int x = 0; x < disks.length; x++) {
			if (disks[x].cod_identificativo == temp) {
				System.out.println();
				return disks[x];
			}
		}
		return null;
	}//final metodo

	public void rellenarPrestamo() {

		Scanner sc = new Scanner(System.in);
		Cliente c = this.buscarDni();
		Prestamo p = new Prestamo();
		System.out.println("1-Libros\t2-Discos");
		int op = Integer.parseInt(sc.nextLine());
		
		switch (op) {
			case 1:
				p.crearPrestamo(c, this.buscaBook());
				for (int i = 0; i < c.prestamoLibros.length; i++) {
					if (c.prestamoLibros[i] == null) {
						c.prestamoLibros[i] = p;
						break;
					}
				}
				break;
			case 2:
				p.crearPrestamo(c, this.buscarDisk());
				for (int i = 0; i < c.prestamoDiscos.length; i++) {
					if (c.prestamoDiscos[i] == null){
						c.prestamoDiscos[i] = p;
						break;
					}
				}
				break;
		}
	}// final metodo
	
	public void mostrarPrestamos() {
		Scanner sc= new Scanner(System.in);
		Cliente c = this.buscarDni();
		System.out.println("1-Libros\t2-Discos");
		int opc = Integer.parseInt(sc.nextLine());		
		switch(opc) {
			case 1: 
				for(int x=0; x<client.length;x++) {
					if(client[x]!=null) {
					for(int y=0;y<client[x].prestamoLibros.length;y++) {
						System.out.println(client[x].prestamoLibros[y]);
					}
					}
					
				}
				break;
			case 2:
				for(int z=0;z<client.length;z++) {
					if(client[z]!=null) {
					for(int k=0;k<client[z].prestamoDiscos.length;k++) {
						System.out.println(client[z].prestamoDiscos[k]);
					}
					}
				}
				break;
		}
		
	}//final metodo

	public void compararLibros(){
		Libros l1;
		Libros l2;
		l1=(Libros) this.buscaBook();
		l2=(Libros) this.buscaBook();
		if(l1.equals(l2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("Son distintos");
		}
	}//finalMetodo

}// final clase
