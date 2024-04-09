package tareaObligatoriaUD8;

public class Producto {
	private String identificador;
	private String descripcion;
	private double precio;

//hacer un try cath grande dento del construct
		public Producto(String identificador, String descripcion, double precio) {
		super();
		this.identificador = validadorId(identificador) ;
		this.descripcion = descripcion;
		this.precio = checkPrecio(precio);
		}
	
	

	public Producto() {
	}

	public double checkPrecio(double precio) {
	if(precio<0) {
		System.out.println("el precio no puede ser menor que 0");
	}
	return this.precio;
	}//cierre de metodo

	public String validadorId(String id) {
		if(!id.matches("^[A|B|C]-\\d{4}$")) {
			System.out.println("el id del producto es incorrecto");
		}else {
			System.out.println("el formato del identificador es correcto");
			
		}
		return identificador;
		
	}
}
