package CentroAcademico;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;


public class CentroAcademico implements Aplicables{
	HashMap<String, Asignatura> asignaturas = new HashMap<>();
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
		Asignatura temp = new Asignatura();
		temp.setCodigo(pCodigo);
		temp.setNombre(pNombre);
		temp.setCreditos(pCreditos);
		while (temp.checkCodigo(pCodigo)) {
			if (asignaturas.containsKey(pCodigo)) {
				System.out.println("No es posible crear esa materia, \n ya que existe una misma con ese codigo");
				return false;
			} else {
				asignaturas.put(temp.getCodigo(), temp);
				System.out.println("Asignatura creada correctamente");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean matricular(String expediente, String codigo) {

		if (!this.comprobarExistenciaAlumno(expediente) | !this.comprobarExistenciaAsignatura(codigo)) {

			return false;
		}
		Alumno al;
		Asignatura as;
		System.out.println("Añadiendo asignaturas");
		as = asignaturas.get(codigo);
		al = alum.get(expediente);
		al.asignaturas.add(as);
		as.alumno.add(al);

		return true;

	}

	@Override
	public void imprimirAsignatura(String codigo) throws CentroAcaException {

		if (this.asignaturas.get(codigo).alumno.size() != 0) {

			this.asignaturas.get(codigo).mostrar();
			System.out.println("total de alumnos: " + this.asignaturas.get(codigo).alumno.size());

		} else {
			throw new CentroAcaException("No hay alumnos matriculados en la asignatura", new Date());
		}
	}

	@Override
	public void imprimirAlumno(String expediente) {
		Alumno al = alum.get(expediente);
		al.mostrarCalif();

	}

	@Override
	public void imprimirAlumnos() {

		Collection<Alumno> alumnos = alum.values();

		for (Alumno alumno : alumnos) {
			alumno.mostrarCalif();
		}

	}
	

	@Override
	public boolean agreagarCalificacion(String expediente, String codigo, double calificacion) {

		Alumno al = alum.get(expediente);
		Calificacion cal = new Calificacion();
		cal.setNota(calificacion);
		cal.setAsig(asignaturas.get(codigo));
		al.calificaion.add(cal);
		return true;

	}

	@Override
	public void compararAlumno(String expediente1, String expedeinte2) {
		Alumno a1=alum.get(expediente1);
		Alumno a2=alum.get(expedeinte2);
		
		if(a1.calcularNotaMedia()==a2.calcularNotaMedia()) {
			System.out.println("Las medias son iguales");
		}else if(a1.calcularNotaMedia()>a2.calcularNotaMedia()) {
			System.out.println("La nota media del primero es mas grande que la del segundo");
		}else if(a1.calcularNotaMedia()<a2.calcularNotaMedia()){
			System.out.println("La nota del segundo es mayor a la del primero");
		}
			
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

	public boolean comprobarExistenciaAsignatura(String codigo) {

		alum.get(codigo);

		if (asignaturas.containsKey(codigo)) {
			System.out.println("La asignatura con codigo: " + codigo + " ya existe");
			return true;
		} else {
			System.out.println("No exite ninguna aignatura con ese codigo");
			return false;
		}
	}




	



	}
