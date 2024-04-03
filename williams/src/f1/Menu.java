package f1;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Escuderia esc = new Escuderia();
		esc.alta(sc);
		System.out.println(esc);
		System.out.println(esc.getNombre());

	}
}
