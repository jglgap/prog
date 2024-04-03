package conjuntos;

import java.util.Iterator;
import java.util.Set;

public class ej1 {

	public int maxLength(Set<String> set) {
		int max = 0;
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			max = Math.max(max, it.next().length());

		return max;

	}
	
	public boolean hasOdd(Set<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
				if(it.next()%2!=0)
					return true;
		
		return false;
	}
}
