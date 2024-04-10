package tareaObligatoriaUD8;

import java.util.ArrayList;

public class Cesta {
	private int idUsuario;
	private double importeTotal;
	private boolean descuento;
	private ArrayList<Producto> prod;
	public Cesta() {
	}

	public Cesta(int idUsuario, double importeTotal, boolean descuento) {
		this.idUsuario = idUsuario;
		this.importeTotal = importeTotal;
		this.descuento = descuento;
		this.prod= new ArrayList<>();
	}
	
	public void tieneDescuento() {
		if(this.descuento==true) {
			this.importeTotal=this.importeTotal-(this.importeTotal*0.05);
		}
	}

	
	
}
