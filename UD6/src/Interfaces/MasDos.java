package Interfaces;

public class MasDos implements Serie{

	int inicio;
	int val;
	MasDos(){
		inicio=0;
		val=0;	
	}
	
	@Override
	public int obtenerSiguiente() {
		val+=2;
		return val;
	}

	@Override
	public void restablecer() {
		inicio=0;
		val=0;
		
	}

	@Override
	public void establecerInicio(int x) {
		inicio=x;
		val=x;
		
	}

}
