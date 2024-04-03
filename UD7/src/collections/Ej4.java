package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ej4 {
	public void markLength4(List<String> lista) {
		ListIterator<String> it = lista.listIterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.length() == 4) {
				it.set("****");
				it.add(s);
			}
		}
	}
	public static void main(String[] args) {
		Ej4 p1 = new Ej4();
		List<String> lista =new ArrayList<>();
		lista.add("this");
		lista.add("is");
		lista.add("lots");
		lista.add("of");
		lista.add("fun");
		lista.add("for");
		lista.add("every");
		lista.add("java");
		lista.add("programmer");
		System.out.println(lista);
		p1.markLength4(lista);
		System.out.println(lista);
	}
}