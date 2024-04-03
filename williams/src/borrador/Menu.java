package borrador;

import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	GP_LasVegas nuevoPremio = new GP_LasVegas();
	Escuderia esc=new Escuderia();
	int caso;
	while(true) {
		System.out.println("Elige la operacion que deseas realizar:"
	                           +"\n1-Generar escuderia"
	                           +"\n2-Generar parrilla del GP"
	                           +"\n3-Acabar el programa");
	caso=sc.nextInt();
	switch (caso) {
		case 1: 
			esc.generarEscuderia(sc);
			System.out.println(esc);
			break;
		case 2:
			nuevoPremio.creacionParticipantes(sc);
			System.out.println(nuevoPremio);
		case 3:
			System.exit(0);
			break;
	}
	}
}
}
