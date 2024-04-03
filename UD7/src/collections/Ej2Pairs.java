package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej2Pairs {

	public void swapPairs(ArrayList<String> lista) {
		String s;
		for (int x = 0; x < lista.size() - 1; x += 2) {
			s = lista.get(x);
			lista.set(x, lista.get(x + 1));
			lista.set(x + 1, s);

		}
	}

	public static void main(String[] args) {
		Ej2Pairs p1 = new Ej2Pairs();
		ArrayList<String> lista= new ArrayList<>();
		lista.add("Hola");
		lista.add("Pepe");
		lista.add("chao");
		lista.add("Jose");
		System.out.println(lista);
		p1.swapPairs(lista);
		System.out.println(lista);
	}

}
