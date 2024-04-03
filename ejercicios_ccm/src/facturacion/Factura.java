package facturacion;

public class Factura {
	String pieza;
	String descripcion;
	int cantidad;
	double precio;
	
	
	//Constructors
	
	Factura (){
		this.pieza="x";
		this.descripcion="--";
		this.cantidad=0;
		this.precio=0;
		
	}
	Factura (String pieza, String descrip, int cant, double precio){
		this.pieza = pieza;
		this.descripcion= descrip;
		this.cantidad= cant;
		this.precio= precio;
	}
	
	//Method
	double obtenerMontoFactura (int cantidad, double precio) {
		
		double monto = cantidad*precio;
		return monto;
		
	}
	
	//setters & getters

	public String getPieza() {
		return pieza;
	}


	public void setPieza(String pieza) {
		this.pieza = pieza;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
