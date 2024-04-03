package mapas;

public class CoordenadasEj1 {

	private String latitud;
	private String longitud;

	@Override
	public String toString() {
		return " latitud= " + latitud + " longitud= " + longitud;
	}

	public CoordenadasEj1(String platitud, String plongitud) {
		this.latitud = platitud;
		this.longitud = plongitud;
	}

}
