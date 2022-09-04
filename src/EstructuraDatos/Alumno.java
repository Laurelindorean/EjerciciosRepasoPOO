package EstructuraDatos;

import java.util.Comparator;

public class Alumno implements Comparator<Alumno> {

	private String nombre;
	private String apellido;
	private String edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Alumno() {

	}

	public Alumno(String nombre, String apellido, String edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
