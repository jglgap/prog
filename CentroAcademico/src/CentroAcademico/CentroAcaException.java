package CentroAcademico;

import java.util.Date;
import java.util.Arrays;

public class CentroAcaException extends Exception {

	String mensaje;
	Date fecha;

	public CentroAcaException(String msj, Date date) {
		this.fecha = date;
		this.mensaje = msj;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return mensaje + " , " + fecha;
	}

}
