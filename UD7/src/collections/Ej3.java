package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej3 {


public void minToFront(ArrayList<Integer> lista) {
	int mind=0,
	mval= lista.get(mind);
	for(int x=1;x<lista.size();x++) 
		if(lista.get(x)<mval) {
			mind=x;
			mval= lista.get(mind);
		}
		if(mind>0) {
			lista.remove(mind);
			lista.add(0,mval);
		}
	
}

public static void main(String[] args) {
	Ej3 p1= new Ej3();
	ArrayList<Integer> lista= new ArrayList<>();
	lista.add(3);
	lista.add(8);
	lista.add(92);
	lista.add(4);
	lista.add(2);
	lista.add(17);
	lista.add(9);
	System.out.println(lista);
	p1.minToFront(lista);
	System.out.println(lista);
}
}
