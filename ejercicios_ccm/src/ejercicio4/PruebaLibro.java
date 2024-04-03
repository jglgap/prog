package ejercicio4;
import java.util.Scanner;
public class PruebaLibro {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce los datos de un libro de la siguiente forma: ISBN:Autor:Titulo:Páginas");
		String str1=sc.nextLine();
		
		Scanner teclado = new Scanner(str1);
		teclado.useDelimiter(":");
		Libro lbr = new Libro();
		Libro lbr2 = new Libro();
		String isbn_tem = teclado.next();
		lbr2.setISBN(Integer.parseInt(isbn_tem));
	
		lbr2.setAutor(teclado.next());
		lbr2.setTitulo(teclado.next());
		String numPagTemp=teclado.next();
		lbr2.setNumPag(Integer.parseInt(numPagTemp)); 
		lbr.comparar(lbr2);
		System.out.println(lbr);
		System.out.println(lbr2);
		
		
	}

}
