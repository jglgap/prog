package For;

public class Ej_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("decimal\tbinario\thexadecimal\toctal");
		for(int i=0;i<=127;i++) {
			System.out.print( i+"\t");
			
			System.out.println(i+"\t"+Integer.toBinaryString(i)+"\t"+Integer.toHexString(i)+"\t"+Integer.toOctalString(i));
		}
	}

}
