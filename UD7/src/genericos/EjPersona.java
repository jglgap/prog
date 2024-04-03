package genericos;

public class EjPersona {
String nombre;

public EjPersona(String nombre) {
	super();
	this.nombre = nombre;
}

@Override
public String toString() {
	return "EjPersona [nombre=" + nombre + "]";
}

}
