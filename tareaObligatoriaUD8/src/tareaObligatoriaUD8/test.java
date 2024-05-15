package tareaObligatoriaUD8;

public class test {

	public static void main(String[] args) {
		Producto p1= new Producto("B-4561","Pan",4.5);
		//System.out.println(p1);
		Producto p2= new Producto("C-4563","Bread",5);
		//System.out.println(p2);
		Producto p3= new Producto("A-5891","Corn",2);
		//System.out.println(p3.toString());
		
		
		Cesta c1= new Cesta(1);
		c1.añadirProducto(p1);
		c1.añadirProducto(p2);
		System.out.println(c1);
		
		Cesta c2= new Cesta(2); 
		c2.añadirProducto(p2);
		c2.añadirProducto(p3);
		System.out.println(c2);
		
		Cesta c3= new Cesta(3);
		c3.añadirProducto(p2);
		c3.añadirProducto(p2);
		System.out.println(c3);
		
		System.out.println("-".repeat(6));
		c1.calcularPrecio();
		System.out.println(c1);
		c2.calcularPrecio();
		System.out.println(c2);
		c3.calcularPrecio();
		System.out.println(c3);
		c3.tieneDescuento();
		System.out.println(c3);
		
		System.out.println("-".repeat(6)+ "\n");
		Cajero caja= new Cajero();
		caja.añadirCesta(c1);
		caja.añadirCesta(c2);
		caja.eliminarCesta(0);
		System.out.println(caja);
		
		
	}

}
