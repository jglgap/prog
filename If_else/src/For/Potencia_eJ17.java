package For;

public class Potencia_eJ17 {
	public int elevar(int base, int exponente) {
		int resultado=1;
		for(;exponente>0;exponente--) {
			resultado=resultado*base;
		}
		return resultado;
	}
}
