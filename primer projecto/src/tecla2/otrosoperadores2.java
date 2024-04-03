package tecla2;

public class otrosoperadores2 {
public static void main(String[] args) {
	int x=16;
	int y=3;
	int total = x % y;
	System.out.println(total);
	System.out.println(x + (x%y==0?" es multiplo de " : " no es multiplo de") + y );
}
}
