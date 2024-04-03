package reGex;

public class Ej2_ip {
public static void main(String[] args) {
	String ip="0.1.2.3";
	String ip2="255.255.255.255";
	String ip3="9.234.1.199";
	String ip4="0.1.2.";
	String ip5="0.1.2.3.";
	String ip6="256.1.2.3";
		
		System.out.println("valido o no: ");
		System.out.println("ip 1: "+ ip.matches(""));
	
}
}
