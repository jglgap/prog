package polimorfismo4;

public abstract class Tripulante {
	int numCarnet;
	GPS posicionGps;
	int edad;
	int tiempoEnEmpresa;
	String nombre;
	String telefono;
	char sexo;
	Barco barco;
	public abstract void sueldo();
	public abstract void mostrarDatos();
}
