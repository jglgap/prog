package This;

public class Circulo {
	int coordenadaX;
	 int coordenadaY;
	 int radio;
	 Circulo elMayor(Circulo c){
	 if(radio>c.radio){ //o también if(this.radio>c.radio)
	 return this;
	 }else{
	 return c;
	 }
	 }
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	} 
}
