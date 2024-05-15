package tareaObligatoriaUD8;

import java.util.ArrayList;

public class Cesta {
	private int idUsuario;
	private double importeTotal;
	private boolean descuento;
	private ArrayList<Producto> prod;
	public Cesta() {
	}

	public Cesta(int idUsuario ) {
		this.idUsuario = idUsuario;
		this.prod= new ArrayList<>();
	}
	
	public boolean tieneDescuento() {
		this.importeTotal=this.importeTotal-(this.importeTotal*0.05);
		return descuento;
	}
	
	public double calcularPrecio() {
		double almacenable=0;
		for(int i = 0; i<prod.size(); i++){
			 almacenable = almacenable+prod.get(i).getPrecio();
		}
		this.importeTotal= almacenable;
		return this.importeTotal;
		
	}
	
	public void añadirProducto(Producto p) {
		prod.add(p);
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Cesta [idUsuario=" + idUsuario + ", importeTotal=" + importeTotal + ", descuento=" + descuento
				+ ", prod=" + prod + "]";
	}
	
	  
	
	
}
