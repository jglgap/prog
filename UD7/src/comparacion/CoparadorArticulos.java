package comparacion;

import java.util.Comparator;

public class CoparadorArticulos implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		return o1.codArticulo.compareTo(o2.codArticulo);
	}

}
