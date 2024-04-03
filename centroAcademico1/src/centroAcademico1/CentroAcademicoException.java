package centroAcademico1;

import java.util.Date;
import java.util.Arrays;

public class CentroAcademicoException {
	String mensaje;
	Date fecha;

	public CentroAcademicoException(String msj, Date date)  {
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
