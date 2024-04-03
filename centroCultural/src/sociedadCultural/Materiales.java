package sociedadCultural;

import java.util.Scanner;

public abstract class Materiales {

	int cod_identificativo;
	String titulo;
	String autor;
	String estanteria;
	String altura;
	

	public abstract void darAltaMaterial();


	public String getEstanteria() {
		return estanteria;
	}


	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}


	public String getAltura() {
		return altura;
	}


	public void setAltura(String altura) {
		this.altura = altura;
	}



	


}
