package constructor;

public class MiClase {
	int x;
	public MiClase() {
	System.out.println("Ini...");
	 x = 0;
	}
	public MiClase(int entrada) {
		System.out.println("Ini 2...");
		x=entrada;
	}
	
	public static void main(String[] args){
		MiClase mi = new MiClase();
		System.out.println(mi.x);
		
		MiClase mi2= new MiClase(4);
		System.out.println(mi2.x);
				
}
}
