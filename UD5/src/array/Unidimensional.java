package array;

public class Unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String [] semana ={"lunes", "martes", "miercoles"};
 System.out.println(semana[0]);

 int [] numbers= {5,3,9,2,8};
 for(int i=0;i<numbers.length;i++) {
System.out.println(numbers[i]);	 
 }
 
 int [] numero= {5,3,9,2,8};
 int i=0;
 while(i<numero.length) {
	 System.out.println(numero[i]);
	 i++;
 }
 int[] ar1 = {3,7,8,9};
 int[] ar2 = ar1;
 ar2 [2] = 99;
 for ( int i1 : ar1){ System.out.print(i1);}	 
 }
}
