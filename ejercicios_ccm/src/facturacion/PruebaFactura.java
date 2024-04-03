package facturacion;
import java.util.Scanner;
public class PruebaFactura {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			Factura fact1= new Factura();
			 System.out.println("Factura\n"+"Pieza: "+fact1.getPieza()+"\n"+ "Descripcion: "+fact1.getDescripcion()+"\n"+
			"Cantidad: "+fact1.cantidad+"\n"+"Precio: "+fact1.precio+"\n"+ "Total: "+fact1.obtenerMontoFactura(fact1.getCantidad(), fact1.getPrecio()));
			 Factura fact2= new Factura (sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
			 System.out.println("Factura\n"+"Pieza: "+fact2.getPieza()+"\n"+ "Descripcion: "+fact2.getDescripcion()+"\n"+
						"Cantidad: "+fact2.cantidad+"\n"+"Precio: "+fact2.precio+"\n"+ "Total: "+fact2.obtenerMontoFactura(fact2.getCantidad(), fact2.getPrecio()));
	
		}

	}

}
