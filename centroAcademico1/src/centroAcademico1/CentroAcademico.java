package centroAcademico1;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;



public class CentroAcademico implements Aplicables{
	HashMap<String, Calificacion> calific = new HashMap<>();
	TreeMap<String, Alumno> alum = new TreeMap<>();
	
	@Override
	public boolean crearAlumno(String Expediente, String nombre) {
		Alumno temp = new Alumno();
		temp.setNumExpediente(Expediente);
		temp.setNombre(nombre);

		while (temp.checkExpediente(Expediente)) {
			if (alum.containsKey(Expediente)) {
				System.out.println("No es posible, se repite el expediente");
				return false;
			} else {
				alum.put(temp.numExpediente, temp);
				System.out.println("Se ha creado correctamente el alumno");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean crearAsignatura(String pCodigo, String pNombre, String pCreditos) {
		
		return false;
	}

	@Override
	public boolean matricular(String expediente, String codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void imprimirAsignatura(String codigo) throws CentroAcaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirAlumno(String expediente) {
		Alumno al= alum.get(expediente);
		al.mostrar();
		
	}

	@Override
	public void imprimirAlumnos() {
		Collection<Alumno> alumnos= alum.values();
		 
		for (Alumno alumno : alumnos) {
				alumno.mostrar();
		}// TODO Auto-generated method stub
		
	}

	@Override
	public boolean agreagarCalificacion(String expediente, String codigo, double calificacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void compararAlumno() {
		// TODO Auto-generated method stub
		
	}
	public boolean comprobarExistenciaAlumno(String expediente) {
		alum.get(expediente);

		if (alum.containsKey(expediente)) {
			System.out.println("El alumno con el expediente: " + expediente + " ya existe");
			return true;
		} else {
			System.out.println("No existe un alumno con ese expediente");
			return false;
		}
	}
}
