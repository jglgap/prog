package array;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		int [] arrayDuplicados= {1,2,3,4,1};
		Ej2 ej = new Ej2();
		int[] arraySinDuplicados= {1,2,3,4,5};
		ej.eliminardup(arrayDuplicados);
		
	}
	public int[] eliminardup(int[] array) {
		Arrays.sort(array);
		
		int length= array.length;
		int j=0;
		
		for(int i=0; i<length - 1;i++) {
			if(array[i] !=array[i+1]) {
				array[j++]= array[i];
			}
		}
		array[j++]= array[length - 1];
		int[] arraySinDuplicados= Arrays.copyOf(array, j);
		return arraySinDuplicados;
	}
	
}
