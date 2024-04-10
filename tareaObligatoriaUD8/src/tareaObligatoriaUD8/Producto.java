package tareaObligatoriaUD8;

public class Producto {
	private String identificador;
	private String descripcion;
	private double precio;

//hacer un try cath grande dento del construct
		public Producto(String identificador, String descripcion, double precio) {
			try{
				if(this.checkPrecio(precio) && this.validadorId(identificador)){
				this.identificador=identificador;
				this.precio=precio;
				this.descripcion=descripcion;
				}
			}catch(ExceptionValorPrecio e) {
				e.mensajeException();
			}catch(ExceptionId e){
				e.mensajeException();
			}
		}
	
	

	public Producto() {
	}

	public boolean  checkPrecio(double precio) throws ExceptionValorPrecio{
		if(precio<0) {
		throw new ExceptionValorPrecio();
		}
		return true;
			
	}//final de metodo

	public boolean validadorId(String id) throws ExceptionId {
		if(!id.matches("^[A|B|C]-\\d{4}$")) {
			throw new ExceptionId();
		}else {
			return true;
		}
	}//final metodo



	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
}
